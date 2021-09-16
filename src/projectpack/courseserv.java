package projectpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;
public class courseserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String cname=request.getParameter("cname");
		String ccode=request.getParameter("ccode");
		HttpSession ht=request.getSession();
		ht.setAttribute("cname", cname);
		ht.setAttribute("ccode", ccode);
		int numofst=Integer.parseInt(request.getParameter("numofstudents"));
		int paperid=Integer.parseInt(request.getParameter("paperid"));
		coursebean cb=new coursebean();
		cb.setCoursecode(ccode);
		cb.setCoursename(cname);
		cb.setNumofstudents(numofst);
		cb.setPaperid(paperid);
		CRUD cd=new CRUD();
		if(cd.insertcourse(cb)>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("quesanddifflevel.jsp");
			request.setAttribute("paperid", paperid);
			rd.forward(request, response);
		}
		else
		{
			PrintWriter pw=response.getWriter();
			request.getRequestDispatcher("course.jsp").include(request, response);
			pw.print("Something went wrong please try again ");
		}
	}

}
