<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" import="java.util.List" %>
 <%@page import="entities.Article" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste de tous les articles</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<div>
<div> <h2><b style="color:blue;" > Liste des articles </b></h2>
<hr width="100%;" >
</div>
<div>
 <br>
 <b style="color:green;">
 <%
 String message=(String) request.getAttribute("message");
 if (message!=null){
 out.print(message);
 }
 %>
 </b>
</div>
<form action="RechercherArticle" method ="get">
<table >
 <tr>
 <td><b> Mot de recherche : </b></td>
 <td><input type="text" name="mot"></td>
 <td> <input type="submit" name ="submit" value="Rechercher"> </td>

 <tr>
 <td><b>Code</b></td>
 <td><b>Désignation</b></td>
 <td><b>Prix</b></td>
 <td><b>Quantité</b></td>
 </tr>
 <%
 // récupération d'une variable de session
 ArrayList<Article> articles=
(ArrayList<Article>)session.getAttribute("articles");
 if (articles!=null){
 for(Article a : articles) {
 %>
 <tr>
 <td> <%= a.getIdArticle() %></td>
 <td> <%= a.getNomArticle() %></td>
 <td> <%= a.getPrixArticle() %></td>
 <td> <%= a.getQteArticle() %></td>
 </tr>
 <%
 }
 }
 %>
 </table>
</form>
</div>
</body>
</html>