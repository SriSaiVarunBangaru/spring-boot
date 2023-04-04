package com.spring.Service;

import java.util.List;

import com.spring.Model.UserModel;

public interface UserService {
	
	public void SaveUser(UserModel userModel);
	public List<UserModel> SaveUsers(List<UserModel> userModel);
	
	
	public List<UserModel>GetUsers();
	public UserModel GetUsersById(int id);
	
	
	public String DeleteUserById(int id);

}
