<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Consultation client</title>
</head>
<body>
	<p>${client.num}</p>
	<p>${client.prenom}&nbsp;${client.nom}</p>
	
	<table border="1">
		<tr>
			<th>Num contrat</th>
			<th>Date souscription</th>
			<th>Type contrat</th>
		</tr>
		<c:forEach items="${contrats}" var="contrat">
	    <tr>
	        <td><c:out value="${contrat.num}"/></td>
	        <td><c:out value="${contrat.dateSouscription}"/></td>  
<!-- 	        <td><c:out value="${contrat.typeContratT}"/></td>  -->
	    </tr>
    </c:forEach>
</table>
</body>
</html>
