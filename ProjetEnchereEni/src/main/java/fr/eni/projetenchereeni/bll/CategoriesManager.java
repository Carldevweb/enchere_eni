package fr.eni.projetenchereeni.bll;

import fr.eni.projetenchereeni.bo.Categories;
import fr.eni.projetenchereeni.dal.BusinessExceptionDAL;
import fr.eni.projetenchereeni.dal.CategoriesDAO;
import fr.eni.projetenchereeni.dal.DAOFactory;

public class CategoriesManager {
	
	private static CategoriesDAO daoCategories;
	public CategoriesManager() throws BLLException
	{
		daoCategories = DAOFactory.getCategoriesDAO();
	}
	
public void insert(Categories var) throws BusinessExceptionDAL{
	try {
		daoCategories.insert(var);
	} catch (BusinessExceptionDAL e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public Categories selectById(int numCategories) throws BusinessExceptionDAL{
	return daoCategories.selectById(numCategories);
	
}

public void update(Categories var) throws BusinessExceptionDAL{
	try {
		daoCategories.update(var);
	} catch (BusinessExceptionDAL e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


public void delete(Categories var) throws BusinessExceptionDAL {
	try {
		daoCategories.delete(var);
	} catch (BusinessExceptionDAL e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public int verifNumCategories(int numCategories) throws BusinessExceptionDAL {
 return daoCategories.verifNumCategories(numCategories);
}

public String verifLib(String lib) throws BusinessExceptionDAL {
	
	return null;
}

}