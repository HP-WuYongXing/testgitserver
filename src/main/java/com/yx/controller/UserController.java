package com.yx.controller;

import java.util.List;

import com.yx.model.User;
import com.yx.model.UserInfo;
import com.yx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		User user = userService.getUserById(userId);
		System.out.println(user);
		modelMap.addAttribute("userInfo", user);
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	@ResponseBody
	public  Object showUserInfos(){
		List<UserInfo> userInfos = null;
		return userInfos;
	}
}

