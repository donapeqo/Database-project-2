<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<title>Cancellation Confirmation</title>
</head>
<body>
<div class="jumbotron">
    <h1>Cancellation Confirmation</h1>
    <p> Confirming Customer Cancellation.</p>
  </div>
<div class="container">
<table Class="table table-striped">
  <tr>
    <th>Order Number</th>
    <th>Movie detail</th>
    <th>Order Status</th>
    <th>Refund Amount</th>
    
  
  </tr>
  <tr class="table-danger">
    <td>1</td>
    <td><ul><li>Movie Name: Tangled</li><li>Ticket Quantity: 1</li><li>Total Price: $4.99</li><li>Theatre Name : Lincoln Marcus Theatre</li><li>Theatre Number: 12<li>Showtime: 1500 </li><li>Date: 21 March 2015 </li></ul> <a href="ViewOrder.jsp"><button class="btn btn-outline-info btn-sm">View</button></a></td>
    <td>Order has been cancelled. </td>
    <td>$4.99 </td>
    
  </tr>
  </table>
  </div>
  

<div class="container">
<a href="ViewOrder.jsp"><button class="btn btn-primary">View</button></a>
<a href="CustomerHomepage.jsp"><button class="btn btn-primary">Home</button></a>
<a href="Login.jsp"><button class="btn btn-danger">Logout</button></a>
</div>



</body>
</html>