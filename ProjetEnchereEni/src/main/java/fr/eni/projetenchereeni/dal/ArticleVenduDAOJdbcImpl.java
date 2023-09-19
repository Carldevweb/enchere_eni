package fr.eni.projetenchereeni.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import fr.eni.projetenchereeni.bo.ArticleVendu;



public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO{
	

private static final String SELECT_BY_ID="SELECT_BY_ID(no_article,nom_article,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) WHERE ARTICLES_VENDUS";
private static final String DELETE="DELETE (no_article,nom_article,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) WHERE ARTICLES_VENDUS";
private static final String INSERT="INSERT INTO ARTICLES_VENDUS (nom_article,date_debut_encheres,date_fin_encheres,prix_initial,no_categorie) VALUE (?,?,?,?,?,?,?)";



@Override
public void insert(ArticleVendu article) throws BusinessExceptionDAL {
	
	try(Connection cnx = ConnectionProvider.getConnection()) 
	{
		PreparedStatement pstmt = cnx.prepareStatement(INSERT);
		pstmt.setString(1, article.getNomArticle());
		pstmt.setString(2, article.getDescription());
		pstmt.setDate(3, article.getDateDebutEnchere());
		pstmt.setInt(4, article.getPrixInitial());
		pstmt.setDate(5, article.getDateFinEnchere());
		pstmt.setInt(6, article.getNumCategorie());

		pstmt.executeQuery();
		cnx.close();
		ResultSet rs = pstmt.getGeneratedKeys();
		if(rs.next()) {
			article.setNumArticle(1);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
        businessException.ajouterErreur(ErreurCodesDAL.INSERT_SQL_ERREUR);
        throw businessException;
	}
	
	
	
}



@Override
public int selectById(ArticleVendu article) throws BusinessExceptionDAL {
	if (article==null) {
		
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		throw businessException;
	}
	
	try(Connection cnx = ConnectionProvider.getConnection()) 
	{
		PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID);
		pstmt.setString(1, article.getNomArticle());
		pstmt.setString(2, article.getDescription());
		pstmt.setInt(3, article.getPrixVente());
		pstmt.setInt(4, article.getPrixInitial());
		pstmt.setDate(5, article.getDateFinEnchere());
		pstmt.executeQuery();
		cnx.close();
		ResultSet rs = pstmt.getGeneratedKeys();
		if(rs.next()) {
			article.setNumArticle(1);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
		 BusinessExceptionDAL businessException = new BusinessExceptionDAL();
	        businessException.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
	        throw businessException;
	}
	return 0;	
}

public int delete(ArticleVendu article) throws BusinessExceptionDAL {
	

	try(Connection cnx = ConnectionProvider.getConnection()) 
	{
		PreparedStatement pstmt = cnx.prepareStatement(DELETE);
		pstmt.setString(1, article.getNomArticle());
		pstmt.setString(2, article.getDescription());
		pstmt.setInt(3, article.getPrixVente());
		pstmt.setInt(4, article.getPrixInitial());
		pstmt.setDate(5, article.getDateFinEnchere());
		pstmt.executeQuery();
		cnx.close();
		ResultSet rs = pstmt.getGeneratedKeys();
		if(rs.next()) {
			article.setNumArticle(1);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
        businessException.ajouterErreur(ErreurCodesDAL.DELETE_SQL_ERREUR);
        throw businessException;
	}
	return 0;	
}


}