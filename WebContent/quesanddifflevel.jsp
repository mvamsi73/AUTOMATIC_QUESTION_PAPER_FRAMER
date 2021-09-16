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
<title>Difficulty level</title>
<script type="text/javascript">
function validate()
{
var easyA=document.f1.easyA.value;
var mediumA=document.f1.mediumA.value;
var hardA=document.f1.hardA.value;
var easyB=document.f1.easyB.value;
var mediumB=document.f1.mediumB.value;
var hardB=document.f1.hardB.value;
var easyC=document.f1.easyC.value;
var mediumC=document.f1.mediumC.value;
var hardC=document.f1.hardC.value;
var easyD=document.f1.easyD.value;
var mediumD=document.f1.mediumD.value;
var hardD=document.f1.hardD.value;
var easyAmarks=document.f1.easyAmarks.value;
var mediumAmarks=document.f1.mediumAmarks.value;
var hardAmarks=document.f1.hardAmarks.value;
var easyBmarks=document.f1.easyBmarks.value;
var mediumBmarks=document.f1.mediumBmarks.value;
var hardBmarks=document.f1.hardBmarks.value;
var easyCmarks=document.f1.easyCmarks.value;
var mediumCmarks=document.f1.mediumCmarks.value;
var hardCmarks=document.f1.hardCmarks.value;
var easyDmarks=document.f1.easyDmarks.value;
var mediumDmarks=document.f1.mediumDmarks.value;
var hardDmarks=document.f1.hardDmarks.value;
if(easyA=="")
	{
	alert("Number of Easy-Level Questions in Part-A should not be null");
	document.f1.easyA.focus();
	return false;
	}
else if(mediumA=="")
	{
	alert("Number of Medium-Level Questions in Part-A should not be null");
	document.f1.mediumA.focus();
	return false;
	}
else if(hardA=="")
{
alert("Number of Hard-Level Questions in Part-A should not be null");
document.f1.hardA.focus();
return false;
}
if(easyB=="")
{
alert("Number of Easy-Level Questions in Part-B should not be null");
document.f1.easyB.focus();
return false;
}
else if(mediumB=="")
{
alert("Number of Medium-Level Questions in Part-B should not be null");
document.f1.mediumB.focus();
return false;
}
else if(hardB=="")
{
alert("Number of Hard-Level Questions in Part-B should not be null");
document.f1.hardB.focus();
return false;
}
if(easyC=="")
{
alert("Number of Easy-Level Questions in Part-C should not be null");
document.f1.easyC.focus();
return false;
}
else if(mediumC=="")
{
alert("Number of Medium-Level Questions in Part-C should not be null");
document.f1.mediumC.focus();
return false;
}
else if(hardC=="")
{
alert("Number of Hard-Level Questions in Part-C should not be null");
document.f1.hardC.focus();
return false;
}
else if(easyD=="")
{
alert("Number of Easy-Level Questions in Part-D should not be null");
document.f1.easyD.focus();
return false;
}
else if(mediumD=="")
{
alert("Number of Medium-Level Questions in Part-D should not be null");
document.f1.mediumD.focus();
return false;
}
else if(hardD=="")
{
alert("Number of Hard-Level Questions in Part-D should not be null");
document.f1.hardD.focus();
return false;
}
else if(easyAmarks=="")
	{
	alert("Marks to Easy-Level questions in PartA should not be Null");
	document.f1.easyAmarks.focus();
	return false;
	}
else if(mediumAmarks=="")
{
alert("Marks to Medium-Level questions in PartA should not be Null");
document.f1.mediumAmarks.focus();
return false;
}
else if(hardAmarks=="")
{
alert("Marks to Hard-Level questions in PartA should not be Null");
document.f1.hardAmarks.focus();
return false;
}
else if(easyBmarks=="")
{
alert("Marks to Easy-Level questions in PartB should not be Null");
document.f1.easyBmarks.focus();
return false;
}
else if(mediumBmarks=="")
{
alert("Marks to Medium-Level questions in PartB should not be Null");
document.f1.mediumBmarks.focus();
return false;
}
else if(hardBmarks=="")
{
alert("Marks to Hard-Level questions in PartB should not be Null");
document.f1.hardBmarks.focus();
return false;
}
else if(easyCmarks=="")
{
alert("Marks to Easy-Level questions in PartC should not be Null");
document.f1.easyCmarks.focus();
return false;
}
else if(mediumCmarks=="")
{
alert("Marks to Medium-Level questions in PartC should not be Null");
document.f1.mediumCmarks.focus();
return false;
}
else if(hardCmarks=="")
{
alert("Marks to Hard-Level questions in PartC should not be Null");
document.f1.hardCmarks.focus();
return false;
}
else if(easyDmarks=="")
{
alert("Marks to Easy-Level questions in PartD should not be Null");
document.f1.easyDmarks.focus();
return false;
}
else if(mediumDmarks=="")
{
alert("Marks to Medium-Level questions in PartD should not be Null");
document.f1.mediumDmarks.focus();
return false;
}
else if(hardDmarks=="")
{
alert("Marks to Hard-Level questions in PartD should not be Null");
document.f1.hardDmarks.focus();
return false;
}
if(parseInt(easyA)+parseInt(mediumA)+parseInt(hardA)!=5)
	{
	alert("Number of Questions in partA must be 5");
	return false;
	}
else if(parseInt(easyB)+parseInt(mediumB)+parseInt(hardB)!=5)
{
	alert("Number of Questions in partB must be 5");
	return false;
}
else if(parseInt(easyC)+parseInt(mediumC)+parseInt(hardC)!=5)
{
	alert("Number of Questions in partC must be 5");
	return false;
}
else if(parseInt(easyD)+parseInt(mediumD)+parseInt(hardD)!=5)
{
	alert("Number of Questions in partD must be 5");
	return false;
}
if((parseFloat(easyA)*parseFloat(easyAmarks)+parseFloat(mediumA)*parseFloat(mediumAmarks)+parseFloat(hardA)*parseFloat(hardAmarks)+parseFloat(easyB)*parseFloat(easyBmarks)+parseFloat(mediumB)*parseFloat(mediumBmarks)+parseFloat(hardB)*parseFloat(hardBmarks)+parseFloat(easyC)*parseFloat(easyCmarks)+parseFloat(mediumC)*parseFloat(mediumCmarks)+parseFloat(hardC)*parseFloat(hardCmarks)+parseFloat(easyD)*parseFloat(easyDmarks)+parseFloat(mediumD)*parseFloat(mediumDmarks)+parseFloat(hardD)*parseFloat(hardDmarks))==100)
	{
	document.getElementById("validatepaper").disabled = true;
	document.getElementById("generate").disabled = false;
	
	alert("Validation Successful\nTotal Marks = 100");
	return false;
	}
else
	{
	document.getElementById("validatepaper").disabled = false;
	document.getElementById("generate").disabled = true;
	alert("Validation Failed");
	alert("Your paper total marks = "+(parseFloat(easyA)*parseFloat(easyAmarks)+parseFloat(mediumA)*parseFloat(mediumAmarks)+parseFloat(hardA)*parseFloat(hardAmarks)+parseFloat(easyB)*parseFloat(easyBmarks)+parseFloat(mediumB)*parseFloat(mediumBmarks)+parseFloat(hardB)*parseFloat(hardBmarks)+parseFloat(easyC)*parseFloat(easyCmarks)+parseFloat(mediumC)*parseFloat(mediumCmarks)+parseFloat(hardC)*parseFloat(hardCmarks)+parseFloat(easyD)*parseFloat(easyDmarks)+parseFloat(mediumD)*parseFloat(mediumDmarks)+parseFloat(hardD)*parseFloat(hardDmarks)));
	alert("Ensure total marks of your paper is equal to 100");
	return false;
	}
}
function generatepaper()
{
	var easyA=document.f1.easyA.value;
	var mediumA=document.f1.mediumA.value;
	var hardA=document.f1.hardA.value;
	var easyB=document.f1.easyB.value;
	var mediumB=document.f1.mediumB.value;
	var hardB=document.f1.hardB.value;
	var easyC=document.f1.easyC.value;
	var mediumC=document.f1.mediumC.value;
	var hardC=document.f1.hardC.value;
	var easyD=document.f1.easyD.value;
	var mediumD=document.f1.mediumD.value;
	var hardD=document.f1.hardD.value;
	var easyAmarks=document.f1.easyAmarks.value;
	var mediumAmarks=document.f1.mediumAmarks.value;
	var hardAmarks=document.f1.hardAmarks.value;
	var easyBmarks=document.f1.easyBmarks.value;
	var mediumBmarks=document.f1.mediumBmarks.value;
	var hardBmarks=document.f1.hardBmarks.value;
	var easyCmarks=document.f1.easyCmarks.value;
	var mediumCmarks=document.f1.mediumCmarks.value;
	var hardCmarks=document.f1.hardCmarks.value;
	var easyDmarks=document.f1.easyDmarks.value;
	var mediumDmarks=document.f1.mediumDmarks.value;
	var hardDmarks=document.f1.hardDmarks.value;
	if(parseInt(easyA)+parseInt(mediumA)+parseInt(hardA)!=5)
	{
	alert("Number of Questions in partA must be 5");
	return false;
	}
else if(parseInt(easyB)+parseInt(mediumB)+parseInt(hardB)!=5)
{
	alert("Number of Questions in partB must be 5");
	return false;
}
else if(parseInt(easyC)+parseInt(mediumC)+parseInt(hardC)!=5)
{
	alert("Number of Questions in partC must be 5");
	return false;
}
else if(parseInt(easyD)+parseInt(mediumD)+parseInt(hardD)!=5)
{
	alert("Number of Questions in partD must be 5");
	return false;
}
	if((parseFloat(easyA)*parseFloat(easyAmarks)+parseFloat(mediumA)*parseFloat(mediumAmarks)+parseFloat(hardA)*parseFloat(hardAmarks)+parseFloat(easyB)*parseFloat(easyBmarks)+parseFloat(mediumB)*parseFloat(mediumBmarks)+parseFloat(hardB)*parseFloat(hardBmarks)+parseFloat(easyC)*parseFloat(easyCmarks)+parseFloat(mediumC)*parseFloat(mediumCmarks)+parseFloat(hardC)*parseFloat(hardCmarks)+parseFloat(easyD)*parseFloat(easyDmarks)+parseFloat(mediumD)*parseFloat(mediumDmarks)+parseFloat(hardD)*parseFloat(hardDmarks))==100)
	{
	return true;
	}
else
	{
	document.getElementById("validatepaper").disabled = false;
	document.getElementById("generate").disabled = true;
	alert("Validation Failed");
	alert("Your paper total marks = "+(parseFloat(easyA)*parseFloat(easyAmarks)+parseFloat(mediumA)*parseFloat(mediumAmarks)+parseFloat(hardA)*parseFloat(hardAmarks)+parseFloat(easyB)*parseFloat(easyBmarks)+parseFloat(mediumB)*parseFloat(mediumBmarks)+parseFloat(hardB)*parseFloat(hardBmarks)+parseFloat(easyC)*parseFloat(easyCmarks)+parseFloat(mediumC)*parseFloat(mediumCmarks)+parseFloat(hardC)*parseFloat(hardCmarks)+parseFloat(easyD)*parseFloat(easyDmarks)+parseFloat(mediumD)*parseFloat(mediumDmarks)+parseFloat(hardD)*parseFloat(hardDmarks)));
	alert("Ensure total marks of your paper is equal to 100");
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
   .login_button {
      padding: 10px;
      color: white;
      border-radius: 5px;
      font-family: 'Raleway', sans-serif;
  }
  input[type=button] {
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

  input[type=submit] {
  background-color: #54d371f5;
  color: white;
  border: none;
  border-radius:5px;
  font-weight:700;
  padding: 10px 10px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}

  input[type=submit]:disabled,
  input[type=submit][disabled]{
  border: 1px solid #999999;
  background-color: #cccccc;
  color: #666666;
}
td {
padding:20px;
}

table {
border-radius:15px;
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
            <a href="./logout" style="color: white; background-color: #7e57c2; text-decoration: none;" class="login_button"><b>Logout</b></a>
        </div>
    </nav>
    
<div style="background-color: white; padding-top:5%; padding-bottom:5%; padding-right: 5%; padding-left: 5%;">
<form name="f1" action="setquestionpaperbeanvalues_stage1" method="post" onsubmit="return generatepaper()">
<table align="center" style="background-color:white; box-shadow: 0 20px 40px 20px rgb(0 0 0 / 25%); padding:10%;">
<tr><td><h1>PART-A</h1></td></tr>
<tr><td>Enter Number of Easy-Level Questions in Part-A:</td><td><input type="number" name="easyA" value="2"></td><td>Marks:</td><td><input type="number" step="0.01" name="easyAmarks" value="3"></td></tr>
<tr><td>Enter Number of Medium-Level Questions in Part-A:</td><td><input type="number" name="mediumA" value="2" ></td><td>Marks:</td><td><input type="number" step="0.01" name="mediumAmarks" value="5"></td></tr>
<tr><td>Enter Number of Hard-Level Questions in Part-A:</td><td><input type="number" name="hardA" value="1" ></td><td>Marks:</td><td><input type="number" step="0.01" name="hardAmarks" value="9"></td></tr>
<tr><td><h1>PART-B</h1></td></tr>
<tr><td>Enter Number of Easy-Level Questions in Part-B:</td><td><input type="number" name="easyB" value="2" ></td><td>Marks:</td><td><input type="number" step="0.01" name="easyBmarks" value="3"></td></tr>
<tr><td>Enter Number of Medium-Level Questions in Part-B:</td><td><input type="number" name="mediumB" value="2"></td><td>Marks:</td><td><input type="number" step="0.01" name="mediumBmarks" value="5"></td></tr>
<tr><td>Enter Number of Hard-Level Questions in Part-B:</td><td><input type="number" name="hardB" value="1"></td><td>Marks:</td><td><input type="number" step="0.01" name="hardBmarks" value="9"></td></tr>
<tr><td><h1>PART-C</h1></td></tr>
<tr><td>Enter Number of Easy-Level Questions in Part-C:</td><td><input type="number" name="easyC" value="2"></td><td>Marks:</td><td><input type="number" step="0.01" name="easyCmarks" value="3"></td></tr>
<tr><td>Enter Number of Medium-Level Questions in Part-C:</td><td><input type="number" name="mediumC" value="2"></td><td>Marks:</td><td><input type="number" step="0.01" name="mediumCmarks" value="5"></td></tr>
<tr><td>Enter Number of Hard-Level Questions in Part-C:</td><td><input type="number" name="hardC" value="1"></td><td>Marks:</td><td><input type="number" step="0.01" name="hardCmarks" value="9"></td></tr>
<tr><td><h1>PART-D</h1></td></tr>
<tr><td>Enter Number of Easy-Level Questions in Part-D:</td><td><input type="number" name="easyD" value="2"></td><td>Marks:</td><td><input type="number" step="0.01" name="easyDmarks" value="3"></td></tr>
<tr><td>Enter Number of Medium-Level Questions in Part-D:</td><td><input type="number" name="mediumD" value="2" ></td><td>Marks:</td><td><input type="number" step="0.01" name="mediumDmarks" value="5"></td></tr>
<tr><td>Enter Number of Hard-Level Questions in Part-D:</td><td><input type="number" name="hardD" value="1"></td><td>Marks:</td><td><input type="number" step="0.01" name="hardDmarks" value="9"></td></tr>
<tr><td><input type="hidden" name="paperid" value="<%=request.getAttribute("paperid") %>"></td></td></tr>
<tr><td><input id="validatepaper" type="button" value="Validate Paper" onclick="return validate()">&nbsp;&nbsp;&nbsp;&nbsp;<input id="generate" type="submit" value="Generate paper" disabled></td></tr>
</table>
</form>
</div>

</body>
</html>