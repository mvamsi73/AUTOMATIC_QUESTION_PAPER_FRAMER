package projectpack;

import java.io.IOException;
import java.io.PrintWriter;
import bean.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class semesterserv
 */
public class semesterserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int semnum=Integer.parseInt(request.getParameter("semnum"));
		String semtype=request.getParameter("semtype");
		int numofst=Integer.parseInt(request.getParameter("numofst"));
		int numofbranch=Integer.parseInt(request.getParameter("numofbranch"));
		semesterbean sb=new semesterbean();
		CRUD cd=new CRUD();
		int paperid;
		if(cd.getpaperid().equals("null"))
		{
			paperid=1;
		}
		else
		{
			paperid=Integer.parseInt(cd.getpaperid())+1;
		}
		sb.setPaperid(paperid);
		sb.setSemnum(semnum);
		sb.setSemtype(semtype);
		sb.setNumofst(numofst);
		sb.setNumofbranch(numofbranch);
		int i=cd.insertsemester(sb);
		if(i>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("branch.jsp");
			request.setAttribute("paperid", paperid);
			rd.forward(request, response);
		}
		else
		{
			PrintWriter pw=response.getWriter();
			request.getRequestDispatcher("semestermod.html").include(request, response);
			pw.print("Something went wrong try again");
		}
	}

}
