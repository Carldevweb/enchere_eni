package fr.eni.projetenchereeni.dal;

public class DAOFactory {
	
	public static  UtilisateursDAO getUtilisateursDAO() {
		return new UtilisateursDAOJdbcImpl();
	}
	public static EncheresDAO getEncheresDAO() {
		return new EncheresDAOJdbcImpl();
	}
	public static ArticleVenduDAO getArticleVenduDAO() {
		return new ArticleVenduDAOJdbcImpl();
	}
	public static CategoriesDAO getCategoriesDAO() {
		return new CategoriesDAOJdbcImpl();
	}
	public static RetraitDAO getRetraitDAO() {
		return new RetraitDAOJdbcImpl();
	}
}
