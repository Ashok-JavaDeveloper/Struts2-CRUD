package com.init;

import org.apache.ibatis.session.SqlSession;

import com.util.MybatisUtil;

public class SessionCreator {
	public SqlSession getDBSession()
	{
		return MybatisUtil.getSessionFactory().openSession();		
	}
	
	public void closeDBSession(SqlSession dbSession)
	{
		if(dbSession != null)
		{
			dbSession.close();
		}
	}
	
}
