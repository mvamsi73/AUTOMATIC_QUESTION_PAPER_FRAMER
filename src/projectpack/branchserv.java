package projectpack;
import bean.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class branchserv
 */
public class branchserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int paperid=Integer.parseInt(request.getParameter("paperid"));
		String branch=request.getParameter("bname");
		int numofcourses=Integer.parseInt(request.getParameter("ccount"));
		int numofstudents=Integer.parseInt(request.getParameter("scount"));
		CRUD cd=new CRUD();
		branchbean bb=new branchbean();
		bb.setPaperid(paperid);
		bb.setBranch(branch);
		bb.setNumofcourses(numofcourses);
		bb.setNumofstudents(numofstudents);
		if(cd.insertbranch(bb)>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("course.jsp");
			request.setAttribute("paperid", paperid);
			rd.forward(request, response);
		}
		else
		{
			PrintWriter pw=response.getWriter();
			request.getRequestDispatcher("branch.html").include(request, response);
			pw.print("Something went wrong please try again later");
		}
	}

}
