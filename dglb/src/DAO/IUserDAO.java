package DAO;

import model.User;

public interface IUserDAO {
	public User getUser(String name);
	public void saveUser(User user);
	public Boolean isValidUser(String name, String pwd);
}
