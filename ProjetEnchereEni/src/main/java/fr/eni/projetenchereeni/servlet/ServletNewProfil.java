package fr.eni.projetenchereeni.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import fr.eni.projetenchereeni.bll.BLLException;
import fr.eni.projetenchereeni.bll.UtilisateurManager;
import fr.eni.projetenchereeni.dal.BusinessExceptionDAL;

/**
 * Servlet implementation class ServletNewProfil
 */
@WebServlet("/ServletNewProfil")
public class ServletNewProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNewProfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/profil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo = request.getParameter("Pseudo");
		String nom = request.getParameter("Nom");
		String prenom = request.getParameter("Prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("Telephone");
		String rue = request.getParameter("Rue");
		String codePostal = request.getParameter("Codepostal");
		String ville = request.getParameter("Ville");
		String motDePasse = request.getParameter("motDePasse");
		String utilisateur = null;
		request.setCharacterEncoding("UTF-8");
		List<Integer> listeCodesErreur=new ArrayList<>();
		
		
		
		
		utilisateur = request.getParameter("utilisateur");
		if(utilisateur==null || utilisateur.trim().isEmpty())
		{
			listeCodesErreur.add(CodesResultatServlets.FORMAT_UTILISATEUR_ERREUR);
		}
		
		try {
			UtilisateurManager utilisateurManager = new UtilisateurManager();
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			
			UtilisateurManager.creerUtilisateurs(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse);
			//Si tout se passe bien, je vais vers la page de consultation:
			RequestDispatcher rd = request.getRequestDispatcher("./ServletListeEnchereConnecte");
			rd.forward(request, response);
		} catch (BusinessExceptionDAL e) {
			//Sinon je retourne à la page d'ajout pour indiquer les problèmes:
			e.printStackTrace();
			request.setAttribute("listeCodesErreur",e.getListeCodesErreur());
			RequestDispatcher rd = request.getRequestDispatcher("./ServletEnchere");
			rd.forward(request, response);
		}

		
	}

}
