<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <title>Page de connexion</title>
</head>

<body>
    <p>
        ENI-Enchères
    </p>

    <div class="formulaire">

        <form action="<%=request.getContextPath()%>/ServletLogin" method="post" >
            <label class="id" for="email">Identifiant :</label>
            <input type="text" name="email" id="email" placeholder="example@gmail.com" value="<%=request.getParameter("email")%>">
            <br>
            <br>
            <label class="mdp" for="motDePasse">Mot de passe :</label>
            <input type="password" name="motDePasse" id="motDePasse" placeholder="*********************" value="<%=request.getParameter("motDePasse")%>">
            <br>
            <br>
            <input class="check" type="checkbox" name="checkbox" id="moi" value="moi">
            <label for="moi">Se souvenir de moi</label>
            <br>
            <br>
            <a class="mdpo"  href="#">Mot de passe oublié</a>
            <input class="submit" type="submit" value="Connexion">
        </form>
    </div>
</body>
</html>