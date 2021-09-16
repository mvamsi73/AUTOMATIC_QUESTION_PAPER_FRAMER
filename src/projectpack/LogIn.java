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
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LogIn() {
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String pass=request.getParameter("pass");
		ProjectLogInBean lb=new ProjectLogInBean();
		lb.setId(id);
		lb.setPassword(pass);
		CRUD cd=new CRUD();
			if(cd.validate(lb)==true)
			{
				HttpSession ht=request.getSession();
				ht.setAttribute("id", id);
				RequestDispatcher rd=request.getRequestDispatcher("signinwelcome");
				request.setAttribute("ProjectLogInBean", lb);
				rd.forward(request, response);
			}
			else
			{
				PrintWriter pw=response.getWriter();
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
				pw.print("<p align=center style=\"color:white\">Your SignIn is Failed ,Please check the credentials you have entered</p>");
			}
	}

}
