package projectpack;


import java.io.IOException;
import java.io.PrintWriter;
import bean.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class adminlogin
 */
public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlogin() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("pass");
		admin acd=new admin();
		acd.setId(id);
		acd.setPassword(password);
		CRUD cd=new CRUD();
		PrintWriter pw=response.getWriter();
		if(cd.adminvalidate(acd))
		{
			HttpSession ht=request.getSession();
			ht.setAttribute("id", id);
			RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
			request.setAttribute("admin", acd);
			rd.forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("adminlogin.html").include(request, response);
			pw.print("<p align=center style=\"color:white\">Your SignIn is Failed ,Please check the credentials you have entered</p>");
		}
		
	}

}
