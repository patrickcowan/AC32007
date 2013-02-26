package test;

import java.sql.*;


public class LoginQuery
{
	public LoginQuery()
	{
	}
	
	public void Logon(LoginBean newBean)
	{
		try
		{
			Connection conn = Connector.connecttoSQL();	
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			String username;
			String password;
			
			username = newBean.getUsername();
			password = newBean.getPassword();
			
			String sQuery = "SELECT * FROM users WHERE username = '"+username+"' AND upassword = '"+password+"'";
			stmt = conn.prepareStatement(sQuery);
			rs = stmt.executeQuery();
			
			if(rs.next())
			{
				newBean.setLoggedIn();
			}
				
			rs.close();
			stmt.close();
			conn.close();
		}
		catch (Exception e)
		{
	    		System.err.println("Error!");
	    } 
	}
}
