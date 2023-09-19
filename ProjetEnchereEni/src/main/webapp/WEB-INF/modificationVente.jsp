<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fiche de vente</title>
</head>
<body>
	<h1>DÃ©tail de la vente</h1>
	
	
	<div>
	<form action="<%=request.getContextPath()%>/NouvelleVente" >
	<input type="text" type="submit" id="enregistrer" />
	<label for="enregistrer">Enregistrer</label>
	</form>
	</div>
	
	<div>
	<form action="<%=request.getContextPath()%>/NouvelleVente" >
	<input type="text" type="submit" id="annuler" />
	<label for="annuler">Annuler</label>
	</form>
	</div>
	
	<div>
	<form action="<%=request.getContextPath()%>/NouvelleVente" >
	<input type="text" type="submit" id="annulerVente" />
	<label for="annulerVente">Annuler la vente</label>
	</form>
	</div>
	
</body>
</html>