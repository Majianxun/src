package model;

public class User extends BaseModel {
	
	private String userName;
	private String userPWD;
	private int userId;
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}
	public String getUserPWD() {
		return userPWD;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}
	

}
