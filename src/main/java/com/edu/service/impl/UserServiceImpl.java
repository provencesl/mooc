package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.User_infoMapper;
import com.edu.pojo.User_info;
import com.edu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private User_infoMapper user_mapper;
	
	//获取所有用户列表
	public List<User_info> getAllUsers(){
		return user_mapper.getAllUsers();
	}
	//学生登陆
	public boolean checkLogin(String username, String password){
		User_info user =user_mapper.selectByUsername(username);
		if(username==null||"".equals(username)||password==null||"".equals(password))
			return false;
		if(user!=null&&password.equals(user.getUserpwd())){
			return true;
		}
		return false;
	}
	//注册学生
	public int insertUser(User_info user){
		return user_mapper.insert(user);
	}
	
	public User_info selectByUsername(String name){
		return user_mapper.selectByUsername(name);
}



}
