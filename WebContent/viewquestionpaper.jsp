<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="projectpack.*" %>
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
<title>Question Paper</title>
  
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
             <a href="welcome.html" style="color: white; background-color: #007bff; text-decoration: none;" class="login_button"><b>Home</b></a>
            <a href="./logout" style="color: white; background-color: #7e57c2; text-decoration: none;" class="login_button"><b>Logout</b></a>
        </div>
    </nav>
<div id="printableArea">
<div style="padding:0px 50px;">
<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
<%
CRUD cd=new CRUD();
int paperid=Integer.parseInt(request.getParameter("paperid"));
List<questionpaperbean> data=cd.getgeneratedpaperspaperid(paperid);
%>
<h1 align="center" style="padding-top:3%;">Paper - ID: <%=paperid %></h1>
<%
for(questionpaperbean qb:data)
{%>
<p align="right" style="color:red; font-weight:600;">Total Marks:100</p>
	<h1 align="center" style="padding-top: 2%;">PART-A</h1>
	<p align="right" style="color:red; font-weight:600;">Total Part-A Marks:<%=qb.getTotalpartAmarks() %></p>
	<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
	<tbody>
	<tr><td style="font-weight:600;" width="10%">Question Number</td><td style="font-weight:600;">Question Description</td><td style="font-weight:600;" width="10%">Marks</td><td style="font-weight:600;" width="10%">Difficulty-Level</td></tr>
	<tr><td>1</td><td><%=qb.getQuestion1() %></td><td><%=qb.getQuestion1marks() %></td><td><%=qb.getQuestion1difficultylevel() %></td></tr>
	<tr><td>2</td><td><%=qb.getQuestion2() %></td><td><%=qb.getQuestion2marks() %></td><td><%=qb.getQuestion2difficultylevel() %></td></tr>
	<tr><td>3</td><td><%=qb.getQuestion3() %></td><td><%=qb.getQuestion3marks() %></td><td><%=qb.getQuestion3difficultylevel() %></td></tr>
	<tr><td>4</td><td><%=qb.getQuestion4() %></td><td><%=qb.getQuestion4marks() %></td><td><%=qb.getQuestion4difficultylevel() %></td></tr>
	<tr><td>5</td><td><%=qb.getQuestion5() %></td><td><%=qb.getQuestion5marks() %></td><td><%=qb.getQuestion5difficultylevel() %></td></tr>
	</tbody>
	</table>
	
	<h1 align="center" style="padding-top: 2%;">PART-B</h1>
	<p align="right" style="color:red; font-weight:600;">Total Part-B Marks:<%=qb.getTotalpartBmarks() %></p>
	<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
	<tbody>
	<tr><td style="font-weight:600;" width="10%">Question Number</td><td style="font-weight:600;">Question Description</td><td style="font-weight:600;" width="10%">Marks</td><td style="font-weight:600;" width="10%">Difficulty-Level</td></tr>
	<tr><td>6</td><td><%=qb.getQuestion6() %></td><td><%=qb.getQuestion6marks() %></td><td><%=qb.getQuestion6difficultylevel() %></td></tr>
	<tr><td>7</td><td><%=qb.getQuestion7() %></td><td><%=qb.getQuestion7marks() %></td><td><%=qb.getQuestion7difficultylevel() %></td></tr>
	<tr><td>8</td><td><%=qb.getQuestion8() %></td><td><%=qb.getQuestion8marks() %></td><td><%=qb.getQuestion8difficultylevel() %></td></tr>
	<tr><td>9</td><td><%=qb.getQuestion9() %></td><td><%=qb.getQuestion9marks() %></td><td><%=qb.getQuestion9difficultylevel() %></td></tr>
	<tr><td>10</td><td><%=qb.getQuestion10() %></td><td><%=qb.getQuestion10marks() %></td><td><%=qb.getQuestion10difficultylevel() %></td></tr>
	</tbody>
	</table>
	
	<h1 align="center" style="padding-top: 2%;">PART-C</h1>
	<p align="right" style="color:red; font-weight:600;">Total Part-C Marks: <%=qb.getTotalpartCmarks() %></p>
	<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
	<tbody>
	<tr><td style="font-weight:600;" width="10%">Question Number</td><td style="font-weight:600;">Question Description</td><td style="font-weight:600;" width="10%">Marks</td><td style="font-weight:600;" width="10%">Difficulty-Level</td></tr>
	<tr><td>11</td><td><%=qb.getQuestion11() %></td><td><%=qb.getQuestion11marks() %></td><td><%=qb.getQuestion11difficultylevel() %></td></tr>
	<tr><td>12</td><td><%=qb.getQuestion12() %></td><td><%=qb.getQuestion12marks() %></td><td><%=qb.getQuestion12difficultylevel() %></td></tr>
	<tr><td>13</td><td><%=qb.getQuestion13() %></td><td><%=qb.getQuestion13marks() %></td><td><%=qb.getQuestion13difficultylevel() %></td></tr>
	<tr><td>14</td><td><%=qb.getQuestion14() %></td><td><%=qb.getQuestion14marks() %></td><td><%=qb.getQuestion14difficultylevel() %></td></tr>
	<tr><td>15</td><td><%=qb.getQuestion15() %></td><td><%=qb.getQuestion15marks() %></td><td><%=qb.getQuestion15difficultylevel() %></td></tr>
	</tbody>
	</table>
	
	<h1 align="center" style="padding-top: 2%;">PART-D</h1>
	<p align="right" style="color:red; font-weight:600;">Total Part-D Marks: <%=qb.getTotalpartDmarks() %></p>
	<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
	<tbody>
	<tr><td style="font-weight:600;" width="10%">Question Number</td><td style="font-weight:600;">Question Description</td><td style="font-weight:600;" width="10%">Marks</td><td style="font-weight:600;" width="10%">Difficulty-Level</td></tr>
	<tr><td>16</td><td><%=qb.getQuestion16() %></td><td><%=qb.getQuestion16marks() %></td><td><%=qb.getQuestion16difficultylevel() %></td></tr>
	<tr><td>17</td><td><%=qb.getQuestion17() %></td><td><%=qb.getQuestion17marks() %></td><td><%=qb.getQuestion17difficultylevel() %></td></tr>
	<tr><td>18</td><td><%=qb.getQuestion18() %></td><td><%=qb.getQuestion18marks() %></td><td><%=qb.getQuestion18difficultylevel() %></td></tr>
	<tr><td>19</td><td><%=qb.getQuestion19() %></td><td><%=qb.getQuestion19marks() %></td><td><%=qb.getQuestion19difficultylevel() %></td></tr>
	<tr><td>20</td><td><%=qb.getQuestion20() %></td><td><%=qb.getQuestion20marks() %></td><td><%=qb.getQuestion20difficultylevel() %></td></tr>
	</tbody>
	</table>
	
<%}
%>
</table>
</div>
</div>

<div align="center" style="padding-top:3%; padding-bottom:3%;">
<input type="button" onclick="printDiv('printableArea')" value="Print Question Paper">
</div>

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

  </script>
  
  <script>
    $(document).ready(function () {
    $('#dtBasicExample').DataTable();
    $('.dataTables_length').addClass('bs-select');
    });
    
    function printDiv(divName) {
	    var printContents = document.getElementById(divName).innerHTML;
	    var originalContents = document.body.innerHTML;
	    document.body.innerHTML = printContents;
	    window.print();
	    document.body.innerHTML = originalContents;
	  }
  </script>
</body>
</html>