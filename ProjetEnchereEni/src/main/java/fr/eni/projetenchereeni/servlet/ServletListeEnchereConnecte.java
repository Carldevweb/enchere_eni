package fr.eni.projetenchereeni.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletListeEnchereConnecte
 */
@WebServlet("/ServletListeEnchereConnecte")
public class ServletListeEnchereConnecte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListeEnchereConnecte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("/WEB-INF/ListeEnchereConnecte.jsp");
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String filtres = request.getParameter("Filtres");
		String categories = request.getParameter("Categories");
		String achats = request.getParameter("Achats");
		String achatsCochesEnchereOuverte = request.getParameter("AchatsCochesEnchereOuverte");
		String achatsCochesEnchereEnCours = request.getParameter("AchatsCochesEnchereEnCours");
		String achatsCochesEnchereRemportées = request.getParameter("AchatsCochesEnchereRemportées");
		String mesVentes = request.getParameter("MesVentes");
		String VentesCochesEnCours = request.getParameter("VentesCochesEnCours");
		String VentesCochesNonDébutées = request.getParameter("VentesCochesNonDébutées");
		String VentesCochesTerminées = request.getParameter("VentesCochesTerminées");
		request.setCharacterEncoding("UTF-8");
	}

}
