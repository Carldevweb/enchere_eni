package fr.eni.projetenchereeni.bll;

import java.util.List;

import fr.eni.projetenchereeni.bo.Encheres;
import fr.eni.projetenchereeni.dal.BusinessExceptionDAL;
import fr.eni.projetenchereeni.dal.DAOFactory;
import fr.eni.projetenchereeni.dal.EncheresDAO;



public class EncheresManager 
{

    private static EncheresDAO daoEncheres;
    public EncheresManager() throws BLLException 
    {

        daoEncheres = DAOFactory.getEncheresDAO();
    }




public List<Encheres> getEncheres() throws BLLException 
{
		List<Encheres> encheres = null;

try {
			encheres = daoEncheres.selectALL();
		} catch (BusinessExceptionDAL e) {
	e.printStackTrace();
	throw new BLLException();
} 
		return encheres;
}


/* Créer une enchère */

public static void creerEnchere(Encheres encheres) throws BLLException
{
	try {
		daoEncheres.insert(encheres);
	} catch (BusinessExceptionDAL e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


/* Supprimer une enchère*/

public void delete(Encheres encheres) throws BLLException {
	
	try {
		daoEncheres.delete(encheres);
	} catch (BusinessExceptionDAL e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

/* Selectionner une enchère par son numéro d'article*/
/* À check plus tard */

public List<Integer> selectByNumArticle(Encheres numArticle) throws BLLException, BusinessExceptionDAL  {

		return daoEncheres.selectByNumArticle(numArticle);
}


/* Mettre à jour une enchère*/
public void update(Encheres encheres) throws BLLException {
	
	try {
		daoEncheres.update(encheres);
	} catch (BusinessExceptionDAL e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}



}