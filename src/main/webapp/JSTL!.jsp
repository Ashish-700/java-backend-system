<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>practise jstl</title>
</head>
<body>
Name:<c:out value="${param.name}"></c:out><br>
Password:<c:out value="${param.pass}"></c:out>

</body>
</html>