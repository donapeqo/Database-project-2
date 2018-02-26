<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<title>Cancel Order</title>
</head>
<body>
<div class="jumbotron">
    <h1>Cancel Order</h1>
    <p>This page lets the customer to cancel the selected item in an order but not necessarily the
entire order.</p>
  </div>
<div class="container">
 <table Class="table table-striped">
  <tr>
    <th>Order Number</th>
    <th>Order Detail</th>
    <th>Ordered date</th>
    <th>Action</th>
  </tr>
  <tr>
    <td>1</td>
    <td><ul><li>Movie Name: Tangled</li><li>Ticket Quantity: 1</li><li>Total Price: $4.99</li><li>Theatre Name : Lincoln Marcus Theatre</li><li>Theatre Number: 12<li>Showtime: 1500 </li><li>Date: 21 March 2015 </li></ul> <a href="ViewOrder.jsp"><button class="btn btn-outline-info btn-sm">View Details</button></a></td>
    <td>date: 21 March 2015</td>
    <td><a href="CancellationConfirmation.jsp"><button class="btn btn-outline-danger btn-sm">Confirm Cancellation</button></a> <br><br> <a href="CustomerHomepage.jsp"><button class="btn btn-outline-success btn-sm">Discard Cancellation</button></a></td>
    
  </tr>
  <tr>
  <td>Total Order</td>
  <td>1</td>
  <td></td>
  <td></td>
  </tr>  
</table> 
</div>
<div class="container">
<a href="ManageOrder.jsp"><button class="btn btn-primary">Manage Order</button></a>

<a href="CustomerHomepage.jsp"><button class="btn btn-primary">Customer Homepage</button></a>
<a href="Login.jsp"><button class="btn btn-danger">Logout</button></a>
</div>






</body>
</html>