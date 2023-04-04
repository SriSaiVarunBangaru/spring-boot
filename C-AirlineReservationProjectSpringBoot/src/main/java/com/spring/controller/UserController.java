package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.UserService;

@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public String getlogin(){
		return "Hello Welcome to Airline Reservation System";
	}
	
	
	 @RequestMapping(value="/user",method=RequestMethod.POST)
	 public void getaddUser(@RequestBody User user) {
		 
		 userService.addUser(user); 
		 
		 }
	 
	 
	@RequestMapping("/user1")
	public List<User> getAllUsers()
	{
		List<User> user=userService.getAllUsers();
		return user;
	}
	
	@RequestMapping("/user/{id}")
	public User getUserById(@PathVariable("id") int id)
	{
       User user= userService.fetchUserById(id);
		return user;
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable("id") int id) {
		
		userService.deleteUserById(id);
		
	}
	
	/*
	 * @PostMapping("/booking") public void getAddUserBookingDetails() {
	 * userService. }
	 */
	

}
