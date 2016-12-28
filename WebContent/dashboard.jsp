<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<div>
		<h2>Welcome&nbsp;&nbsp;<s:property value="sessionUser.email"/></h2>
		<a href="ViewEmployee">Views Employee</a>
	</div>
	<div align="right"><a href="Logout">Logout</a></div>
	<br>
</body>
</html>