<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Open</title>
<%@include file="components/common_cs_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
  <div class="container-fluid">
  		<div class="container">
  	<div class="row mt-5 ">
	<div class="col-md-6 offset-md-3">
	 <div class="card">
	 
	 	<div class="card-body">
	 	<%@include file="components/message.jsp" %>
	 	  <div class="text-center">
	 	      <img src="images/studenticon.png" class="center">
	 	  </div>
	 		<h3 class="text-center my-3">Account Open</h3>
	  <form action="AccountOpenServlet" method="post">
  	  <div class="form-group">
    	<label for="exampleInputEmail1">First Name</label>
    	<input type="text" name="firstName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter name">
  	  </div>
  	  <div class="form-group">
    	<label for="exampleInputEmail1">Last Name</label>
    	<input type="text" name="lastName" class="form-control"  placeholder="Enter name">
  	  </div>
  	  <div class="form-group">
    	<label for="phone">Phone</label>
    	<input type="number"  name="phone" class="form-control" id="exampleInputEmail1"  aria-describedby="emailHelp" placeholder="Enter phone">
  	  </div>
  	  <div class="form-group">
    	<label for="exampleInputEmail1">Email address</label>
    	<input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
  	  </div>
  	  <div class="form-group">
    	<label for="userAddress">Address</label>
    	<textarea  style="height:100px;" name="address"  class="form-control" placeholder="Enter your address here"></textarea>
  	  </div>
  	  <div class="form-group">
    	<label for="exampleInputEmail1">Password</label>
    	<input type="password"  name="password" class="form-control" id="exampleInputEmail1"  aria-describedby="emailHelp" placeholder="Enter password">
  	  </div>
  	  <div class="form-group">
    	<label for="exampleInputEmail1">Confirm Password</label>
    	<input type="password"  name="conPassword" class="form-control" id="exampleInputEmail1"  aria-describedby="emailHelp" placeholder="Enter password">
  	  </div>
  	  <div class="container text-center" >
  	  	<button class="btn btn-outline-success" type="submit">Open Account</button>
  	  	<button class="btn btn-outline-warning" type="reset">Reset</button>
  	  </div>
	 </form>
	 	</div>
	 </div>
	</div>
</div>
  </div>
  </div>
  <%@include file="components/footer.jsp" %>
</body>
</html>