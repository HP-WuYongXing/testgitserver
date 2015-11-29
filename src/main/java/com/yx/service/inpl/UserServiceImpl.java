package com.yx.service.inpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yx.model.User;
import com.yx.model.UserInfo;
import com.yx.model.UserTemp;
import com.yx.service.UserService;
import com.yx.tool.Base64Utils;
import com.yx.tool.RSAUtils;
import org.apache.commons.codec.binary.*;
import com.yx.dao.*;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserTemp userStatusCache = new UserTemp();
	
	@Autowired
	private UserMapper userMapper;
	
	public UserServiceImpl(){
		
	}

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public int getCountByUserName(String name) {
	    return userMapper.countByUserName(name);
	}

	public int insert(User user) {
		byte[] bytes=null;
		  try{
			  System.out.println("privatekey: "+userStatusCache.getPrivateKey());
			  System.out.println("password: "+user.getPassword());
			  byte[]passwdOfBytes =Base64Utils.decode(user.getPassword());
			  bytes = RSAUtils.decryptByPrivateKey(passwdOfBytes, userStatusCache.getPrivateKey());
			  String md5pw = new String(bytes,"UTF-8");
			  System.out.println("md5pw: "+md5pw);
			 user.setPassword(md5pw);
			 return userMapper.insert(user);
		  }catch(Exception e){
			  e.printStackTrace();
			  return -1;
		  }
	}

	public String getPublicKey() {
		String publickey = null;
		try {
			Map<String, Object>keyMap = RSAUtils.genKeyPair();
			publickey = RSAUtils.getPublicKey(keyMap);
			String privateKey = RSAUtils.getPrivateKey(keyMap);
			System.out.println("init userStatusCache - private key:"+ privateKey);
			userStatusCache.setPrivateKey(privateKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return publickey;
	}
}
