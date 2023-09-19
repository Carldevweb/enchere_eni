<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/profil.css">
<title>Les données de mon profil</title>
</head>
<body>
	<header>
		<h2>ENI-Encheres</h2>
	</header>
	<form action="/ServletProfilDonnees" méthod="get">
		<label for="Pseudo"> Pseudo : </label>
		<div> </div>
		
		<label for="Nom"> Nom : </label>
		<div> </div>
		
		<label for="Prenom"> Prenom : </label>
		<div> </div>
		
		<label for="Email"> Email : </label>
		<div> </div>
		
		<label for="Telephone"> Téléphone : </label>
		<div> </div>
		
		<label for="Rue"> Rue : </label>
		<div> </div>
		
		<label for="codePostal"> Code postal : </label>
		<div> </div>
		
		<label for="Ville"> Ville :</label>
		<div> </div>	
		
		<a href="./ServletProfilConnecte"><input type="button" value="Modifier"/></a>
		<a href="./ServletListeEnchereConnecte"><input type="button" value="Retour"/></a>
	</form>
</body>
</html>