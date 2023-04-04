package com.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Model.UserModel;
import com.spring.Service.UserService;
import com.spring.Model.UserModel;



@RestController
@RequestMapping("/Start")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void SAVEUser(@RequestBody UserModel userModel) {
		userService.SaveUser(userModel);
	}
	
	@RequestMapping(value="/save1",method=RequestMethod.POST)
	public List<UserModel> SAVEUsers(@RequestBody List<UserModel> userModel) {
		return userService.SaveUsers(userModel);
	}
	
	@RequestMapping("fetch")
	public List<UserModel> GETUsers(){
		return userService.GetUsers();	
	}
	
	@RequestMapping("/fetch/{id}")
	public UserModel getUserById(@PathVariable("id") int id)
	{
       UserModel userModel= userService.GetUsersById(id);
		return userModel;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomerById(@PathVariable("id") int id) {
		return userService.DeleteUserById(id);
	}
	

}
