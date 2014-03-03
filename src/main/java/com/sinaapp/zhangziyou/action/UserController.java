package com.sinaapp.zhangziyou.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinaapp.zhangziyou.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = { "/login", "/ulogin" })
	public String login() {

		return "login";

	}

	

}
