package first.Rest.Entities;

public class User {
private int userId;
private String userName;
private String userEmail;
private String userPassword;
private long userMobile;
private int userPincode;
private String userAddress;
public User() {
	super();
	// TODO Auto-generated constructor stub
}


public User(int userId, String userName, String userEmail, String userPassword, long userMobile, int userPincode,
		String userAddress) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userEmail = userEmail;
	this.userPassword = userPassword;
	this.userMobile = userMobile;
	this.userPincode = userPincode;
	this.userAddress = userAddress;
}




public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}




public long getUserMobile() {
	return userMobile;
}


public void setUserMobile(long userMobile) {
	this.userMobile = userMobile;
}


public int getUserPincode() {
	return userPincode;
}


public void setUserPincode(int userPincode) {
	this.userPincode = userPincode;
}


public String getUserAddress() {
	return userAddress;
}


public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}


@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
			+ userPassword + ", userMobile=" + userMobile + ", userPincode=" + userPincode + ", userAddress="
			+ userAddress + "]";
}



}
