package fr.eni.projetenchereeni.dal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projetenchereeni.bo.Utilisateurs;



public class UtilisateursDAOJdbcImpl implements UtilisateursDAO {
	
	public static String INSERT = "INSERT INTO UTILISATEURS (pseudo , nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static String UPDATE = "UPDATE UTILISATEURS SET pseudo= ?, nom= ?, prenom= ?, email= ?, telephone= ?, rue= ?, code_postal= ?, ville= ?, mot_de_passe= ?, credit= ?, administrateur= ?";
	public static String VERIFIE_PSEUDO = "SELECT * FROM UTILISATEURS WHERE pseudo = ?";
	public static String VERIFIE_MAIL = "SELECT * FROM UTILISATEURS WHERE email = ?";
	public static String VERIFIE_PSEUDO_ET_MAIL = "SELECT * FROM UTILISATEURS WHERE pseudo LIKE ? OR email LIKE ?";
	public static String VERIFIE_MAIL_ET_MOT_DE_PASSE = "SELECT * FROM UTILISATEURS WHERE email LIKE ? AND mot_de_passe LIKE ?";
	public static String UPDATE_CREDIT = "UPDATE UTILISATEURS SET credit = ? WHERE no_utilisateur = ?";
	public static String SELECT_ALL = "SELECT * FROM UTILISATEURS";
	public static String DELETE = "DELETE FROM UTILISATEURS WHERE no_utilisateur = ?";


	public Utilisateurs selectById(int id) throws BusinessExceptionDAL {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Utilisateurs> selectAll() throws BusinessExceptionDAL {
		List<Utilisateurs> utilisateurs = new ArrayList<>();
		try (Connection cnx = ConnectionProvider.getConnection())
			{
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
				pstmt.execute();
				
				ResultSet rs = pstmt.getResultSet();
				while(rs.next()) {
				utilisateurs.add(hydrateUtilisateurs(rs));
				}
			} catch (SQLException e) {
				e.printStackTrace();
				BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
				businessExceptionDAL.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
				throw businessExceptionDAL;
			}
		return utilisateurs;
			
	}

	private Utilisateurs hydrateUtilisateurs(ResultSet rs) throws SQLException {
		return new Utilisateurs(
				rs.getInt("no_utilisateur"),
				rs.getString("pseudo"),
				rs.getString("nom"),
				rs.getString("prenom"),
				rs.getString("email"),
				rs.getString("telephone"),
				rs.getString("rue"),
				rs.getString("code_postal"),
				rs.getString("ville"),
				rs.getString("mot_de_passe"),
				rs.getInt("credit"),
				rs.getBoolean("administrateur"));
	}


	public void delete(Utilisateurs utilisateurs) throws BusinessExceptionDAL {
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			try {
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(DELETE);
			pstmt.setInt(1, utilisateurs.getNumUtilisateur());
			pstmt.setString(2, utilisateurs.getPseudo());
			pstmt.executeUpdate();
			cnx.commit();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				cnx.rollback();
				throw e;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessExceptionDAL businessException = new BusinessExceptionDAL();
			businessException.ajouterErreur(ErreurCodesDAL.DELETE_SQL_ERREUR);
			throw businessException;
		}

	}


	@Override
	public List<Utilisateurs> selectALL() throws BusinessExceptionDAL {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Utilisateurs utilisateurs) throws BusinessExceptionDAL {
		
		try (Connection cnx = ConnectionProvider.getConnection()) {
			
		
		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(INSERT);
			pstmt.setString(1, utilisateurs.getPseudo());
			pstmt.setString(2, utilisateurs.getNom());
			pstmt.setString(3, utilisateurs.getPrenom());
			pstmt.setString(4, utilisateurs.getEmail());
			pstmt.setString(5, utilisateurs.getTelephone());
			pstmt.setString(6, utilisateurs.getRue());
			pstmt.setString(7, utilisateurs.getCodePostal());
			pstmt.setString(8, utilisateurs.getVille());
			pstmt.setString(9, utilisateurs.getMotDePasse());
			pstmt.setInt(10, utilisateurs.getCredit());
			pstmt.setBoolean(11, utilisateurs.getAdministrateur());
			pstmt.executeUpdate();
			cnx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		businessException.ajouterErreur(ErreurCodesDAL.INSERT_SQL_ERREUR);
		throw businessException;
	}

	}
	

	@Override
	public void insert(Utilisateurs utilisateurs) throws BusinessExceptionDAL {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			
		
		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(INSERT);
			pstmt.setString(1, utilisateurs.getPseudo());
			pstmt.setString(2, utilisateurs.getNom());
			pstmt.setString(3, utilisateurs.getPrenom());
			pstmt.setString(4, utilisateurs.getEmail());
			pstmt.setString(5, utilisateurs.getTelephone());
			pstmt.setString(6, utilisateurs.getRue());
			pstmt.setString(7, utilisateurs.getCodePostal());
			pstmt.setString(8, utilisateurs.getVille());
			pstmt.setString(9, utilisateurs.getMotDePasse());
			pstmt.setInt(10, utilisateurs.getCredit());
			pstmt.setBoolean(11, utilisateurs.getAdministrateur());
			pstmt.executeUpdate();
			cnx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		businessException.ajouterErreur(ErreurCodesDAL.INSERT_SQL_ERREUR);
		throw businessException;
	}
	}


	@Override
	public boolean verifiePseudo(String pseudo) throws BusinessExceptionDAL {
		boolean unique = true;
		try (Connection cnx = ConnectionProvider.getConnection()) {

		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(VERIFIE_PSEUDO);
			pstmt.setString(1, pseudo);
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			if(rs.next()) {
				unique = false;
			}cnx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		businessException.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
		throw businessException;
	}
		return unique;
	}

	@Override
	public boolean verifieMail(String mail) throws BusinessExceptionDAL {
		boolean unique = true;
		try (Connection cnx = ConnectionProvider.getConnection()) {
		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(VERIFIE_MAIL);
			pstmt.setString(1, mail);
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			if(rs.next()) {
				unique = false;
			}cnx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		businessException.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
		throw businessException;
	}
		return unique;
	}

	@Override
	public void updateCredit(int numUtilisateurs, int newCredit) throws BusinessExceptionDAL {
		try (Connection cnx = ConnectionProvider.getConnection()) {
		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE_CREDIT);
			pstmt.setInt(1, newCredit);
			pstmt.setInt(2, numUtilisateurs);
			pstmt.executeUpdate();
			cnx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		businessException.ajouterErreur(ErreurCodesDAL.UPDATE_SQL_ERREUR);
		throw businessException;
	}
	

	}


	@Override
	public boolean verifiePseudoEtMail(String pseudo, String mail) throws BusinessExceptionDAL {
		boolean unique = true;
		try (Connection cnx = ConnectionProvider.getConnection()) {
		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(VERIFIE_PSEUDO_ET_MAIL);
			pstmt.setString(1, pseudo);
			pstmt.setString(2, mail);
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			if(rs.next()) {
				unique = false;
			}cnx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		businessException.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
		throw businessException;
	}
		return unique;
	}


	@Override
	public boolean verifieMailEtMotDePasse(String mail, String motDePasse) throws BusinessExceptionDAL {
		boolean unique = false;
		try (Connection cnx = ConnectionProvider.getConnection()) {
		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(VERIFIE_MAIL_ET_MOT_DE_PASSE);
			pstmt.setString(1, mail);
			pstmt.setString(2, motDePasse);
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			if(rs.next()) {
				unique = true;
			}cnx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		BusinessExceptionDAL businessException = new BusinessExceptionDAL();
		businessException.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
		throw businessException;
	}
		return unique;
	
}
}
