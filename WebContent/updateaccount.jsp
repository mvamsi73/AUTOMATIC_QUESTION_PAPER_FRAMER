<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="projectpack.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="bean.*" %>
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
  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    
    <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  <!-- Google Fonts Roboto -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <!-- Material Design Bootstrap -->
  <link rel="stylesheet" href="css/mdb.min.css">
  <!-- Your custom styles (optional) -->
  <link rel="stylesheet" href="css/style.css">
  <!-- MDBootstrap Datatables  -->
  <link href="css/addons/datatables.min.css" rel="stylesheet">
<title>Update Details</title>
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

       .login_button {
            padding: 10px;
            color: white;
            border-radius: 5px;
            font-family: 'Raleway', sans-serif;
        }
        table,th-sm {
            font-weight: bolder;
        }
        input[type=button], input[type=submit], input[type=reset] {
		  background-color: #33b5e5;
		  border: none;
		  border-radius:5px;
		  font-weight:700;
		  color: white;
		  padding: 10px 10px;
		  text-decoration: none;
		  margin: 4px 2px;
		  cursor: pointer;
		}
   </style>
</head>
<body>

    <nav class="navbar sticky-top navbar-light bg-light" style="padding: 18px;">
        <div class="navbar-brand" onclick="document.location='adminhome.jsp'" style="cursor: pointer;">
            <span style="font-weight: 500; font-family: 'Cabin', sans-serif; display: flex; color: #3c4043;" class="nav_bar_title">
                IWe - Make Task Easy
            </span>
        </div>
        <div>
             <a href="adminhome.jsp" style="color: white; background-color: #007bff; text-decoration: none;" class="login_button"><b>Home</b></a>
            <a href="./logout" style="color: white; background-color: #7e57c2; text-decoration: none;" class="login_button"><b>Logout</b></a>
        </div>
    </nav>
    
<div style="padding:0px 50px;">
<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
<% HttpSession ht=request.getSession();
String id=(String.valueOf(ht.getAttribute("id")));
if(!id.equals("null"))
   {
%>
<h1 align="center" style="padding-top: 3%;">Accounts Details</h1>
<thead>
<tr>
            <th class="th-sm"> <b> ID </b>
    
            </th>
            <th class="th-sm"> <b> Name </b>
    
            </th>
            <th class="th-sm"> <b> Email </b>
    
            </th>
            <th class="th-sm"> <b> Department </b>
    
            </th>
            <th class="th-sm"> <b> Phone Number </b>
    
            </th>
            <th class="th-sm"> <b> Designation </b>
    
            </th>
            <th class="th-sm"> <b> Subject </b>
    
            </th>            
            <th class="th-sm"> <b> Password </b>
    
            </th>            
            <th class="th-sm"> <b> Update </b>
    
            </th>            
        </tr>
        </thead>
        <tbody>
<% CRUD cd=new CRUD();
	List<ProjectSignUpBean> data=cd.display();
	for(ProjectSignUpBean i:data)
	{
	%>
	
	<tr><td><%=i.getId() %></td><td><%=i.getName() %></td><td><%=i.getEmail() %></td><td><%=i.getDept() %></td><td><%=i.getPhno() %></td><td><%=i.getPosition() %></td><td><%=i.getSubject() %></td><td><%=i.getPassword() %></td><td><form action="updatedetails.jsp" method="post"><input type="hidden" name="id" value=<%=i.getId()%>><input type="submit" value="Update"></form></td></tr>
	
	<% }%>
	</tbody>
	</table>
	</div>
	<%}
   else
   {
	   response.sendRedirect("adminlogin.html");
   }
   %>
	
   
   <!-- jQuery -->
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <!-- Bootstrap tooltips -->
  <script type="text/javascript" src="js/popper.min.js"></script>
  <!-- Bootstrap core JavaScript -->
  <script type="text/javascript" src="js/bootstrap.min.js"></script>
  <!-- MDB core JavaScript -->
  <script type="text/javascript" src="js/mdb.min.js"></script>
  <!-- Your custom scripts (optional) -->
  <script type="text/javascript"></script>
  <!-- MDBootstrap Datatables  -->
  <script type="text/javascript" src="js/addons/datatables.min.js"></script>
  
  <script>
    $(document).ready(function () {
    $('#dtBasicExample').DataTable();
    $('.dataTables_length').addClass('bs-select');
    });
  </script>
</body>
</html>