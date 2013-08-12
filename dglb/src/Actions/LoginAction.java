package Actions;
import model.User;
import DAO.*;

import com.opensymphony.xwork2.ActionSupport;;
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private User user;
	private IUserDAO  udao = new UserDAO();
	public String execute() throws Exception
	{	
		TestDAO tes = new TestDAO();
		//tes.test();
		//User ur = udao.getUser("mjx");
		if(udao.isValidUser(user.getUserName(),user.getUserPWD()))
		{
			addActionMessage("mjx");
			return SUCCESS;
		}
		else
		{
			addActionMessage("failed");
			return ERROR;
		}
	}
	
	public User getUser()
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
}
