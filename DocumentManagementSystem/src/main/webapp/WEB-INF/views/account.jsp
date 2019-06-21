<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<%@ include file="/WEB-INF/views/menu.jsp"%>
		<h4>Please type book info!</h4>
		<form:form method="post"
			action="${pageContext.request.contextPath}/postInfo.htm"
			commandName="account">
			<tr>
				<td>Account Name:</td>
				<td><form:input path="account_name" type="text" /></td>
			</tr>
			<tr>
				<td>Account Password:</td>
				<td><form:input path="account_password" type="text" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" class="button" name="save"
					value="Save" />
		</form:form>
	</table>
</body>
</html>