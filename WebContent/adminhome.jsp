<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.*" %>

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
   <title>ADMIN HOME - IWe</title>
</head>

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
  
      /* Float four columns side by side */
    .column {
        float:inherit;
        width: 33%;
        padding: 0 10px;
    }

    /* Remove extra left and right margins, due to padding */
    .row {margin: 0 -5px;}

    /* Clear floats after the columns */
    .row:after {
        content: "";
        display: table;
        clear: both;
    }

    /* Responsive columns */
    @media screen and (max-width: 600px) {
    .column {
            width: 100%;
            display: block;
            margin-bottom: 20px;
        }
    }

    /* Style the counter cards */
    .card {
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        padding: 16px;
        text-align: center;
        background-color: #ffffff;
        max-height: auto;
        cursor: pointer;
        overflow: hidden;
        transition: all 0.3s ease-out;
    }

    .card:hover {
        transform: translateY(-5px) scale(1.04) translateZ(0);
    }
</style>

<body>
   <nav class="navbar sticky-top navbar-light bg-light" style="padding: 18px;">
      <div class="navbar-brand">
          <span style="font-weight: 500; font-family: 'Cabin', sans-serif; display: flex; color: #3c4043;" class="nav_bar_title">
              IWe - Make Task Easy
          </span>
      </div>
      <div>
          <a href="./logout" style="color: white; text-decoration: none;" class="login_button"><b>Logout</b></a>
      </div>
  </nav>

<% HttpSession ht=request.getSession();
   String id=(String.valueOf(ht.getAttribute("id")));
   if(!id.equals("null"))
   {
%>

    <div style="padding: 50px;">
      <div class="row" style="display: flex; justify-content: center; flex-wrap: wrap;">
        <div class="column">
            <div class="card" onclick="document.location='viewaccountdetails.jsp'">
              <h3><span style="font-size: 100px; color: #4285f4" class="material-icons"> account_box </span></h3>
              <p style="font-family: 'Fredericka the Great', cursive; font-weight: 600; font-size: 20px; letter-spacing: 0.08em;">View Accounts Details</p>
              
            </div>
        </div>

        <div class="column">
            <div class="card" onclick="document.location='signup.jsp'">
              <h3><span style="font-size: 100px; color: #F1615C;" class="material-icons"> person_add </span></h3>
              <p style="font-family: 'Fredericka the Great', cursive; font-weight: 600; font-size: 20px; letter-spacing: 0.08em;">Add New Account</p>
              
            </div>
        </div>

        <div class="column">
            <div class="card" onclick="document.location='updateaccount.jsp'">
                <h3><span style="font-size: 100px; color: #fcc834;" class="material-icons"> person </span></h3>
                <p style="font-family: 'Fredericka the Great', cursive; font-weight: 600; font-size: 20px; letter-spacing: 0.08em;">Update Account Details</p>
                
            </div>
         </div>

        <div class="column">
            <div class="card" onclick="document.location='deleteaccount.jsp'">
              <h3><span style="font-size: 100px; color: #616161;" class="material-icons"> person_remove </span></h3>
              <p style="font-family: 'Fredericka the Great', cursive; font-weight: 600; font-size: 20px; letter-spacing: 0.08em;">Delete Account</p>
              
            </div>
        </div>
        
        <div class="column">
            <div class="card" onclick="document.location='addnewquestion.jsp'">
              <h3><span style="font-size: 100px; color: #76e989;" class="material-icons"> add_comment </span></h3>
              <p style="font-family: 'Fredericka the Great', cursive; font-weight: 600; font-size: 20px; letter-spacing: 0.08em;">Add New Question</p>
              
            </div>
        </div>
        
        <div class="column">
            <div class="card" onclick="document.location='viewquestions.jsp'">
              <h3><span style="font-size: 100px; color: #5c6bc0;" class="material-icons"> comment </span></h3>
              <p style="font-family: 'Fredericka the Great', cursive; font-weight: 600; font-size: 20px; letter-spacing: 0.08em;">View All Questions</p>
              
            </div>
        </div>
                
      </div>
    </div>
    
<% } 
   else
   {
	   response.sendRedirect("adminlogin.html");
   }
%>
</div>
</body>
</html>