package DAO;

import model.User;

public class UserDAO extends hibernateDAO implements IUserDAO {

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		User u = null;
		try{
		 u = (User)getObject("from User u where u.userName = '"+name+"'");
		}
		catch(Exception ex)
		{
			return null;
		}
		return u;
	}

	@Override
	public void saveUser(User user) {
		if(user == null) return;
		super.saveObject(user);		
	}

	@SuppressWarnings("null")
	@Override
	public Boolean isValidUser(String name, String pwd) {
		// TODO Auto-generated method stub
		User ur =null;
		try{
			ur = getUser(name);
		}
		catch(Exception ex)
		{
			return false;
		}
		if(ur == null || !ur.getUserPWD().equals(pwd))
			return false;
		return true;
	}

}
