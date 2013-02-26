package test;

public class FaultBean
{
	String reporter;
	String short_descript;
	String long_descript;
	String severity;
	int faultID;
	
	public int getFaultID()
	{
		return faultID;
	}
	public void setFaultID(int fault)
	{
		faultID = fault;
	}
	public String getReporter()
	{
		return reporter;
	}
	public void setReporter(String report)
	{
		reporter = report;
	}
	public String getShortDescription()
	{
		return short_descript;
	}
	public void setShortDescription(String shortdesc)
	{
		short_descript = shortdesc;
	}
	public String getLongDescription()
	{
		return long_descript;
	}
	public void setLongDescription(String longdesc)
	{
		long_descript = longdesc;
	}
	public String getSeverity()
	{
		return severity;
	}
	public void setSeverity(String severit)
	{
		severity = severit;
	}
}