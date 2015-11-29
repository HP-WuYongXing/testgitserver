package com.yx.service;

import java.util.List;

import com.yx.model.User;


public interface UserService {

	User getUserById(int id);
	int  getCountByUserName(String name);
	int insert(User user);
	String getPublicKey();
}
