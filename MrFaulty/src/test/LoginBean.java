package test;

public class LoginBean
{
	String username;
	String password;
	boolean loggedin = false;
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String user)
	{
		username = user;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String pass)
	{
		password = pass;
	}
	
	public void setLoggedIn()
	{
		loggedin = true;
	}
	
	public boolean getLoginBool()
	{
		return loggedin;
	}
	
	public void setLoggedOut()
	{
		loggedin = false;
	}
	
}