package com.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Model.UserModel;
import com.spring.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void SaveUser(UserModel userModel) {
		
		userRepository.save(userModel);
		
	}

	@Override
	public List<UserModel> SaveUsers(List<UserModel> userModel) {
		
		return userRepository.saveAll(userModel);
	}
	
	

	@Override
	public List<UserModel> GetUsers() {
		List<UserModel>userModel= userRepository.findAll();
		return userModel;
	}

	@Override
	public UserModel GetUsersById(int id) {
		UserModel userModel=userRepository.findById(id).get();
		return userModel;
	}

	
	@Override
	public String DeleteUserById(int id) {
		userRepository.deleteById(id);
		return "Id is removed"+id;
	}


	
	
	
	
	
	


	
	


	

}
