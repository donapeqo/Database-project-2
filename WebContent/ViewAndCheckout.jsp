<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<!-- Bootstrap JS plugins -->
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>



<title>View And Checkout Shopping Cart</title>
</head>
<body>

<!-- Account Settings Dropdown -->
				<div class="btn-group float-right">
  			<button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    		Your Account
  			</button>
  			<div class="dropdown-menu">
		    <a class="dropdown-item" href="CustomerHomepage.jsp">Home</a>
		    	<div class="dropdown-divider"></div>
		    <a class="dropdown-item" href="Login.jsp">Logout</a>
			  	</div>
			</div>
			
<!-- Start the table -->

 <h1>Your Shopping Cart </h1>
 <br><br>
 <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<div class="container">
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Movie</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-10">
										<h4 class="nomargin">Tangled</h4>
										      <ul>
      	<li>Movie Name: Tangled</li>
      	<li>Theatre Name: Lincoln Marcus Theatre</li>
      	<li>Theatre Number: 12</li>
      	<li>Showtime: 15:00</li>
      	<li>Date: 03/21/2015</li>
      	<br>
      	<img src="Pic/Tangled.jpg" class="img-thumbnail" style="width:200px;height:200px;">
      	
      </ul>
									</div>
								</div>
							</td>
							<td data-th="Price">$4.99</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="1">
							</td>
							<td data-th="Subtotal" class="text-center">$4.99</td>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong></strong></td>
						</tr>
						<tr>
							<td><a href="MovieSearchResults.jsp" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total $4.99</strong></td>
							<td><a href="CustomerTransaction.jsp" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
</div>

 <!--
<table class="table table-striped">
  <thead>
    <tr>
      <th>#</th>
      <th>Movie</th>
      <th>Price</th>
      <th>Quantity</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>
      <ul>
      	<li>Movie Name:</li>
      	<li>Description:</li>
      	<li>Rating:</li>
      	<li>Poster:</li>
      </ul>
      </td>
      <td>
      <ul>
      	<li>Theatre Name:</li>
      	<li>Theatre Number:</li>
      	<li>Showtime:</li>
      	<li>Price per Seat:</li>
      	<li>Available Seats:</li>
      </ul>      
      </td>
      
      <td>
      <input type="button" value="Add to Cart">
      </td>
    </tr>

  </tbody>
  
</table>


<h1>View And Checkout</h1>
 -->



</body>
</html>