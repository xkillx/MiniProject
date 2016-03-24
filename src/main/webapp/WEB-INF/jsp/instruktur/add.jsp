<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		<div class="row">
			<h2 class="text-center">Tambah Instruktur</h2>	
			<form class="form-horizontal" role="form" action="saveOrUpdate">
				<div class="form-group">
					<label class="control-label col-sm-2" for="firstname">Firstname:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="firstname" name="instruktur.firstname" placeholder="Enter First Name" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Lastname:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="lastname" name="instruktur.lastname" placeholder="Enter Last Name" />
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