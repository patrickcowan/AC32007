package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet ("/DeleteFault")

public class DeleteFault extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;
	PrintWriter out = null;
	
	public void init(ServletConfig conf) throws 	ServletException 
	{
		super.init(conf);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException 
		{
			HttpSession session=request.getSession();
			LoginBean login =(LoginBean)session.getAttribute("user");
			RequestDispatcher rd;
			
			rd = request.getRequestDispatcher("/Delete.jsp");
			rd.forward(request, response);
		} 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
				try
				{
					FaultBean newFaultBeanD = new FaultBean();
					DeleteFaultsQuery newQueryD = new DeleteFaultsQuery();

					int faultID = Integer.parseInt(request.getParameter("fault"));
					newFaultBeanD.setFaultID(faultID);

					newQueryD.DeleteFaultsQuery(newFaultBeanD);
					newFaultBeanD = newQueryD.DeleteFaultsQuery(newFaultBeanD);
					
				}
				catch (Exception e)
				{
			    } 
				response.sendRedirect("Index.jsp");
			} 
}