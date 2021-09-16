package projectpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class deleteaccount
 */
public class deleteaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteaccount() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession ht=request.getSession();
		String id=String.valueOf(ht.getAttribute("id"));
		if(!id.equals("null"))
		{
		int key=Integer.parseInt(request.getParameter("id"));
		CRUD cd=new CRUD();
		PrintWriter pw=response.getWriter();
		if(cd.deleteaccount(key)>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("deleteaccount.jsp");
			rd.include(request, response);
			pw.print("<br><h1 align='center'>Deletion of ID "+String.valueOf(key)+" is Successfull!<h1>");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("deleteaccount.jsp");
			rd.include(request, response);
			pw.print("<h1 align='center'>Deletion of ID "+String.valueOf(key)+" is Failed!<h1>");
		}
		
	}
		else
		{
			response.sendRedirect("adminlogin.html");
		}
	}

}
