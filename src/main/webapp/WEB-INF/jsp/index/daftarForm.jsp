<%@ include file="../header.jsp"%>
<body>
	<div class="container">
		<div class="row">
			<h2 class="text-center">Masukin Email Gan</h2>	
			<form class="form-horizontal" role="form" action="cekEmail">
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email Ente Gan:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="email" name="email" placeholder="Email Gan" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Submit</button>
						<a href="list" class="btn btn-danger">Cancel</a>
					</div>
				</div>
			</form>
		</div>
	</div>


</body>
</html>