<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>GDC - Accueil</title>
</head>
<body>
	<h1>Hello World !</h1>
	<P>The time on the server is ${serverTime}.</p>
	<a href="userForm">Nouveau client</a><br>
	<form action="client" method="post">
		Num client : <input type="text" name="id"><br>
		<input type="submit" value="Search">
	</form>
</body>
</html>
