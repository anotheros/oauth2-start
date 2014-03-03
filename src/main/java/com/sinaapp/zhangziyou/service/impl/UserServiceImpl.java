package com.sinaapp.zhangziyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinaapp.zhangziyou.dao.UserDao;
import com.sinaapp.zhangziyou.pojo.po.UserEntity;
import com.sinaapp.zhangziyou.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean isExistUserById(String userId) {
		return userDao.existUserById(userId)>=1;
	}

	@Override
	public boolean isExistcheckUri(String uri) {
		return userDao.existUri(uri)==1;
	}

	@Override
	public boolean isExistcheckUserUri(String userId) {
		String uri = userDao.getUriByUserId(userId);
		if(uri==null||uri.isEmpty()){
			return false;
		}else{
			return true;
		}
	}

	@Override
	@Transactional
	public Boolean updateUserUri(String uri, String userId) {
		if(!isExistcheckUserUri(userId)){
			UserEntity userEntity = new UserEntity();
			userEntity.setUri(uri);
			userEntity.setUserId(userId);
			return userDao.updateUriByUserId(userEntity)==1;
		}else{
			return false;
		}
	}

	@Override
	public UserEntity getUserEntityByEmail(String email) {
		return userDao.getUserByEmail( email);
	}

	@Override
	public UserEntity getUserEntityByUserId(String userId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(userId);
	}
}
