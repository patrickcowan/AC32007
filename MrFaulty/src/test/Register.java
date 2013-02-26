package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet ("/Register")

public class Register extends HttpServlet 
{
	PrintWriter out = null;
	
	public void init(ServletConfig conf) throws ServletException 
	{
		super.init(conf);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException 
		{
			HttpSession session=request.getSession();
			RegBean register =(RegBean)session.getAttribute("user");
			RequestDispatcher rd;
		
			rd = request.getRequestDispatcher("/Register.jsp");
			rd.forward(request, response);
		} 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
				try
				{
					RegBean newRegBean = new RegBean();
					RegisterQuery newQuery = new RegisterQuery();

					newRegBean.setUsername(request.getParameter("username"));
					newRegBean.setUpassword(request.getParameter("upassword"));
					
					
					newRegBean = newQuery.RegisterQuery(newRegBean);
				}
				catch (Exception e)
				{
			    	System.err.println("Couldn't add the username!");
			    } 
				response.sendRedirect("Login.jsp");
			} 
}