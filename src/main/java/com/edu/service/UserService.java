package com.edu.service;

import java.util.List;

import com.edu.pojo.User_info;

public interface UserService {

	List<User_info> getAllUsers();
	boolean checkLogin(String username, String password);
	int insertUser(User_info user);
	//User_info getUserByUserName(String name);
	User_info selectByUsername(String name);
}
