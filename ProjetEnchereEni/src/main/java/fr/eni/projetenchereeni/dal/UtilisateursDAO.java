package fr.eni.projetenchereeni.dal;


import java.util.List;
import fr.eni.projetenchereeni.bo.Utilisateurs;


public interface UtilisateursDAO {
	
	public List<Utilisateurs> selectALL() throws BusinessExceptionDAL;
	
	public void update(Utilisateurs data) throws BusinessExceptionDAL;
	
	public void insert(Utilisateurs data) throws BusinessExceptionDAL;
	
	public void delete(Utilisateurs utilisateurs) throws BusinessExceptionDAL;
	
	boolean verifiePseudo (String pseudo) throws BusinessExceptionDAL;
	
	boolean verifieMail (String mail) throws BusinessExceptionDAL;
	
	boolean verifiePseudoEtMail (String pseudo, String mail) throws BusinessExceptionDAL;
	
	boolean verifieMailEtMotDePasse(String mail, String motDePasse) throws BusinessExceptionDAL;

	void updateCredit(int numUtilisateurs, int newCredit) throws BusinessExceptionDAL;
	
	

}
