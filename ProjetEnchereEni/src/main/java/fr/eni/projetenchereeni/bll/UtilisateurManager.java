package fr.eni.projetenchereeni.bll;


import fr.eni.projetenchereeni.bo.Utilisateurs;
import fr.eni.projetenchereeni.dal.BusinessExceptionDAL;
import fr.eni.projetenchereeni.dal.DAOFactory;
import fr.eni.projetenchereeni.dal.UtilisateursDAO;
import fr.eni.projetenchereeni.dal.UtilisateursDAOJdbcImpl;



public class UtilisateurManager {
	
	private static UtilisateursDAO daoUtilisateurs;
	
	public UtilisateurManager() throws BLLException {
		
		daoUtilisateurs = DAOFactory.getUtilisateursDAO();
	}
	
	public static Utilisateurs creerUtilisateurs(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) throws BusinessExceptionDAL {
		
		BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();

		Utilisateurs utilisateurs = null;
		if(utilisateurs !=null ||  daoUtilisateurs.verifiePseudoEtMail(pseudo, email)) {
			
			utilisateurs = new Utilisateurs();
			utilisateurs.setPseudo(pseudo);
			utilisateurs.setEmail(email);
			utilisateurs.setNom(nom);
			utilisateurs.setPrenom(prenom);
			utilisateurs.setTelephone(telephone);
			utilisateurs.setRue(rue);
			utilisateurs.setCode_postal(codePostal);
			utilisateurs.setVille(ville);
			utilisateurs.setMotDePasse(motDePasse);
			
			daoUtilisateurs.insert(utilisateurs);
			
			
		}else {
			
			throw businessExceptionDAL;
		}
		
		return utilisateurs;
	}
	
	
	public static Utilisateurs loginUtilisateurs (String email, String motDePasse) throws BusinessExceptionDAL {
		
		BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
		Utilisateurs logUtilisateurs = null;
		
		if(logUtilisateurs != null || daoUtilisateurs.verifieMailEtMotDePasse(email, motDePasse)) {
			
			logUtilisateurs = new Utilisateurs();
			logUtilisateurs.setEmail(email);
			logUtilisateurs.setMotDePasse(motDePasse);
			
			daoUtilisateurs.verifieMailEtMotDePasse(email, motDePasse);
		
		}else {
			
			throw businessExceptionDAL;
		}
			
		return logUtilisateurs;
		
	}
	
	/* Mettre à jour un utilisateur*/
	public void update(Utilisateurs utilisateurs) throws BusinessExceptionDAL {
		
	}
	
	private boolean verifieMail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean verifiePseudo(String pseudo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean verifiePseudoEtMail(String pseudo, String email) {
		return false;
		
	}
	
	public boolean verifieMailEtMotDePasse(String mail, String motDePasse) throws BusinessExceptionDAL {
		return daoUtilisateurs.verifieMailEtMotDePasse(mail, motDePasse) ;
		
	}
	
	/* Supprimer un utilisateur*/
	public void delete(Utilisateurs utilisateurs) throws BusinessExceptionDAL{
		daoUtilisateurs.delete(utilisateurs);
	}

	/* Mettre à jour les crédits de l'utilisateurs*/
	void updateCredit(int numUtilisateurs, int newCredit) throws BusinessExceptionDAL{
		daoUtilisateurs.updateCredit(numUtilisateurs, newCredit);
	}
	
	
	
	
}