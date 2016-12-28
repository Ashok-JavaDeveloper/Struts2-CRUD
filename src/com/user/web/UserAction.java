package com.user.web;

import com.foundation.domain.User;
import com.init.StrutsActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.user.service.UserService;
import com.user.service.UserServiceImpl;

public class UserAction extends StrutsActionSupport implements Preparable, ModelDriven<User>
{
	private static final long serialVersionUID = -1357159118662136650L;
	private int userId;
	private User user, curUser;
	private UserService userService = new UserServiceImpl();
	
	public String loginPage()
	{
		return SUCCESS;
	}
	
	public String validateUser()
	{
		curUser = userService.getUser(user);
		if(curUser != null)
		{
			if(curUser.getPassword().equalsIgnoreCase(user.getPassword()))
			{
				request.getSession().setAttribute("USER_OBJECT", user);
				redirectURL = "Dashboard";
			}
		}
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public int getUserId() {
		return userId;
	}

	public User getModel() {
		return user;
	}

	public void prepare() throws Exception {
		user = new User();
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getCurUser() {
		return curUser;
	}

	public void setCurUser(User curUser) {
		this.curUser = curUser;
	}
	
}
