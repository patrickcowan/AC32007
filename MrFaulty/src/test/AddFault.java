package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet ("/AddFault")

public class AddFault extends HttpServlet 
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
			LoginBean login =(LoginBean)session.getAttribute("user");
			RequestDispatcher redi;
		
			redi = request.getRequestDispatcher("/AddFault.jsp");
			redi.forward(request, response);
		} 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
				try
				{
					FaultBean newFaultBean = new FaultBean();
					AddFaultsQuery newQuery = new AddFaultsQuery();

					newFaultBean.setReporter(request.getParameter("reporter"));
					newFaultBean.setSeverity(request.getParameter("severity"));
					newFaultBean.setShortDescription(request.getParameter("short_descript"));
					newFaultBean.setLongDescription(request.getParameter("long_descript"));
					
					
					newFaultBean = newQuery.AddFaultQuery(newFaultBean);
				}
				catch (Exception e)
				{
			    	System.err.println("Couldn't add the fault!");
			    } 
				response.sendRedirect("Index.jsp");
			} 
}