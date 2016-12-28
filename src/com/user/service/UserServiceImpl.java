package com.user.service;

import org.apache.ibatis.session.SqlSession;

import com.foundation.domain.User;
import com.init.SessionCreator;
import com.user.dao.UserDAO;

public class UserServiceImpl extends SessionCreator implements UserService
{
	public User getUser(User user) {
		SqlSession session = getDBSession();
		if(session != null)
		{
			UserDAO mapper = session.getMapper(UserDAO.class);
			user = mapper.getUser(user);
		}
		return user;
	}
}
