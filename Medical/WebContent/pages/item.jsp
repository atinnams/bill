<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi</h1>
<form:form id="itemform" action="add-item" modelAttribute="item" method="POST">
<table>
<tr>
<td>Name</td>
<td><form:input path="name" id="name"/></td>
</tr>
<tr>
<td>category</td>
<td><form:input path="category" id="category"/></td>
</tr>
<tr>
<td>purpose</td>
<td><form:input path="purpose" id="purpose"/></td>
</tr>
<tr>
<td>Stock level</td>
<td><form:input path="stocklevel" id="stocklevel" /></td>
</tr>
<tr>
<td>Remarks</td>
<td><form:input path="remark" id="remark"/></td>
</tr>
<tr>
<td colspan="2" align="right">
<form:button name="Submit" value="Submit" id="Submit">Submit</form:button></td>
</tr>
</table>
</form:form>
</body>
</html>