package com.init;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ibatis.common.resources.Resources;
import com.util.MybatisUtil;

public class MybatisListener implements ServletContextListener, Serializable 
{
	private static final long serialVersionUID = 2981025270922193643L;

	public void contextInitialized(ServletContextEvent arg0)
	{
		try 
		{
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			if(reader != null) 
			{
				new MybatisUtil(new SqlSessionFactoryBuilder().build(reader));
			}
		}
		catch(FileNotFoundException fileNotFoundException) 
		{
			fileNotFoundException.printStackTrace();
		}
		catch(IOException iOException) 
		{
			iOException.printStackTrace();
		}		
	}
		
	public void contextDestroyed(ServletContextEvent arg0) 
	{
		
	}	
}