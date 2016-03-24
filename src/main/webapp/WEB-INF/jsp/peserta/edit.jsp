<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		<div class="row">
			<h2 class="text-center">Edit Peserta</h2>	
			<form class="form-horizontal" role="form" action="saveOrUpdate">
				<s:hidden name="reg.id_peserta" />
				<div class="form-group">
					<label class="control-label col-sm-2" for="nama">Nama Peserta:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="nama" name="reg.nama" placeholder="Nama" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="perusahaan">Perusahaan:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="perusahaan" name="reg.perusahaan" placeholder="Perusahaan" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="alamat-perusahaan">Alamat Perusahaan:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="alamat-perusahaan" name="reg.alamat_perusahaan" placeholder="Alamat Perusahaan" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="alamat-rumah">Alamat Rumah:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="alamat-rumah" name="reg.alamat_rumah" placeholder="Alamat Rumah" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="email" name="reg.email" placeholder="Email" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="telepon">Telepon:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="telepon" name="reg.telepon" placeholder="Telepon" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="handphone">Handphone:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="handphone" name="reg.handphone" placeholder="Handphone" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="keterangan">Keterangan:</label>
					<div class="col-sm-10">
						<s:textfield class="form-control" id="keterangan" name="reg.keterangan" placeholder="Keterangan" />
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