package test;
import java.sql.*;

public class RegisterQuery
{
	public RegBean RegisterQuery(RegBean newRegBean)
	{
		Connection conn = Connector.connecttoSQL();
		
		PreparedStatement stmt = null; 
		ResultSet rs = null;
		
		String username = newRegBean.getUsername();
		String upassword = newRegBean.getUpassword();

		try
		{			
			String sQuery = "INSERT INTO 12ac3d21.users (username, upassword)" +
		" VALUES ('" + username + "', '" + upassword + "')";
			stmt = conn.prepareStatement(sQuery);
			int temp = stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		}
	    catch (Exception e)
	    {
	    		System.err.println("Got an exception!"); 
	    		System.err.println(e.getMessage()); 
	    		System.out.println("Error!");
	    } 
		return newRegBean;
	}
}