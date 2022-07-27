<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<form action="sendAccount" method="post">
		<label>계좌번호: </label><input type="text" name="accountNum"><br>
		<label>전송금액: </label><input type="text" name="balance"><br>
		<input type="submit" value="송금"/>
	</form>
</body>
</html>