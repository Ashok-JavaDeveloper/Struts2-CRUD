package com.init;

import java.io.Serializable;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.foundation.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.util.ApplicationBase;

public class StrutsActionSupport extends ActionSupport implements Serializable, SessionAware, ServletRequestAware, ServletResponseAware, ServletContextAware 
{
	private static final long serialVersionUID = -6173108838304851024L;
	protected Map<String, Object> session;
	protected ServletContext servletContext;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected String basePath = ApplicationBase.BASEPATH;
	protected String redirectURL;
	protected User sessionUser;

	public void setSession(Map<String, Object> session) 
	{
		this.session = session;
	}

	public void setServletContext(ServletContext servletContext) 
	{
		this.servletContext = servletContext;
	}

	public void setServletRequest(HttpServletRequest request) 
	{
		this.request = request;
	}

	public void setServletResponse(HttpServletResponse response) 
	{
		this.response = response;
	}
	
	public String getBasePath()
	{
		return basePath;
	}

	public String getRedirectURL() 
	{
		return redirectURL;
	}
	
	public User getSessionUser() 
	{
		if(session != null && session.get("USER_OBJECT") != null)
		{
			sessionUser = (User) session.get("USER_OBJECT");
		}
		
		return sessionUser;
	}
}