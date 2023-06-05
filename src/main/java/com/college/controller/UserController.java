package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.UserTable;
import com.college.pojo.ApiResponse;
import com.college.repository.UserTableRepo;

@RestController
public class UserController {
	@Autowired
	public UserTableRepo userTable;
	@PostMapping("user")
	 public ApiResponse data (@RequestParam int userId,@RequestParam String userName,@RequestParam String lastName,@RequestParam long mobileNumber) {
	UserTable user = new UserTable();
	
	user.setUserId(userId);
	user.setUserName(userName);
	user.setUserLastName(lastName);
	user.setMobileNumber(mobileNumber);
	userTable.save(user);
		ApiResponse api= new ApiResponse();
		api.setData(user);
		api.setSuccess(true);
		return api;
	}
	

}
