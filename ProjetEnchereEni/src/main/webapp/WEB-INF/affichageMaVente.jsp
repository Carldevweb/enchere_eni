<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nouvelleVente.css">
<title>Mise en vente d'un article</title>
</head>
<body>
	<h1>Nouvelle vente</h1>
	
	<div class ="rectangle"></div>
	<div>
	<form class ="nomArticle" action="<%=request.getContextPath()%>/NouvelleVente">
		<label for ="nomArticle">Article :</label>
		<input type ="text" id ="nomArticle" value="<%=request.getParameter("nomArticle")%>">
		
	</form>
	</div><br>
	
	<div>
	<form class ="center">
		<label for ="description">Description :</label>
		<textarea name="article" rows="5" cols="20" value="<%=request.getParameter("decription")%>">>
		</textarea>
	</form>
	</div><br>
	
	<div class ="center">
	<select >
 	   <option selected>Catégories :</option>
       <option value="1">Informatique</option>
  	   <option value="2">Ameublement</option>
  	   <option value="3">Vêtement</option>
  	   <option value="4">Sport & loisirs</option>
	</select>
	</div><br>
	
	<div class ="center">
	<label for="photo">Photo de l'article:</label>
	<input type="file" id="photo" name="photo" accept="image/png, image/jpeg">
	</div><br>
	
	<div class ="center">
	<label for="Miseaprix">Mise à prix : </label>
	<input class="formulaire" type="number" name="Miseaprix" id="Miseaprix" maxlength="10" min="0" step="10"> 
	</div><br>
	
	<div>
	<form class ="center">
  		 <label for="datemin">Début de l'enchère :</label>
 		 <input type="date" id="datemin" name="datemin" min="2020-01-02"><br><br>
 		 <label for="datemax">Fin de l'enchère :</label>
 		 <input type="date" id="datemax" name="datemax" max="2500-12-31"><br><br>
  	     
	</form>
	</div>
	
	<div class ="retrait">
		<form action="#" name="#">
			<fieldset class ="retrait">
				<legend class ="retrait">Retrait</legend>
				<p>Rue :</p> <input type="text" />
				<p>Code Postal :</p> <input type ="text"/>
				<p>Ville :</p> <input type ="text" />
				</fieldset>
		</form>
		</div>
		<br>
			
			
	<div class ="redirection">
	<form action="<%=request.getContextPath()%>/NouvelleVente" name="vente" method ="get">
	<input type = "submit" id= "enregistrer"  />
	<label for="enregistrer">Enregistrer</label>
	</form>
	</div><br>
	
	<div class ="redirection">
	<form action="<%=request.getContextPath()%>/NouvelleVente"  method ="get">
	<input type="submit"  id="annuler" />
	<label for="annuler">Annuler</label>
	</form>
	</div><br>
	
	<div class ="redirection">
	<form action="<%=request.getContextPath()%>/NouvelleVente" name="vente" method ="get">
	<input type = "submit" id= "annulerVente"  />
	<label for="annulerVente">Annuler la vente</label>
	</form>
	</div><br>
	
</body>
</html>