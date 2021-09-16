package projectpack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.*;
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignUp() {
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
			int i=cd.insert(sb);
			if(i>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("signupwelcome");
				request.setAttribute("ProjectSignUpBean", sb);
				rd.forward(request, response);
			}
			else
			{
				PrintWriter pw=response.getWriter();
				RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");
				rd.include(request, response);
				pw.print("<p align=center style=\"color:white\">The ID or Email is already taken, Please Register with another credentials</p>");
			}
}
}
