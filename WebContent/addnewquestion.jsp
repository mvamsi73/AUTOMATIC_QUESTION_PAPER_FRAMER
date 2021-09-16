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
<title>Add new Question</title>
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
<script type="text/javascript">
function validate()
{
	}
</script>
</head>
<body>

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
    
<% HttpSession ht=request.getSession();
String id=(String.valueOf(ht.getAttribute("id")));
if(!id.equals("null"))
   {
%>
	<div id="login" style="padding-top: 50px; padding-bottom: 50px;">
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12" style="border-radius: 5px;">
                        <form id="login-form" class="form" name="adminlogin" action="addnewquestionserv" method="post">
                            <h3 class="text-center text-info"> <i class="fas fa-sticky-note"></i> <b> New Question </b> </h3>
                            <div class="form-group">
                                <label for="qdiscription" class="text-info"><i class="fas fa-comment"></i> Enter Question Description:</label><br>
                                <textarea name = "qdiscription" class="form-control" placeholder="Enter Question Description" required></textarea>
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info"><i class="fas fa-sort-amount-up"></i> Enter Question Difficulty level:</label><br>
                                <select id="dlevel" name="dlevel" class="form-control">
								  <option value="select">Select</option>
								  <option value="easy">EASY</option>
								  <option value="medium">MEDIUM</option>
								  <option value="hard">HARD</option>
								</select>
                            </div>
                            <div class="form-group">
                                <button type="submit" name="submit" class="btn btn-info"><i class="fas fa-check-circle" aria-hidden="true"></i> <b> Submit </b> </button>
                            </div>
                        </form>
                    </div>
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
</body>
</html>