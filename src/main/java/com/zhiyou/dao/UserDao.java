package com.zhiyou.dao;

import com.zhiyou.pojo.User;

public interface UserDao {
	
//  1.ͨ���û�������
	User selectByAccounts(String accounts);
//  2.ͨ��id�����û�
	User selectById(int id);
//  3.�û�����
	void  addUser(User user);
//  4.�û��޸�
	void updateUser(User user);
}