<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		`
		<div class="row">
			<h3>
				Data Peserta <a href="add" class="btn btn-success"> <i
					class="icon-plus"></i> Tambah Data
				</a>
			</h3>
			<table class="table table-condensed table-bordered table-hover">
				<tr>
					<th>No</th>
					<th>ID</th>
					<th>Nama</th>
					<th>Perusahaan</th>
					<th>Alamat Perusahaan</th>
					<th>Alamat Rumah</th>
					<th>Email</th>
					<th>Telepon</th>
					<th>Nomor HP</th>
					<th>Keterangan</th>
					<th class="text-center">Aksi</th>
				</tr>
				<s:iterator value="regs" status="stat">
					<tr>
						<td><s:property value="#stat.count" /></td>
						<td><s:property value="id_peserta" /></td>
						<td><s:property value="nama" /></td>
						<td><s:property value="perusahaan" /></td>
						<td><s:property value="alamat_perusahaan" /></td>
						<td><s:property value="alamat_rumah" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="telepon" /></td>
						<td><s:property value="handphone" /></td>
						<td><s:property value="keterangan" /></td>
						<td class="text-center"><s:url id="editURL" action="edit">
								<s:param name="id_peserta" value="%{id_peserta}"></s:param>
							</s:url> <s:a href="%{editURL}" class="btn btn-xs btn-primary">
								<i class="glyphicon glyphicon-pencil"></i> Edit</s:a> <s:url
								id="deleteURL" action="delete">
								<s:param name="id_peserta" value="%{id_peserta}"></s:param>
							</s:url> <s:a href="%{deleteURL}" class="btn btn-xs btn-danger">
								<i class="glyphicon glyphicon-trash"></i> Delete</s:a></td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>

</body>
</html>