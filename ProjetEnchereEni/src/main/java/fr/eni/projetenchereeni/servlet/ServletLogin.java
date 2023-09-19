
package fr.eni.projetenchereeni.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import fr.eni.projetenchereeni.bll.BLLException;
import fr.eni.projetenchereeni.bll.UtilisateurManager;
import fr.eni.projetenchereeni.dal.BusinessExceptionDAL;
import fr.eni.projetenchereeni.dal.UtilisateursDAO;

import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
    	
    	String email = request.getParameter("email");
    	String motDePasse = request.getParameter("motDePasse");
    	String logUtilisateur = request.getParameter("logUtilisateur");
    	request.setCharacterEncoding("UTF-8");
		List<Integer> listeCodesErreur=new ArrayList<>();
		
		logUtilisateur = request.getParameter("utilisateur");
		if(logUtilisateur==null || logUtilisateur.trim().isEmpty())
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
			UtilisateurManager.loginUtilisateurs(email, motDePasse);
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