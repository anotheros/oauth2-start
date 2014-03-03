package com.sinaapp.zhangziyou.service;

import com.sinaapp.zhangziyou.pojo.po.UserEntity;

import com.sinaapp.zhangziyou.pojo.po.UserEntity;

import com.sinaapp.zhangziyou.pojo.po.UserEntity;


/**
 * @author 作者 E-mail:zhangshanhai123@gmail.com
 * @version 创建时间：2013-8-24 下午7:22:36
 * 类说明
 */
public interface UserService {
	/**
	 * 判断userId是否存在 
	 * @param userId
	 * @return
	 */
	boolean isExistUserById(String userId);

	/**
	 * 判断uri是否存在
	 * @param uri
	 * @return
	 */
	boolean isExistcheckUri(String uri);
	
	/**
	 * 检查用户的uri是否存在
	 * @param userid
	 * @return 存在返回true,否则返回false
	 */
	boolean isExistcheckUserUri(String userId);

	/**
	 * 修改用户的uri
	 * @param uri
	 * @param userId
	 * @return true if could edit,otherwise false
	 */
	Boolean updateUserUri(String uri, String userId);
	
	UserEntity getUserEntityByEmail(String email);
	
	UserEntity getUserEntityByUserId(String userId);
}
