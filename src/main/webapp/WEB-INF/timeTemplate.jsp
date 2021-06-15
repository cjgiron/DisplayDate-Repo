<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="css/time.css">
<script type="text/javascript" src="js/time.js"></script>
<meta charset="UTF-8">
<title>Time Template</title>
</head>
<body>
	<div id="container">
		<c:out value="${time}"/>
	</div>
</body>
</html>