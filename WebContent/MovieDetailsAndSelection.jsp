<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Bootstrap JS plugins -->
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>


<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Movie Details</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
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
	
		<h1 align="center"> Movie Details and Selection</h1> <br><br>
 <h4>Movie Details </h4>
<table class="table table-striped">
  <thead>
    <tr>
      <th>#</th>
      <th>Movie Details</th>
      <th>Theatre Details</th>
      <th>Add to Cart</th>
      <th>Poster</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>
      <ul>
      	<li>Movie Name: ${movieBean.title} </li>
      	<li>Description: ${movieBean.description}</li>
      	<li>Rating: ${movieBean.rating} </li>
      </ul>
      </td>
      <td>
      <ul>
      	<li>Theatre Name: ${showingBean.theatreName}</li>
      	<li>Theatre Number: ${showingBean.showroom}</li>
      	<li>Showtime: ${showingBean.startDateTime }</li>
      	<li>Price per Seat:$${showingBean.price}</li>
      	<li>Available Seats:${showingBean.availableSeats}</li>
      </ul>      
      </td>
      
      <td>
      <a href="ViewAndCheckout.jsp" ><input type="button" value="Add to Cart"></a>
      </td>
      
      <td>
      <img src="Pic/Tangled.jpg" class="img-thumbnail" style="width:200px;height:200px;">
      </td>
    </tr>

  </tbody>
  
</table>

<br>
 <h4>Viewer Review </h4>
<table class="table table-striped">
  <thead>
    <tr>
      <th>Viewer's Name</th>
      <th>Review</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">Anonymous</th>
      <td>
      <ul>
      	<li>Overall rating: 4 out of 5 stars</li>
      	<li>Review Date: 01/29/2018</li>
      	<li>Comments: Not bad</li>
      </ul>
      </td>
      </tr>

  </tbody>
</table>


<a href="MovieSearchResults.jsp"><input type="button" value="Back"></a>
<a href="CustomerHomepage.jsp"><input type="button" value="Home"></a>
	</body>
</html>