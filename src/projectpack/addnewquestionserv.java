package projectpack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;
/**
 * Servlet implementation class addnewquestionserv
 */
public class addnewquestionserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession ht=request.getSession();
		String id=(String.valueOf(ht.getAttribute("id")));
		if(!id.equals("null"))
		   {
		String qdiscription=request.getParameter("qdiscription");
		String dlevel=request.getParameter("dlevel");
		PrintWriter pw=response.getWriter();
		if(dlevel.equals("easy"))
		{
			neweasyquestionbean qb=new neweasyquestionbean();
			qb.setDifficultylevel(dlevel);
			qb.setQuestiondescription(qdiscription);
			CRUD cd=new CRUD();
			if(cd.inserteasyquestion(qb)>0)
			{
				request.getRequestDispatcher("adminhome.jsp").include(request, response);
				pw.print("<p align='center' style='color:white'>New Question paper is Added</p>");
			}
			else
			{
				request.getRequestDispatcher("adminhome.jsp").include(request, response);
				pw.print("<p align='center' style='color:white'>Something went wrong</p>");
			}
		}
		else if(dlevel.equals("medium"))
		{
			newmediumquestionbean qb=new newmediumquestionbean();
			qb.setDifficultylevel(dlevel);
			qb.setQuestiondescription(qdiscription);
			CRUD cd=new CRUD();
			if(cd.insertmediumquestion(qb)>0)
			{
				request.getRequestDispatcher("adminhome.jsp").include(request, response);
				pw.print("<p align='center' style='color:white'>New Question paper is Added</p>");
			}
			else
			{
				request.getRequestDispatcher("adminhome.jsp").include(request, response);
				pw.print("<p align='center' style='color:white'>Something went wrong</p>");
			}
		}
		else if(dlevel.equals("hard"))
		{
			newhardquestionbean qb=new newhardquestionbean();
			qb.setDifficultylevel(dlevel);
			qb.setQuestiondescription(qdiscription);
			CRUD cd=new CRUD();
			if(cd.inserthardquestion(qb)>0)
			{
				
				request.getRequestDispatcher("adminhome.jsp").include(request, response);
				pw.print("<p align='center' style='color:white'>New Question paper is Added</p>");
			}
			else
			{
				request.getRequestDispatcher("adminhome.jsp").include(request, response);
				pw.print("<p align='center' style='color:white'>Something went wrong</p>");
			}
		}
		else
		{
			request.getRequestDispatcher("addnewquestion.jsp").include(request, response);
			pw.print("<p style='color:red' align='center'>Please select the question difficulty level</p>");
		}
		   }
		else
		{
			response.sendRedirect("adminlogin.html");
		}
		
	}

}
