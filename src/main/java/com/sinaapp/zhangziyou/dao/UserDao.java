package com.sinaapp.zhangziyou.dao;

import java.util.List;
import java.util.Map;

import com.sinaapp.zhangziyou.pojo.po.UserEntity;

public interface UserDao {
	
	UserEntity getUserByName(String userName);

	UserEntity getUserById(String userId);
	
	UserEntity getUserByEmail(String email);
	
	int updateUserStatus(Map prmMap);

	int delUser(String userId);

	int delUsers(String[] userIds);

	int save(UserEntity userEntity);

	int update(UserEntity updateEntity);

	int existUser(String userName);

	int existEmail(String email);
	
	int queryDataCount(String userName);

	List<UserEntity> queryPageData(Map<String, Object> parameterMap);

	/**
	 * 通过userId判断是否存在user
	 * @param userId
	 * @return
	 */
	int existUserById(String userId);

	/**
	 * 检查是否存在uri
	 * @param uri
	 * @return
	 */
	int existUri(String uri);

	/**
	 * 通过userid得到uri
	 * @param userId
	 * @return
	 */
	String getUriByUserId(String userId);

	/**
	 * 根据 userid更新uri
	 * @param userEntity
	 * @return
	 */
	int updateUriByUserId(UserEntity userEntity);

}
