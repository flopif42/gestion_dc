<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
<title>GDC</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
  <h2>User Input From</h2>
  <hr />
  <form:form action="saveUser" method="post" modelAttribute="client">
    <table>
      <tr>
        <th>Numero</th>
        <td>
          <form:input path="num" /> 
         </td>
      </tr>
      <tr>
        <th>Nom</th>
        <td>
          <form:input path="nom" /> 
          <form:errors path="nom" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>Prenom</th>
        <td>
          <form:input path="prenom" /> 
          <form:errors path="prenom" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>Date de naissance(mm/jj/aaaa)</th>
        <td>
          <form:input id="datepicker" path="dateNaissance" value="${dateNaissance}"/> 
          <form:errors path="dateNaissance" cssClass="error" />
         </td>
      </tr>
      <tr>
        <td><button type="submit">Enregistrer</button></td>
      </tr>
    </table>
  </form:form>
</body>
</html>
