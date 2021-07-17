<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer Details</title>
<style type="text/css">
	.bg-custom{box-content:box;}
</style>
<%@include file="components/common_cs_js.jsp" %>
</head>
<body>
	<%@include file="components/navbar.jsp" %>
	<div class="container bg-custom">
		<div class="row  mt-5">
			<div class="col col-offset-2">
				<div class="card">
					<div class="card-header">
						<h1 class="text-center" style="color:#521414; text:capatlize;">Apply for A Card</h1>
					</div>
					<div class="card-body">
					<%@include file="components/message.jsp" %>
					    <form action="CardApplyServlet" method="post">
							  <div class="form-group">
							    <label for="exampleInputEmail1">Account Number</label>
							    <input type="number" class="form-control" name="accountNumber"  placeholder="Enter Account number">
							  </div>
							  <div class="input-group">
									 <select class="custom-select" id="inputGroupSelect04" name="card">
									    <option selected>Select Card Type...</option>
									    <option value="1">Smart card</option>
									    <option value="2">Debit Card</option>
									    <option value="3">Credit Card</option>
									 </select>
									  <div class="input-group-append">
									    <button class="btn btn-outline-secondary" type="button">Select</button>
									  </div>
									</div>
							  
							  <div class="text-center mt-5">
							  		<button type="submit" class="btn btn-outline-success">Apply</button>
							  </div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>