package com.spring.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Info")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int Id;
	String Username;
	String Password;
	
	
	public UserModel() {
		super();
	}


	public UserModel(int id, String username, String password) {
		super();
		Id = id;
		Username = username;
		Password = password;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "UserModel [Id=" + Id + ", Username=" + Username + ", Password=" + Password + "]";
	}
	
	
	

}
