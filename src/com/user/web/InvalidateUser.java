package com.user.web;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.init.StrutsActionSupport;

public class InvalidateUser extends StrutsActionSupport implements SessionAware
{
	private static final long serialVersionUID = -883438722635753675L;
	
	private void destroySession()
	{
		if(session instanceof SessionMap)
		{
			((org.apache.struts2.dispatcher.SessionMap<String, Object>) session).invalidate();
		}
	}
	
	public String logout()
	{
		destroySession();
		
		return SUCCESS;
	}
}