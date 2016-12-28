<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Login</h4>
	<s:form action="Login" method="post">
		<s:push value="user">
			<s:hidden name="id" />
			<s:label align="center">Email</s:label>
			<s:textfield align="center" name="email" />
			<br>
			<s:label align="center">Password</s:label>
			<s:password align="center" name="password" />
			<br>
			<button type="submit">Login</button>
		</s:push>
	</s:form>
</body>
</html>
