<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		<div class="row">
			<h2 class="text-center">Edit Vendor</h2>	
			<form class="form-horizontal" role="form" action="saveOrUpdate">
				<div class="form-group">
					<label class="control-label col-sm-2" for="namavendor">Nama Vendor:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="namavendor" name="vendor.namavendor" placeholder="Nama Vendor" />
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