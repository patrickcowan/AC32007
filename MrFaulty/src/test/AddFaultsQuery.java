package test;
import java.sql.*;

public class AddFaultsQuery
{
	public FaultBean AddFaultQuery(FaultBean newFaultBean)
	{
		Connection conn = Connector.connecttoSQL();
		
		PreparedStatement stmt = null; 
		ResultSet rs = null;
		
		String shortdesc = newFaultBean.getShortDescription();
		String longdesc = newFaultBean.getLongDescription();
		String reporter = newFaultBean.getReporter();
		String severity = newFaultBean.getSeverity();
		
		try
		{			
			String sQuery = "INSERT INTO 12ac3d21.AddFault (reporter_name, severity, short_description, long_description)" +
		" VALUES ('" + reporter + "', '" + severity + "', '" + shortdesc + "', '" + longdesc + "')";
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
		return newFaultBean;
	}
}