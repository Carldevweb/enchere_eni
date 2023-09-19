package fr.eni.projetenchereeni.dal;


import fr.eni.projetenchereeni.bo.ArticleVendu;

public interface ArticleVenduDAO  {
	
	
	public int selectById(ArticleVendu article) throws BusinessExceptionDAL;
	public int delete(ArticleVendu article) throws BusinessExceptionDAL;
	public void insert(ArticleVendu article) throws BusinessExceptionDAL;
	

}