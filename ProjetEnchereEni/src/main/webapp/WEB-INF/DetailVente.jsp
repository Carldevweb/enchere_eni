<%@page import="java.text.DateFormat" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>
<%@page import="fr.eni.projetenchereeni.bo.ArticleVendu" %>
<%@page import="fr.eni.projetenchereeni.bo.Utilisateurs" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Detail Vente</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/detailVente.css" >
</head>


<body>
	<header>
		<h1>ENI-Enchères</h1>
	</header>
	
	<div class="container_detail"></div>
		<h2>Détail vente</h2>
		<%
	Date finEnchere = new Date();
	DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String finEnchereFin;
	ArticleVendu vente = (ArticleVendu) request.getAttribute("vente");
	%>
	<div class="table-article">
		  <table class="table">
			    <thead>
				    <tr>
					    <th>Article : </th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Description : </td>
					</tr>
					<tr>
						<td>Catégorie : </td>
					</tr>
					<tr>
						<td>Meilleur offre : </td>
					</tr>
					<tr>
						<td>Mise à prix : </td>
					</tr>
					<tr>
						<td>Fin de l'enchère : </td>
					</tr>
					<tr>
						<td>Retrait : </td>
					</tr>
					<tr>
						<td>Vendeur : </td>
					</tr>
				</tbody>
		  </table>
		</div>
		<form action=""<%=request.getContextPath()%>/DetailVente" method="post">
			<label for="Maproposition" name="Maproposition" id="Maproposition">Ma proposition :</label>
			<input type="number" name="Maproposition" id="Maproposition" maxlength="10" min="0" step="10">
			<button type="submit" class="col-lg-2 btn btn-default" name="noArticle">Encherir</button>

		</form>
</body>
</html>