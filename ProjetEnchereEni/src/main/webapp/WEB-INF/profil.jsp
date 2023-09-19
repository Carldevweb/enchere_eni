<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/profil.css">
    <title>Profil</title>
</head>

<header>
    <p>ENI-Encheres</p>
</header>
<body>
    <h1>Mon profil</h1>

    <div class="container">

        <div class="left">
        
        <form method="post" action="<%=request.getContextPath()%>/ServletNewProfil">

                <label for="Pseudonyme">Pseudo : </label>
                <input class="formulaire" type="text" name="Pseudo" required="required" id="Pseudo" maxlength="15" value="<%=request.getParameter("Pseudo")%>"><br /><br />

                <label for="Prenom">Prénom : </label>
                <input class="formulaire" type="text" name="Prenom" id="Prenom" required="required" maxlength="15" value="<%=request.getParameter("Prenom")%>"><br /><br />

                <label for="Telephone">Téléphone : </label>
                <input class="formulaire" type="tel" name="Telephone" id="Telephone" required="required" maxlength="15" value="<%=request.getParameter("Telephone")%>"><br /><br />

                <label for="Codepostal">Code postal : </label>
                <input class="formulaire"  name="Codepostal" id="Codepostal" maxlength="6" required="required" value="<%=request.getParameter("CodePostal")%>"><br /><br />

                <label for="Motdepasse">Mot de passe : </label>
                <input class="formulaire" type="password" name="motDePasse" id="motDePasse" required="required" maxlength="15" value="<%=request.getParameter("motDePasse")%>"><br /><br />


                <label for="Nom">Nom : </label>
                <input class="formulaire" type="text" name="Nom" id="Nom" maxlength="15" required="required" value="<%=request.getParameter("Nom")%>"><br /><br />

                <label for="Email">Email : </label>
                <input class="formulaire" type="email" name="email" id="email" required="required" value="<%=request.getParameter("email")%>"><br /><br />

                <label for="Rue">Rue : </label>
                <input class="formulaire" type="text" name="Rue" id="Rue" maxlength="15" required="required" value="<%=request.getParameter("Rue")%>"><br /><br />

                <label for="Ville">Ville : </label>
                <input class="formulaire" type="text" name="Ville" id="Ville" maxlength="15" required="required" value="<%=request.getParameter("Ville")%>"><br /><br />

                <label for="Motdepasseconfirmation">Confirmation : </label>
                <input class="formulaire" type="password" name="motDePasse" id="motDePasse" maxlength="15" value="<%=request.getParameter("motDePasse")%>"><br /><br />
                
                <input type="submit" value="Valider"/>
                
                <a href="<%=request.getContextPath()%>"><input type="button" value="Annuler"/></a>
        </form>
                

        </div>


    </div>

</body>
</html>