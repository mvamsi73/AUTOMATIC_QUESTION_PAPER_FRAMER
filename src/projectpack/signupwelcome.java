package projectpack;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.*;
/**
 * Servlet implementation class signupwelcome
 */
public class signupwelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupwelcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ProjectSignUpBean sb= (ProjectSignUpBean) request.getAttribute("ProjectSignUpBean");
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
		rd.include(request, response);
		pw.print("<p align='center' style='color:white'>New Account added with ID:"+sb.getId()+"</p>");
		
	}

}
