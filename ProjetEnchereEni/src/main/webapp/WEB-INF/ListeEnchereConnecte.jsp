<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Accueil Enchère</title>
  <link rel="stylesheet"  href="${pageContext.request.contextPath }/css/ListeEnchereConnecte.css" >

</head>
<body>
<header>

  <div class="a">
    <ul>
      <li><a href="./ServletEnchere"><input type="button" value="Déconnexion"/></a></li>
      <li><a href="./ServletProfilDonnees"><input type="button" value="Mon Profil"/></a></li>
      <li><a href="./ServletNouvelleVente"><input type="button" value="Vendre un article"/></a></li>
      <li><a href="./ServletNouvelleVente"><input type="button" value="Enchères"/></a></li>



    </ul>
    <h2>ENI-Enchères</h2>
  </div>
</header>


<p>Liste des ench�res</p>

<div class="container-all">

  <div class="container1">
    <form method="post" action="<%=request.getContextPath()%>/ServletListeEnchere">
    <label for="search">Filtres:</label>
    <br>

    <input type="search" name="search" id="search" placeholder="Recherche" value="<%=request.getParameter("Filtres")%>">
    <br>

    <label for="select">Cat�gories:
      <select id="select" value="<%=request.getParameter("Categories")%>">
        <option value="">Informatique</option>
        <option value="">Ameublement</option>
        <option value="">V�tement</option>
        <option value="">Sport & Loisirs</option>
      </select>
    </label>
    </form>
  </div>
  
    <div class="container2">
    <div class="searchbtn">
      <a href="<%=request.getContextPath()%>">Rechercher</a>
      <br>
    </div>
  </div>

</div>

<br>
<br>

<div class="myachat">
  <form method="post" action="<%=request.getContextPath()%>/ServletListeEnchere">
      <input type="radio" id="achat" name="enchere" checked value="<%=request.getParameter("Achats")%>">
    <label for="achat" id = "achatcss">Achat</label>

    <div class="enchere-all" >
      <div class="enchereopen">
              <input type="checkbox" id="enchereopen" name="enchereopen1" value="<%=request.getParameter("AchatsCochesEnchereOuverte")%>">
            <label for="enchereopen">ench�re ouvertes</label>
          </div>

      <div class="enchererun">
            <input type="checkbox" id="enchererun" name="enchererun1" value="<%=request.getParameter("AchatsCochesEnchereEnCours")%>">
          <label for="enchererun">mes ench�re en cours</label>
      </div>

      <div class="encherewin">
          <input type="checkbox" id="encherewin" name="encherewin" value="<%=request.getParameter("AchatsCochesEnchereRemport�es")%>">
          <label for="encherewin">mes ench�res remport�es</label>
      </div>
    </div>
    
    <div class="ventes">
    <input type="radio" id="mesvente" name="enchere" value="<%=request.getParameter("MesVentes")%>">
    <label for="mesvente" id = "mesventecss">Mes ventes</label>

    <div class="vente-all" >
      <div class="enchereopen">
        <input type="checkbox" id="venteopen" name="venteopen" value="<%=request.getParameter("VentesCochesEnCours")%>">
        <label for="venteopen">mes ventes en cours</label>
      </div>

      <div class="enchererun">
        <input type="checkbox" id="venteclosed" name="venteclosed" value="<%=request.getParameter("VentesCochesNonD�but�es")%>">
        <label for="venteclosed">ventes non d�but�es</label>
      </div>

      <div class="encherewin">
        <input type="checkbox" id="ventefinish" name="ventefinish" value="<%=request.getParameter("VentesCochesTermin�es")%>">
        <label for="ventefinish">ventes termin�es</label>
      </div>
    </div>
    </div>
</form>
</div>


<div class="container">
  <div class="card">
    <div class="card__header">
      <img src="https://source.unsplash.com/600x400/?computer" alt="card__image" class="card__image" width="600">
    </div>
    <div class="card__body">
      <span class="tag tag-blue">Pc Gamer pour travailler</span>
      <h6>Prix: 210 pts</h6>
      <p></p>
    </div>
    <div class="card__footer">
      <div class="user">
        <img src="https://i.pravatar.cc/40?img=1" alt="user__image" class="user__image">
        <div class="user__info">
          <br>
          <small>Vendeur: <a href="">jojo44</a></small>
        </div>
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card__header">
      <img src="https://imgs.search.brave.com/qLUZFaGwq2AubdD6Ge423pNYhZIS2qvtTvzqcPhd5FI/rs:fit:1200:630:1/g:ce/aHR0cHM6Ly9pbWcu/dGFzdGUuY29tLmF1/LzdPOEdxOXZmL3cx/MjAwLWg2MzAtY2Zp/bGwvdGFzdGUvMjAx/Ni8xMS9yb2NrZXQt/c2FsYWQtMzAwMDAt/MS5qcGVn" alt="card__image" class="card__image" width="600">
    </div>
    <div class="card__body">
      <span class="tag tag-brown">Rokect stove pour riz et p�tes</span>
      <h6>Prix: 195 pts</h6>
    </div>
    <div class="card__footer">
      <div class="user">
        <img src="https://i.pravatar.cc/40?img=2" alt="user__image" class="user__image">
        <div class="user__info">
          <br>
          <small>Vendeur : <a href="">Jiji56</a></small>
        </div>
      </div>
    </div>
  </div>
    </div>

</body>
</html>