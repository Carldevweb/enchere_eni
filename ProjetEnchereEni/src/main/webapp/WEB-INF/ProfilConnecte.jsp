<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/profil.css">
    <title>Mon Profil (Connecté)</title>
</head>

<header>
    <p>ENI-Encheres</p>
</header>
<body>
    <h1>Mon profil</h1>

    <div class="container">

        <div class="left">
            <form method="post1" action="/ServletProfilConnecte">

                <label for="Pseudonyme">Pseudo : </label>
                <input class="formulaire" type="text" name="Pseudonyme" id="Pseudonyme" maxlength="15"><br /><br />

                <label for="Prenom">Prénom : </label>
                <input class="formulaire" type="text" name="Prenom" id="Prenom" maxlength="15"><br /><br />

                <label for="Telephone">Téléphone : </label>
                <input class="formulaire" type="tel" name="Telephone" id="Telephone" maxlength="15"><br /><br />

                <label for="Codepostal">Code postal : </label>
                <input class="formulaire"  name="Codepostal" id="Codepostal" maxlength="6"><br /><br />

                <label for="Motdepasse">Mot de passe actuel : </label>
                <input class="formulaire" type="password" name="Motdepasse" id="Motdepasse" maxlength="30"><br /><br />
            </form>
        </div> 
        
        <div class="right">
            <form method="post2" action="à compléter"></form>
                <label for="Nom">Nom : </label>
                <input class="formulaire" type="text" name="Nom" id="Nom" maxlength="15"><br /><br />

                <label for="Email">Email : </label>
                <input class="formulaire" type="email" name="email" id="email"><br /><br />

                <label for="Rue">Rue : </label>
                <input class="formulaire" type="text" name="Rue" id="Nom" maxlength="15"><br /><br />

                <label for="Ville">Ville : </label>
                <input class="formulaire" type="text" name="Ville" id="Ville" maxlength="15"><br /><br />

                <label for="Motdepasseconfirmation" id="hidden">Confirmation : </label>
                <input class="formulaire" type="password" name="Motdepasseconfirmation" id="hidden" maxlength="30"><br /><br />
            </form>
        </div>    
        

    </div>

    <div class="password">
        <div class="newpassword">
            <form>
                <label for="Nouveaumotdepasse">Nouveau mot de passe : </label>
                <input class="formulaire" type="password" name="Nouveaumotdepasse" id="Nouveaumotdepasse" maxlength="30"><br /><br />
        </div>
        <div>
                <label for="Motdepasseconfirmation">Confirmation : </label>
                <input class="formulaire" type="password" name="Motdepasseconfirmation" id="Motdepasseconfirmation" maxlength="30"><br /><br />
        </div>
            </form>
    </div>
    
    <div class="credits">
    	Crédit :
    </div>

    <div class="container2">
        
        <div class="btncreate">
            <a href="#">Enregistrer</a>
        </div>

        <div class="btncancel">
            <a href="#">Supprimer mon compte</a>
        </div>

    </div>

</body>
</html>