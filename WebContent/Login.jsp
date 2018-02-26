<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Assignment 1</title>
		
		<script>
			function validateForm() {
			    var x = document.forms["userForm"]["userName"].value;
			    var y = document.forms["userForm"]["password"].value;
			    if (x == "") {
			        alert("Username must be filled out");
			        return false;
			    }
			    
			    if (y == "") {
			        alert("Password must be filled out");
			        return false;
			    }
			}
	   </script>
	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
	
	</head>
	
	<body class="container"> 
	<center>
	<br>
		<h1> Welcome to Marcus Theatre</h1>
		<h2> Login here</h2>
		<br>
		<br>
		</center>
	
<center>	
		
		<form name="userForm" action	=Login 
		      onsubmit="return validateForm()" method="post">
		<div class="col-lg-3">
			<input type=text name=userName placeholder="Username" class=form-control></div>
		<div class="col-lg-3">
			<input type=password name=password placeholder="Password" class=form-control></div><br>
			
			<button type="submit" class="btn btn-primary">Login</button>
					
		</form>
</center>
		
		<br>
		
		<!-- Navigation links --> 
		<p align="center"> <a href="Register.jsp"> Are you a New User? </a></p> <br>
		
		
	</body>
	
	
</html>