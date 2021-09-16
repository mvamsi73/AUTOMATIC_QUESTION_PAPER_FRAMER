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

public class signinwelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public signinwelcome() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession ht=request.getSession();
		int id= (Integer) ( ht.getAttribute("id"));
		if(id!=0)
		{
		CRUD cd =new CRUD();
			
				PrintWriter pw=response.getWriter();
				RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
				rd.include(request, response);
				pw.print("<html>"
						+ "<head>"
						+ "<meta charset=\"UTF-8\">"
						+ "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">"
						+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
						+ "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">"
						+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">"
						+ "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>"
						+ "<style>"
						+ ".starter-template { padding: 3rem 1.5rem; text-align: center; }"
						+ "</style>"
						+ "</head>"
						+ "<body>"
						+ "<main role=\"main\" class=\"container\">"
						+ "<div class=\"starter-template\">"
						+ "<h1>Welcome "
						+ ""+cd.getfacultyName(id)+"<br>Your SignIn is Successfull!"
						+ "</h1>"
						+ "</div>"
						+ "</main>"
						+ "</body>"
						+ "</html>");
		
		}
		else
		{
			request.getRequestDispatcher("index.html").include(request, response);
		}
		
	}

}
