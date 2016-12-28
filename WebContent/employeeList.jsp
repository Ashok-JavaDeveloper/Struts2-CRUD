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
	<a href="<s:property value='basePath'/>/Dashboard">Back</a>
<h1>Employee List</h1>
<a href="<s:property value='basePath'/>/AddEmployee">Add Employee</a>
<table border="1">
	<thead>
		<tr>
			<th width="10%">Sno.</th>
			<th width="35%">Name</th>
			<th width="25%">company</th>
			<th width="30%">&nbsp;</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="employees" status="itStatus">
			<tr>			
				<td align="center"> <s:property value="#itStatus.count"/></td>
				<td> <s:property value="name"/> </td>
				<td> <s:property value="company"/> </td>
				<td align="center">
					<a href="<s:property value='basePath'/>/EditEmployee/<s:property value='id'/>">Edit</a>&nbsp;&nbsp;
					<a href="<s:property value='basePath'/>/DeleteEmployee/<s:property value='id'/>">Delete</a>&nbsp;&nbsp;
					<a href="<s:property value='basePath'/>/DetailEmployee/<s:property value='id'/>">Details</a>
				</td>
			</tr>
		</s:iterator>
		<tr><input type="button" value="read data" onclick="createDatabase()"/> </tr>
	</tbody>
</table>

<script type="text/javascript">

	var address = '192.168.1.22:3306';
	var db = 'pratice';
	
	var root = 'root';
	var rootPwd = 'admin';
	var instanceUrl = 'jdbc:mysql://' + address;
	var dbUrl = instanceUrl + '/' + db;
	
	// Create a new database within a Cloud SQL instance.
	function createDatabase() {
		alert("clicked");
	  var conn = Jdbc.getConnection(instanceUrl, root, rootPwd);
	  console.log(conn);
	  console.log(instanceUrl);
	  console.log(dbUrl);
	  /*  conn.createStatement().execute('CREATE DATABASE ' + db);*/
	}

</script>
</body>
</html>