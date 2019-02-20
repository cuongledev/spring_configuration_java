<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="<c:url value='/static/css/style.css' />" />
<body>


<h1>Add User</h1>

<form:form modelAttribute="user" method="post" action="them-user"> 

<form:input path="name" />

<form:button type="submit">Thêm User</form:button>

</form:form>



</body>
</html>