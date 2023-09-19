package fr.eni.projetenchereeni.dal;


import java.util.List;


import fr.eni.projetenchereeni.bo.Encheres;




public interface EncheresDAO {

	public List<Encheres> selectALL() throws BusinessExceptionDAL;
	
	public void update(Encheres data) throws BusinessExceptionDAL;
	
	public void insert(Encheres data) throws BusinessExceptionDAL;
	
	public void delete(Encheres encheres) throws BusinessExceptionDAL;
	
	public List<Integer> selectByNumArticle(Encheres numArticle) throws BusinessExceptionDAL;
}
