<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		`
		<div class="row">
			<h3>
				Data Kursus <a href="add" class="btn btn-success"> <i
					class="icon-plus"></i> Tambah Data
				</a>
			</h3>
			<table class="table table-condensed table-bordered table-hover">
				<tr>
					<th>No</th>
					<th>ID</th>
					<th>Kode Kursus</th>
					<th>Nama Kursus</th>
					<th>Nama Vendor</th>
					<th class="text-center">Aksi</th>
				</tr>
				<s:iterator value="kursusList" status="stat">
					<tr>
						<td><s:property value="#stat.count" /></td>
						<td><s:property value="kid" /></td>
						<td><s:property value="kode_kursus" /></td>
						<td><s:property value="namakursus" /></td>
						<td><s:property value="vendor.namavendor" /></td>
						<td class="text-center"><s:url id="editURL" action="edit">
								<s:param name="kid" value="%{kid}"></s:param>
							</s:url> <s:a href="%{editURL}" class="btn btn-xs btn-primary">
								<i class="glyphicon glyphicon-pencil"></i> Edit</s:a> <s:url
								id="deleteURL" action="delete">
								<s:param name="kid" value="%{kid}"></s:param>
							</s:url> <s:a href="%{deleteURL}" class="btn btn-xs btn-danger">
								<i class="glyphicon glyphicon-trash"></i> Delete</s:a></td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>

</body>
</html>