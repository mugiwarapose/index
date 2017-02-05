package com.ft.dao;

import java.util.List;

import com.ft.entity.User;

public interface UserMapper {
	public List<User> findAllUser();

	public User findOne(User user);

	public  List<User> finaUser(User user);
}
