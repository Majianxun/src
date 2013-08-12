package DAO;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Interceptor;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
	private static Log log = LogFactory.getLog(HibernateUtil.class);
	
	private static final String INTERCEPTOR_CLASS="hibernate.util.interceptor_class";
	
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	
	static
	{
		try{
			configuration = new Configuration();
			configuration.configure();
			
			String interceptorName = configuration.getProperty(INTERCEPTOR_CLASS);
			if(interceptorName != null)
			{
				Class interceptorClass = HibernateUtil.class.getClassLoader().loadClass(interceptorName);
				Interceptor interceptor = (Interceptor)interceptorClass.newInstance();
				configuration.setInterceptor(interceptor);				
			}
			
			if(configuration.getProperty(Environment.SESSION_FACTORY_NAME)!=null)
			{
				configuration.buildSessionFactory();
			}
			else
			{
				sessionFactory = configuration.buildSessionFactory();
			}
		}
		 catch(Throwable ex)
		 {
			 log.error("building sessionfactory failed", ex);
			 ex.printStackTrace();
			 throw new ExceptionInInitializerError(ex);
		 }
	}
	
	public static Configuration getConfiguration()
	{
		return configuration;
	}
	
	public static SessionFactory getSessionFactory()
	{
		SessionFactory sf = null;
		String sfName = configuration.getProperty(Environment.SESSION_FACTORY_NAME);
		if(sfName != null)
		{
			log.debug("Looking Up sessionFactory in JNDI");
			try{
				sf=(SessionFactory) new InitialContext().lookup(sfName);
			}
			catch(NamingException ex)
			{
				throw new RuntimeException(ex);
			}
		}
		else
		{
			sf=sessionFactory;
		}
		if(sf == null)
		{
			throw new IllegalStateException("SessionFactory not available");
		}
		return sf;
	}
	
	public static void shutdown()
	{
		getSessionFactory().close();
		configuration = null;
		sessionFactory = null;
	}
	
	public static void rebuildSessionFactory()
	{
		log.debug("using current Configuration for rebuild");
		rebuildSessionFactory(configuration);
		
	}

	public static void rebuildSessionFactory(Configuration cfg) {
		// TODO Auto-generated method stub
		synchronized(sessionFactory)
		{
			if(sessionFactory != null && !sessionFactory.isClosed())
				sessionFactory.close();
			if(cfg.getProperty(Environment.SESSION_FACTORY_NAME)!=null)
				cfg.buildSessionFactory();
			else
				sessionFactory = cfg.buildSessionFactory();
			configuration = cfg;			
		}
	}
	
	public static SessionFactory registerInterceptorAndRebuild(Interceptor interceptor)
	{
		configuration.setInterceptor(interceptor);
		rebuildSessionFactory();
		return getSessionFactory();
	}
	public static Interceptor getInterceptor()
	{
		return configuration.getInterceptor();
	}
	
	public static void commitAndBeginTransaction()
	{
		sessionFactory.getCurrentSession().getTransaction().commit();
		sessionFactory.getCurrentSession().beginTransaction();
	}
}
