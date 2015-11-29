package com.yx.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yx.model.BooleanResultEntity;
import com.yx.model.KeyEntity;
import com.yx.model.RegisterEntity;
import com.yx.model.User;
import com.yx.service.UserService;
import com.yx.tool.JsonUtils;
import com.yx.tool.RSAUtils;

@Controller
@RequestMapping(value="/authorize",method = RequestMethod.GET)
public class AuthorizeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	@ResponseBody
	public String registerUserName(String username){
		System.out.println("register user name...:"+username);
		int count = userService.getCountByUserName(username);
		RegisterEntity re = new RegisterEntity();
		JsonUtils<RegisterEntity> ju = new JsonUtils<RegisterEntity>();
		
		if(count>0){
			re.setDuplicate(1);
		}else{
			re.setDuplicate(0);
			String publicKey = userService.getPublicKey();
			re.setPublickey(publicKey);
		}
	    return ju.getJSONFromObject(re);
	}
	
	@RequestMapping(value="/savepw",method=RequestMethod.POST)
	@ResponseBody
	public String savePassword(@RequestBody User user){
	    System.out.println(user);
		int resultCode = userService.insert(user);
		BooleanResultEntity resultEntity = new BooleanResultEntity();
		JsonUtils<BooleanResultEntity>ju = new JsonUtils<BooleanResultEntity>();
		if(resultCode>=0){
			resultEntity.setResult(true);
		}else{
			resultEntity.setResult(false);
		}
		return ju.getJSONFromObject(resultEntity);
	}
	
}
