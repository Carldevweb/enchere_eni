package fr.eni.projetenchereeni.dal;


import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.eni.projetenchereeni.bo.Encheres;




public class EncheresDAOJdbcImpl implements EncheresDAO {

	public static String INSERT ="INSERT INTO ENCHERES(no_utilisateur, no_article, date_enchere, montant_enchere) VALUES (?, ?, ?, ?)";
	public static String UPDATE ="UPDATE ENCHERES SET no_utilisateur=?, no_article=?, date_enchere=?, montant_enchere=?";
	public static String SELECT_BY_NUM_ARTICLE="SELECT no_utilisateur, no_article, date_enchere, montant_enchere" + "FROM ENCHERES WHERE no_article = ?";	
	
	


	public List<Encheres> selectAll() throws BusinessExceptionDAL {
		// TODO Auto-generated method stub
		return null;
	}

		
	

	@Override
	public List<Encheres> selectALL() throws BusinessExceptionDAL {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Encheres encheres) throws BusinessExceptionDAL {
		try(Connection cnx = ConnectionProvider.getConnection()) {
			
		
		try {
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE);
			pstmt.setInt(1, encheres.getNumUtilisateur());
			pstmt.setInt(2, encheres.getNumArticle());
			pstmt.setObject(3, encheres.getDateEnchere().getTime());
			pstmt.setInt(4, encheres.getMontantEnchere());
			pstmt.executeUpdate();
			cnx.commit();
		} catch (Exception e) {
				e.printStackTrace();
				cnx.rollback();
				throw e;
		}
		
	}
		catch(Exception e)
		{
		e.printStackTrace();
		BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
		businessExceptionDAL.ajouterErreur(ErreurCodesDAL.UPDATE_SQL_ERREUR);
		throw businessExceptionDAL;
		}
	}

	@Override
	public void insert(Encheres encheres) throws BusinessExceptionDAL {
		try(Connection cnx = ConnectionProvider.getConnection()) {
			
		try {
			
			cnx.setAutoCommit(false);
			PreparedStatement pstmt = cnx.prepareStatement(INSERT);
			pstmt.setInt(1, encheres.getNumUtilisateur());
			pstmt.setInt(2, encheres.getNumArticle());
			pstmt.setObject(3, new Date(encheres.getDateEnchere().getTime()));
			pstmt.setInt(4, encheres.getMontantEnchere());
			pstmt.executeUpdate();
			cnx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			cnx.rollback();
			throw e;
		}
	}
		catch(Exception e)
		{
		e.printStackTrace();
		BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
		businessExceptionDAL.ajouterErreur(ErreurCodesDAL.INSERT_SQL_ERREUR);
		throw businessExceptionDAL;
		
	}
}
	@Override
	public void delete(Encheres encheres) throws BusinessExceptionDAL {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> selectByNumArticle(Encheres numArticle) throws BusinessExceptionDAL {

		List<Integer> byNumArticle = new ArrayList<>();
		try(Connection cnx = ConnectionProvider.getConnection()) {
			
		
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_NUM_ARTICLE);
			pstmt.setInt(1, numArticle.getNumArticle());
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			while(rs.next()) {
				byNumArticle.add(rs.getInt("no_article"));
			}
			cnx.close();
		} catch (Exception e) {
			e.printStackTrace();
			BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
			businessExceptionDAL.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
			throw businessExceptionDAL;
		}
		return byNumArticle;
	}
}
	

