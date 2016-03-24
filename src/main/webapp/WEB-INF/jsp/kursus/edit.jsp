<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		<div class="row">
			<h2 class="text-center">Edit Kursus</h2>	
			<form class="form-horizontal" role="form" action="saveOrUpdate">
				<s:hidden name="kursus.kid" />
				<div class="form-group">
					<label class="control-label col-sm-2" for="firstname">Kode Kursus:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="firstname" name="kursus.kode_kursus" placeholder="Enter Kode Kursus" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Nama Kursus:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="lastname" name="kursus.namakursus" placeholder="Enter Last Name" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="pwd">Vendor:</label>
					<div class="col-sm-10">
						<s:select class="form-control" headerKey="-1"
							headerValue="Select Vendor" list="vendors"
							name="kursus.vendor.vid" listKey="vid" listValue="namavendor" />

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