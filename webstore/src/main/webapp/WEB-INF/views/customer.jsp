<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet"
			href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>${customer.CustomerName}</title>
	</head>
	
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>${customer.CustomerName}</h1>
				</div>
			</div>
		</section>
		
		<section class="container">
			<div class="row">
				<div class="col-md-5">
					<p>${customer.CustomerAddress}</p>
					
					<p>
						<strong>Customer ID: </strong><span class="label label-warning">${customer.CustomerId}</span>
					</p>
				
					
					<p>
						<strong>Number of Orders made from our Store </strong> : ${customer.CustomerNoOfOrdersMade}
					</p>
					
					<p>
						<a href="<spring:url value="/customers" />" class="btn btn-default">
							<span class="glyphicon-hand-left glyphicon"></span> back
						</a>
					</p>
	
				</div>
			</div>
		</section>
	</body>
	
</html>
