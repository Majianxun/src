package DAO;
import java.util.List;
import org.hibernate.Session;
public class hibernateDAO {
	public Session getCurrentSession()
	{
		return HibernateUtil.getSessionFactory().openSession();
	}
	
	public void saveObject(Object obj)
	{
		getCurrentSession().save(obj);
	}
	public void updateObject(Object obj)
	{
		getCurrentSession().update(obj);
	}
	public void deleteObject(Object obj)
	{
		getCurrentSession().delete(obj);
	}
	public Object getObject(String hsql)
	{
		return getCurrentSession().createQuery(hsql).uniqueResult();
	}
	public <T> T getObject(Class<T> cls,String id)
	{
		Object obj = getCurrentSession().get(cls,id);
		return (T)obj;
	}
	public List<?> getObjects(String hsql)
	{
		return getCurrentSession().createQuery(hsql).list();
	}
}
