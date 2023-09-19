package fr.eni.projetenchereeni.bll;

import java.sql.Date;

import fr.eni.projetenchereeni.bo.ArticleVendu;
import fr.eni.projetenchereeni.dal.ArticleVenduDAO;
import fr.eni.projetenchereeni.dal.BusinessExceptionDAL;
import fr.eni.projetenchereeni.dal.DAOFactory;


public class ArticleVenduManager {

private static ArticleVenduDAO daoArticleVendu;

public ArticleVenduManager() throws BLLException {
	
	daoArticleVendu = DAOFactory.getArticleVenduDAO();
}
	
public static ArticleVendu vente (String nomArticle, String description, String prixVente, String prixInitial,String dateDebutEnchere,String dateFinEnchere) throws BusinessExceptionDAL{
	
	 ArticleVendu vente = null;
	 
	 vente = new ArticleVendu();
	 vente.setNomArticle(nomArticle);
	 vente.setDescription(description);
	 vente.setPrixVente(dateFinEnchere);
	 vente.setPrixInitial(dateDebutEnchere);
	
	 daoArticleVendu.insert(vente);
	 
	 return vente;
	 
}

public static ArticleVendu selectByID (String nomArticle, String description, Date dateDebutEnchere, Date DateFinEnchere,int prixInitial,int prixVente) throws BusinessExceptionDAL {
	
	ArticleVendu selectByID = null;
	
	selectByID = new ArticleVendu();
	selectByID.setNomArticle(nomArticle);
	selectByID.setDescription(description);
	selectByID.setPrixVente(prixVente);
	selectByID.setPrixInitial(prixInitial);
	selectByID.setDateFinEnchere(DateFinEnchere);
	
	daoArticleVendu.selectById(selectByID);
	
	return selectByID;
	
	
	
	
}

}