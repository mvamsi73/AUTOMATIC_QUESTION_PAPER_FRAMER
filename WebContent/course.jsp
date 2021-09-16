<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Course</title>
<script type="text/javascript">
function validate()
{
	var cname=document.f1.cname.value;
	var ccode=document.f1.ccode.value;
	var numofst=document.f1.numofstudents.value;
	if(cname=="select")
		{
		alert("Course name should not be empty");
		return false;
		}
	else if(ccode=="select")
		{
		alert("Course code field should not be empty");
		return false;
		}
	else if(numofst=="")
		{
		alert("Number of students field should not be empty");
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

   <nav class="navbar sticky-top navbar-light bg-light" style="padding: 18px;">
      <div class="navbar-brand">
          <span style="font-weight: 500; font-family: 'Cabin', sans-serif; display: flex; color: #3c4043;" class="nav_bar_title">
              IWe - Make Task Easy
          </span>
      </div>
      <div>
          <a href="welcome.html" style="color: white; background-color: #007bff; text-decoration: none;" class="login_button"><b>Home</b></a>
          <a href="./logout" style="color: white; text-decoration: none;" class="login_button"><b>Logout</b></a>
      </div>
  </nav>
  
        	<div id="login" style="padding-top: 50px; padding-bottom: 50px;">
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12" style="border-radius: 5px;">
                        <form id="login-form" class="form" name="f1" action="courseserv" method="post" onsubmit="return validate()">
                            <h3 class="text-center text-info"><i class="fas fa-code-branch"></i> <b> Course </b> </h3>
                            <div class="form-group">
                                <label for="cname" class="text-info"><i class="fas fa-id-badge"></i> Enter Course Name:</label><br>
                                <select id="cname" name="cname" class="form-control">
								  <option value="select">Select</option>
								  <option value="ENTERPRISE PROGRAMMING">ENTERPRISE PROGRAMMING</option>
								</select>
                            </div>
                            <div class="form-group">
                                <label for="ccode" class="text-info"><i class="fas fa-id-badge"></i> Enter Course Code:</label><br>
                                <select id="ccode" name="ccode" class="form-control">
								  <option value="select">Select</option>
								  <option value="19CS2107S">19CS2107S</option>
								</select>
                            </div>
                            <div class="form-group">
                                <label for="numofstudents" class="text-info"><i class="fas fa-envelope"></i> Number of Students in the Course:</label><br>
                                <input type="number" name="numofstudents" placeholder="Number of Students in the Course" class="form-control">
                            </div>
                            <input type="hidden" name="paperid" value="<%=request.getAttribute("paperid") %>">
                            <div class="form-group">
                                <button type="submit" name="submit" class="btn btn-info"><i class="fa fa-check-circle" aria-hidden="true"></i> <b> Submit </b> </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>