package Actions;

import model.User;

import DAO.IUserDAO;
import DAO.UserDAO;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegistAction extends ActionSupport {
	private User user;
	private String repassword;
	IUserDAO udao = new UserDAO();
	
	public String execute()
	{
		User u = new User();
		u.setUserName(user.getUserName());
		u.setUserPWD(user.getUserPWD());
		udao.saveUser(u);
		
		return SUCCESS;
	}
	
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getRepassword() {
		return repassword;
	}
}
