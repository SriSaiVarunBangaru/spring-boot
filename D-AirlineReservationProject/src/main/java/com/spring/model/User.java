package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	private String userAddress;
	private String userEmail;
	private String userEnterPassword;
	
	public User() {
		
	}
	
	
	public User(int userId, String userName, String userAddress, String userEmail, String userEnterPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userEnterPassword = userEnterPassword;
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
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserEnterPassword() {
		return userEnterPassword;
	}
	public void setUserEnterPassword(String userEnterPassword) {
		this.userEnterPassword = userEnterPassword;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userEmail="
				+ userEmail + ", userEnterPassword=" + userEnterPassword + "]";
	}
	
	
	
	
	
	

}
