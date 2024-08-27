<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Example</title>

</head>
<body>
	<html:form action="/login" focus="userName">
	<bean:message key="label.login.username" /> : <html:text property="userName" />
		<br>
	<bean:message key="label.login.password" /> : <html:password property="password" />
		<br>
		<html:submit value="login" />
	</html:form>
	<table id="list2"></table>
	<div id="pager2"></div>
</body>
</html>
<script type="text/javascript">
	
</script>