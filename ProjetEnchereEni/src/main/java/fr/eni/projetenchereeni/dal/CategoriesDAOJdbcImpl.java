package fr.eni.projetenchereeni.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import fr.eni.projetenchereeni.bo.Categories;


public class CategoriesDAOJdbcImpl implements CategoriesDAO{
	
private static final String INSERT="INSERT INTO CATEGORIES(no_categories, libelle); VALUES(?,?)";
private static final String UPDATE="UPDATE INTO CATEGORIES(no_categories, libelle); VALUES(?,?)";	
private static final String DELETE="DELETE INTO CATEGORIES(no_categories, libelle); VALUES(?,?)";
private static final String SELECT_By_Id="SELECTO INTO CATEGORIES(no_categories, libelle); VALUES(?,?)";
private static final String SELECT_By_Name="SELECT * FROM CATEGORIES WHERE libelle = ?";
private static final String VERIF_LIB="SELECT * FROM CATEGORIES WHERE libelle = ?";

@Override
public void insert(Categories var) throws BusinessExceptionDAL 
{
	try (Connection cnx = ConnectionProvider.getConnection()) {
	
		try {
			PreparedStatement pstmt = cnx.prepareStatement(INSERT);
			pstmt.setInt(1, var.getNumCategories());
			pstmt.setString(2, var.getLib());
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
	        BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
	        businessExceptionDAL.ajouterErreur(ErreurCodesDAL.INSERT_SQL_ERREUR);
	        throw businessExceptionDAL;
		}
	
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
}

@Override
public Categories selectById(int numCategories) throws BusinessExceptionDAL 
{
	try (Connection cnx = ConnectionProvider.getConnection()){
		try {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_By_Id);
			pstmt.setInt(1, numCategories);
			pstmt.executeUpdate();
			
			}catch(SQLException e) {
				e.printStackTrace();
		        BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
		        businessExceptionDAL.ajouterErreur(ErreurCodesDAL.SELECT_SQL_ERREUR);
		        throw businessExceptionDAL;
			}
		
	} catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		
return null;

}

@Override
public List<Categories> selectAll() throws BusinessExceptionDAL {
	
	return null;
}
@Override
public void update(Categories var) throws BusinessExceptionDAL 
{
	try (Connection cnx = ConnectionProvider.getConnection()) {
		try {
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE);
			pstmt.setInt(1, var.getNumCategories());
			pstmt.setString(2, var.getLib());
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		    BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
		    businessExceptionDAL.ajouterErreur(ErreurCodesDAL.UPDATE_SQL_ERREUR);
		    throw businessExceptionDAL;
		}
		
	} catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
	
}
@Override
public void delete(Categories var) throws BusinessExceptionDAL 
{
	try (Connection cnx = ConnectionProvider.getConnection()) 
	{
		try {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE);
			pstmt.setInt(1, var.getNumCategories());
			pstmt.setString(2, var.getLib());
			
			pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
	        BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
	        businessExceptionDAL.ajouterErreur(ErreurCodesDAL.DELETE_SQL_ERREUR);
	        throw businessExceptionDAL;
		}
		
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	
}

public String selectByName(String libelle) throws BusinessExceptionDAL {
	try (Connection cnx = ConnectionProvider.getConnection()) 
	{
	    try {
	    	PreparedStatement pstmt = cnx.prepareStatement(SELECT_By_Name);
	        pstmt.setString(1, libelle);
	        
		   }catch (SQLException e){
		    	e.printStackTrace();
		    	BusinessExceptionDAL businessExceptionDAL = new BusinessExceptionDAL();
		        businessExceptionDAL.ajouterErreur(ErreurCodesDAL.SELECT_BY_NAME_SQL_ERREUR);
		        throw businessExceptionDAL;
		    }
    
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	return libelle;}


@Override
public int verifNumCategories(int numCategories) throws BusinessExceptionDAL {
	
	return 0;
}
@Override
public String verifLib(String lib) throws BusinessExceptionDAL {
	
	return null;
}

    
}