<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Acceuil Enchère</title>
    <link rel="stylesheet"  href="${pageContext.request.contextPath }/css/accueil.css" >

</head>
<header>

    <div class="a">
        <ul>
            <li><a href="./ServletNewProfil"><input type="button" value="S'inscrire"/></a></li>
            <li><a href="./ServletLogin"><input type="button" value="Se connecter"/></a></li>
        </ul>
        <h2>ENI-Enchères</h2>
    </div>
</header>

<body>
    <p>Liste des enchères</p>

    <div class="container-all">

        <div class="container1">   
            <label for="search">Filtres:</label>
            <br>
        
            <input type="search" name="search" id="search" placeholder="Recherche">
                <br>

                <label for="select">Catégories:
                    <select id="select">
                        <option value="">Informatique</option>
                        <option value="">Ameublement</option>
                        <option value="">Vêtement</option>
                        <option value="">Sport & Loisirs</option>
                    </select>
                </label>
        </div>

        <div class="container2">
                <div class="searchbtn">
                <a href="#">Rechercher</a>
                <br>
                </div>
        </div>
    </div>

</body>
</html>