<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<table align="center" border="1">
		<thead>
			<tr>
				<th width="20%">Sno.</th>
				<th width="40%">Mobile No.</th>
				<!-- <th width="40%">&nbsp;</th> -->
			</tr>
		</thead>
		<tbody>
			<%-- <s:iterator value="mobileList" status="itStatus">
				<tr>
					<td align="center"><s:property value="#itStatus.count" /></td>
					<td><s:property value="mobileNo" /></td>
					<td align="right">
						<a href="<s:property value='basePath'/>/DeleteMobile/<s:property value='id'/>">Delete</a>
					</td>
				</tr>
			</s:iterator> --%>
		</tbody>
	</table>
</body>
</html>