<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Search Results</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<!-- Bootstrap JS plugins -->
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>


</head>
<body>
				<div class="btn-group float-right">
  			<button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    		Your Account
  			</button>
  			<div class="dropdown-menu">
		    <a class="dropdown-item" href="ViewOrder.jsp">View Order</a>
		    	<div class="dropdown-divider"></div>
		    <a class="dropdown-item" href="Login.jsp">Logout</a>
			  	</div>
			</div>
<br> <br>
	
		<h1 align="center"> Movie Search Results</h1> <br><br>
<h2 align="center">You searched for the movie: ${movieBean.title}</h2>
		
 <h4>Movie Details </h4>
<table class="table table-striped">
  <thead>
    <tr>
      <th>#</th>
      <th>Available Theatre</th>
      <th>Price</th>
      <th>Poster</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>
      <ul>
      	<li>Theatre Name: ${showingBean.theatreName}</li>
      	<li>Theatre Number: ${showingBean.showroom}</li>
      	<li>Showtime: ${showingBean.startDateTime}</li>
      	<li>Available seats: ${showingBean.availableSeats}</li><br> <a href="MovieDetailsAndSelection.jsp"><button class="btn btn-outline-info btn-sm">View Details</button></a>
      	
      </ul>
      </td>
      <td>
	 	Price: $${showingBean.price}    
      </td>
      
      <td>
      <img src="Pic/Tangled.jpg"  class="img-thumbnail" style="width:200px;height:200px;">
      </td>
    </tr>

  </tbody>
  
</table>

<br>


</body>
</html>