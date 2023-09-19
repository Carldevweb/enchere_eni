package fr.eni.projetenchereeni.dal;

import java.util.List;

import fr.eni.projetenchereeni.bo.Categories;

public interface CategoriesDAO {


	public void insert(Categories var) throws BusinessExceptionDAL;
	public void update(Categories var) throws BusinessExceptionDAL;
	public void delete(Categories var) throws BusinessExceptionDAL;
	
	public Categories selectById(int numCategories) throws BusinessExceptionDAL;
	public String selectByName(String libelle) throws BusinessExceptionDAL;
	public int verifNumCategories (int numCategories) throws BusinessExceptionDAL;
    public String verifLib (String lib) throws BusinessExceptionDAL;
    
    
    public List<Categories> selectAll() throws BusinessExceptionDAL;
    
}
