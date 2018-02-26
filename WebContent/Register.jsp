<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Assignment 1</title>
		
		<script>
			function validateForm() {
			    var x = document.forms["userForm2"]["userName"].value;
			    var y = document.forms["userForm2"]["password"].value;
			    var z = document.forms["userForm2"]["cpassword"].value;
			    if (x == "") {
			        alert("Username must be filled out");
			        return false;
			    }
			    
			    if (y == "") {
			        alert("Password must be filled out");
			        return false;
			    }
			    
			    if (z == "") {
			        alert("Please confirm your password");
			        return false;
			    }
			    
			    if (z!=y) {
			    	alert("Password do not match!");
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
		<h2> Register here</h2>
		<br>
		<br>
		</center>
	
<center>	
		
		<form name="userForm2" action="Register" 
		      onsubmit="return validateForm()" method="post">
		
  Please provide us your name
  <div class="col-lg-3 ">
    <input type="text" name="firstName" class="form-control d-inline" placeholder="First Name">
  </div>
  <div class="col-lg-3 ">
    <input type="text" name="lastName" class="d-inline form-control" placeholder="Last Name">
  </div>
  Address
  <div class="col-lg-6">
    <input type="text" name="address" class="form-control" placeholder="Address">
  </div>
  Phone number
    <div class="col-lg-3">
    <input type="text" name="phone" class="form-control" placeholder="Phone number">
  </div>
  Login credentials
  <div class="col-lg-3"> 
    <input type="text" name= userName class="form-control" placeholder="New Username">
  </div> 
  <div class="col-lg-3">
    <input type="password" name=password class="form-control" placeholder="New Password">
  </div>
    <div class="col-lg-3">
    <input type="password" name="cpassword" class="form-control" placeholder="Confim Password">
  </div>
  <br>
<button type="submit" class="btn btn-primary">Register</button>
					
		</form>
</center>
		
		<br>
		
		
		
		
	</body>
	
	
</html>