package fr.eni.projetenchereeni.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import fr.eni.projetenchereeni.bo.Retrait;

public class RetraitDAOJdbcImpl implements RetraitDAO{
	
	
private static final String SELECT_ALL="SELECT * FROM RETRAIT(no_articles, rue, code_postal, ville)  VALUES(?,?,?,?);";

		@Override
		public List<Retrait> selectALL(Retrait retrait) throws BusinessExceptionDAL {
			List<Retrait> retrait1 = new ArrayList<Retrait>();
			
			try(Connection cnx = ConnectionProvider.getConnection())
			{
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next())
				{
					retrait1.add(map(rs));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				BusinessExceptionDAL businessException = new BusinessExceptionDAL();
				
				throw businessException;
			}
			return retrait1;
			
	
			
}

		private Retrait map(ResultSet rs) throws SQLException {
				
			int numArticle = rs.getInt("numArticle");
			String rue = rs.getString("rue");
			String codePostal = rs.getString("codePostal");
			String ville = rs.getString("ville");
			return new Retrait(numArticle, rue, codePostal,ville);
		}

		
}