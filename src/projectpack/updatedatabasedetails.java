package projectpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ProjectSignUpBean;

/**
 * Servlet implementation class updatedatabasedetails
 */
public class updatedatabasedetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatedatabasedetails() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phnum=request.getParameter("phnum");
		String sub=request.getParameter("sub");
		String dept=request.getParameter("dept");
		String pos=request.getParameter("pos");
		String pass=request.getParameter("pass");
		int key=Integer.parseInt(request.getParameter("key"));
		CRUD cd=new CRUD();
		ProjectSignUpBean sb=new ProjectSignUpBean();
		sb.setId(id);
		sb.setName(name);
		sb.setEmail(email);
		sb.setPhno(phnum);
		sb.setSubject(sub);
		sb.setDept(dept);
		sb.setPosition(pos);
		sb.setPassword(pass);
			int i=cd.updatedetails(sb, key);
			if(i>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("updateaccount.jsp");
				request.setAttribute("ProjectSignUpBean", sb);
				rd.include(request, response);
				PrintWriter pw=response.getWriter();
				pw.print("<h1 align='center'>Updation is Successful<h1>");
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("updateaccount.jsp");
				request.setAttribute("ProjectSignUpBean", sb);
				rd.include(request, response);
				PrintWriter pw=response.getWriter();
				pw.print("<h1 align='center'>Updation is Failed<h1>");
			}
		
	}

}
