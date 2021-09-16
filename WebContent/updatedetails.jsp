<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.*" %>
    <%@ page import="projectpack.CRUD" %>
    <%@ page import="bean.*" %>
    <%@ page import="java.util.*" %>
<!doctype html>
<html lang="en">
<head>
   <!-- Required meta tags -->
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
   <script src="https://kit.fontawesome.com/982d9630c6.js" crossorigin="anonymous"></script>

   <!-- Google Font Root Link -->
   <link rel="preconnect" href="https://fonts.gstatic.com">
   <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@800&display=swap" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Cabin:wght@700&display=swap" rel="stylesheet">
<% HttpSession ht=request.getSession();
	String id=String.valueOf(ht.getAttribute("id"));
	if(!id.equals("null"))
	{
%>
<title>Enter New Details</title>

<script type="text/javascript">
function validate()
{
var id=document.signup.id.value;
var name=document.signup.name.value;
var email=document.signup.email.value;
var phnum=document.signup.phnum.value;
var sub=document.signup.sub.value;
var dept=document.signup.dept.value;
var pos=document.signup.pos.value;
var pass=document.signup.pass.value;
if(id=="")
	{
	alert("Id field should not be empty");
	document.signup.id.focus();
	return false;
	
	}
else if(name=="")
	{
	alert("Name field should not be empty");
	document.signup.name.focus();
	return false;
	}
else if(email=="")
{
alert("Email field should not be empty");
document.signup.email.focus();
return false;
}
else if(phnum=="")
{
alert("Phone Number field should not be empty");
document.signup.phnum.focus();
return false;
}
else if(sub=="")
{
alert("Subject field should not be empty");
document.signup.sub.focus();
return false;
}
else if(dept=="")
{
alert("Department field should not be empty");
document.signup.dept.focus();
return false;
}
else if(pos=="")
{
alert("Position field should not be empty");
document.signup.pos.focus();
return false;
}
else if(pass=="")
{
alert("Password field should not be empty");
document.signup.pass.focus();
return false;
}
if(pass.length<8)
	{
	alert("Password Should be 8 characters long");
	document.signup.pass.focus();
	return false;
	}
}
</script>
<style>

	/* Styles for Navbar */
	.bg-light {
		background-color: #ffffff!important;
		box-shadow: 0 20px 40px -14px rgba(0, 0, 0, 0.25);
	}
	.nav_bar_title {
		font-size: 25px;
	}

	@media (max-width: 768px) {
		.nav_bar_title {
			font-size: 20px;
		}
	}

	body {
		margin: 0;
		padding: 0;
		background-image: url("login.webp");
		background-repeat: no-repeat;
		background-size: cover;
		background-color: #ffffff;
	}

	#login .container #login-row #login-column #login-box {
		max-width: 600px;
		background-color: #ffffff;
	}

	#login .container #login-row #login-column #login-box #login-form {
		padding: 20px;
	}

	#login .container #login-row #login-column #login-box #login-form #register-link {
		margin-top: -85px;
	}

	form label {
		font-weight:bold;
	}
	.login_button {
    background-color: #7e57c2;
    padding: 10px;
    color: white;
    border-radius: 5px;
    font-family: 'Raleway', sans-serif;
  }
</style>
</head>
<body>
<% 
CRUD cd=new CRUD();
int key=Integer.parseInt(request.getParameter("id"));
List<ProjectSignUpBean> lst=cd.getdetailsbyid(key);
%>

   <nav class="navbar sticky-top navbar-light bg-light" style="padding: 18px;">
      <div class="navbar-brand">
          <span style="font-weight: 500; font-family: 'Cabin', sans-serif; display: flex; color: #3c4043;" class="nav_bar_title">
              IWe - Make Task Easy
          </span>
      </div>
      <div>
          <a href="adminhome.jsp" style="color: white; background-color: #007bff; text-decoration: none;" class="login_button"><b>Home</b></a>
          <a href="./logout" style="color: white; text-decoration: none;" class="login_button"><b>Logout</b></a>
      </div>
  </nav>
  
  	<div id="login" style="padding-top: 50px; padding-bottom: 50px;">
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12" style="border-radius: 5px;">
                        <form id="login-form" class="form" name="signup" action="updatedatabasedetails" method="post" onsubmit="return validate()">
                            <h3 class="text-center text-info"><i class="fas fa-user-edit"></i> <b> Update Details </b> </h3>
                            <div class="form-group">
                                <label for="id" class="text-info"><i class="fas fa-id-badge"></i> User ID:</label><br>
                                <input type="number" name="id" placeholder="User-Id" value='<%= lst.get(0).getId() %>' class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="name" class="text-info"><i class="fas fa-user"></i> Name:</label><br>
                                <input type="text" name="name" placeholder="User-Name" value='<%=lst.get(0).getName()%>' class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="email" class="text-info"><i class="fas fa-envelope"></i> EMail:</label><br>
                                <input type="email" name="email" placeholder="Email"  value='<%=lst.get(0).getEmail()%>' class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="phnum" class="text-info"><i class="fas fa-phone-square"></i> Phone No.:</label><br>
                                <input type="number" name="phnum" placeholder="Phone Number"  value='<%=lst.get(0).getPhno()%>' class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="sub" class="text-info"><i class="fab fa-steam-square"></i> Subject:</label><br>
                                <input type="text" name="sub" placeholder="Subject" value='<%=lst.get(0).getSubject()%>' class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="dept" class="text-info"><i class="fas fa-code-branch"></i> Department:</label><br>
                                <input type="text" name="dept" placeholder="Department" value='<%=lst.get(0).getDept()%>' class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="pos" class="text-info"><i class="fas fa-user-tag"></i> Position:</label><br>
                                <input type="text" name="pos" placeholder="Designation" value='<%=lst.get(0).getPosition()%>' class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="pass" class="text-info"><i class="fas fa-key"></i> Password:</label><br>
                                <input type="text" name="pass" placeholder="Password" value='<%=lst.get(0).getPassword()%>' class="form-control">
                            </div>
                            <input type="hidden" name="key" value=<%=key %>>
                            <div class="form-group">
                                <button type="submit" name="submit" class="btn btn-info"><i class="fa fa-user-edit" aria-hidden="true"></i> <b> Update - Details </b> </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
<%}
	else
	{
		response.sendRedirect("adminlogin.html");
	}
%>