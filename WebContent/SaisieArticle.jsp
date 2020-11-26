<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@page import="entities.Article" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Saisie Nouveau Article</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<div> <h2><b style="color:blue;" > Nouvel article </b></h2>
<hr width="100%;" >
</div>
<br>
<div>
 <b style="color:red;">
 <%
 String message=(String) request.getAttribute("message");
 if (message!=null){
 out.print(message);
 }
 %>
 </b>
</div>
<form action="AjouterArticle" method ="post">
 <table>
 <tr>
 <td><b>Désignation</b></td>
 <td><input type="text" name="designation"></td>
 </tr>
 <tr>
 <td><b>Prix </b></td>
 <td><input type="text" name="prix" ></td>
 </tr>
 <tr>
 <td><b>Quantité </b></td>
 <td><input type="text" name="quantite" ></td>
 </tr>
 <tr>
 <td> </td>
 <td> <input type="submit" name ="submit" value="Enregister"></td>

 </tr>
 </table>
</form>
</body>
</html>
