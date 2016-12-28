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
	<a href="<s:property value='basePath'/>/ViewEmployee">Back</a>
	<h3>Employee form</h3>
	<s:form action="SaveEmployee" method="post">
		<s:push value="employee">
			<s:hidden name="id" />
			<s:label>Employee name</s:label>
			<s:textfield name="name" /><br>
			
			<s:label>Employee Company</s:label>
			<s:textfield name="company" /><br>
			
			<%-- <s:label>Mobile 1</s:label>
			<s:textfield name="mobile" /><br>
			<s:label>Mobile 2</s:label>
			<s:textfield name="mobile" /><br>
			<s:label>Mobile 3</s:label>
			<s:textfield name="mobile" /><br> --%>
			
			<button type="submit">Submit</button>
		</s:push>
	</s:form>
</body>
</html>