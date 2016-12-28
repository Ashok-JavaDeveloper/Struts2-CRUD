package com.init;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.util.ApplicationBase;

public class MyLoggingInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;

	/*public String intercept(ActionInvocation invocation) throws Exception {
		
		
		String className = invocation.getAction().getClass().getName();
		long startTime = System.currentTimeMillis();
		System.out.println("Before calling action: " + className);
		String result = invocation.invoke();
		long endTime = System.currentTimeMillis();
		System.out.println("After calling action: " + className + " Time taken: " + (endTime - startTime) + " ms");
		System.out.println(result);
		return result;
	}*/
	
	public String intercept(ActionInvocation actionInvocation) throws Exception 
	{
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		Object userObject = session.get("USER_OBJECT");
		if(userObject == null)
		{
			ServletActionContext.getResponse().sendRedirect(ApplicationBase.BASEPATH + "/LoginPage");
			return null;
		}
		
		return actionInvocation.invoke();
	}

	public void destroy() {
		System.out.println("Destroying MyLoggingInterceptor...");
	}

	public void init() {
		System.out.println("Initializing MyLoggingInterceptor...");
	}
}
