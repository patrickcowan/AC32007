package test;
import java.sql.*;

public class DeleteFaultsQuery
{
	public FaultBean DeleteFaultsQuery(FaultBean newFaultBeanD)
	{
		Connection conn = Connector.connecttoSQL();
		PreparedStatement stmt = null; 

		try
		{
			int ID = newFaultBeanD.getFaultID();			
			String sQuery = ("DELETE FROM addfault WHERE ID = '"+ID+"'");

			stmt = conn.prepareStatement(sQuery);
			int temp = stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		}
		
	    catch (Exception e)
	    {
	    		System.err.println("Got an exception!"); 
	    		System.err.println(e.getMessage()); 
	    } 
		return newFaultBeanD;
	}
	
}