package fr.eni.projetenchereeni.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchereeni.bll.ArticleVenduManager;
import fr.eni.projetenchereeni.bll.BLLException;
import fr.eni.projetenchereeni.bo.ArticleVendu;
import fr.eni.projetenchereeni.dal.BusinessExceptionDAL;

@WebServlet(name = "vente", value ="/NouvelleVente")
public class ServletNouvelleVente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = null;
						  rd = request.getRequestDispatcher("/WEB-INF/nouvellevente.jsp");
						  rd.forward(request, response);  
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		
		try {
			ArticleVenduManager miseEnVente = new ArticleVenduManager();
		} catch (BLLException e1) {
			e1.printStackTrace();
		}
		
		
		
		String nomArticle = request.getParameter("nomArticle");
		String decription = request.getParameter("description");
		String prixVente = request.getParameter("prixVente");
		String prixInitial = request.getParameter("prixInitial");
		String dateDebutEnchere = request.getParameter("dateDebutEnchere");
		String DateFinEnchere = request.getParameter("dateDebutEnchere");
		
		
		
		try {
			ArticleVenduManager.vente(nomArticle, decription, prixVente, prixInitial, dateDebutEnchere,DateFinEnchere);
		} catch (BusinessExceptionDAL e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd = null;
		  rd = request.getRequestDispatcher("/WEB-INF/ListeEnchereConnecte.jsp");
		  rd.forward(request, response);  
		

	}

}
