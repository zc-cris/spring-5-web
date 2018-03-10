package com.zc.cris.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zc.cris.services.UserService;

public class UserAction {
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute() {
		userService.say();
		return "success";
	}
	
}
