<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Add Product</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>Customers</h1>
					<p>Add products</p>
				</div>
			</div>
		</section>
		
		<section class="container">
			<form:form modelAttribute="newCustomer" class="form-horizontal">
				<fieldset>
					<legend>Add new product</legend>
					
					<%-- "the messages.properties link"
					<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId">
						<spring:message code="addProduct.form.productId.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text" class="form:input-large" />
					</div>
				</div> --%>
				
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="customerId">Customer Id</label>
						<div class="col-lg-10">
							<form:input id="customerId" path="customerId" type="text" class="form:input-large" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="customerName">Customer Name</label>
						<div class="col-lg-10">
							<form:input id="customerName" path="customerName" type="text" class="form:input-large" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-lg-2" for="customerAddress">Customer Address</label>
						<div class="col-lg-10">
							<form:textarea id="customerAddresss" path="customerAddress" rows = "2"/>
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="customerNoOfOrdersMade">customerNoOfOrdersMade</label>
						<div class="col-lg-10">
							<form:input id="customerNoOfOrdersMade" path="customerNoOfOrdersMade" type="int" class="form:input-large" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<input type="submit" id="btnAdd" class="btn btn-primary" value="Add" />
						</div>
					</div>
				</fieldset>
			</form:form>
		</section>
	</body>
</html>