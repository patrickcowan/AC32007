package test;

import java.sql.*;


public final class Connector
{
	public static Connection connecttoSQL()
	{
		Connection conn = null;
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl; 
			connectionUrl = "jdbc:mysql://arlia.computing.dundee.ac.uk/12ac3d21";
			conn = DriverManager.getConnection(connectionUrl,"12ac3u21", "222ccc");
		}
		catch(Exception ex)
		{
			System.out.println("Could not connect");
		}
		return conn;
	}	
}