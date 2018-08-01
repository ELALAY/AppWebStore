<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Add Product</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>Add products</p>
			</div>
		</div>
	</section>

	<section class="container">
		<form:form modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data">
			<fieldset>
				<legend>Add new product</legend>

				<%-- "the messages.properties link"--%>
					<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId">
						<spring:message code="addProduct.form.productId.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text" class="form:input-large" />
					</div>
				</div>
				 
				<%-- 
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId">Product
						Id</label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text"
							class="form:input-large" />
					</div>
				</div>--%>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="name">Product
						Name</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="unitPrice">Unit
						Price</label>
					<div class="col-lg-10">
						<form:input id="unitPrice" path="unitPrice" type="int"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows="2" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="manufacturer">Product
						Manufacturer</label>
					<div class="col-lg-10">
						<form:input id="name" path="manufacturer" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="category">Product
						Category</label>
					<div class="col-lg-10">
						<form:input id="category" path="category" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="unitsInStock">Units
						in stock</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock" type="int"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="unitsInOrder">Units
						in order</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInOrder" type="int"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="discontinued">Product
						Discontinued</label>
					<div class="col-lg-10">
						<form:checkbox id="discontinued" path="discontinued" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="productImage"> 
						<!--<spring:message code="addProdcut.form.productImage.label" />-->
						Product Image file
						</label>
					<div class="col-lg-10">
						<form:input id="productImage" path="productImage" type="file"
							class="form:input-large" />
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Add" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>