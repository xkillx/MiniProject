<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		<div class="row">
			<h2 class="text-center">Tambah Sesi</h2>
			<form class="form-horizontal" role="form" action="saveOrUpdate">
				<div class="form-group">
					<label class="control-label col-sm-2" for="kursus">Kursus:</label>
					<div class="col-sm-10">
						<s:select class="form-control" headerKey="-1"
							headerValue="Select Kursus" list="kursusList"
							name="sesi.kursus.kid" listKey="kid" listValue="namakursus" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="kursus">Instruktur:</label>
					<div class="col-sm-10">
						<s:select class="form-control" headerKey="-1"
							headerValue="Select Instruktur" list="instrukturList"
							name="sesi.instruktur.iid" listKey="iid" listValue="firstname" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="check-in">Check
						In:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="check-in"
							name="sesi.check_in" placeholder="Check In" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="check-out">Check
						Out:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="check-out"
							name="sesi.check_out" placeholder="Check Out" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="jam">Jam:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="jam" name="sesi.jam"
							placeholder="Jam" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="ruang">Ruang:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="ruang" name="sesi.ruang"
							placeholder="Ruang" />
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
	<script type="text/javascript">
	$(function() {
        $( "#check-in" ).datepicker();
       	$( "#check-out" ).datepicker();
    });
	</script>

</body>
</html>