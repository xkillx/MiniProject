<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>
	
	<div class="container">
		`
		<div class="row">
			<h3>
				Data Sesi <a href="add" class="btn btn-success"> <i
					class="icon-plus"></i> Tambah Data
				</a>
			</h3>
			<table class="table table-condensed table-bordered table-hover">
				<tr>
					<th>No</th>
					<th>No Sesi</th>
					<th>Kursus</th>
					<th>Instruktur</th>
					<th>Check In</th>
					<th>Check Out</th>
					<th>Jam</th>
					<th>Ruang</th>
					<th>Last Update</th>
					<th class="text-center">Aksi</th>
				</tr>
				<s:iterator value="sesiList" status="stat">
					<tr>
						<td><s:property value="#stat.count" /></td>
						<td><s:property value="nosesi" /></td>
						<td><s:property value="kursus.namakursus" /></td>
						<td><s:property value="instruktur.firstname" /></td>
						<td><s:property value="check_in" /></td>
						<td><s:property value="check_out" /></td>
						<td><s:property value="jam" /></td>
						<td><s:property value="ruang" /></td>
						<td><s:property value="last_update" /></td>
						<td class="text-center">
							<s:url id="detailURL" action="detail">
								<s:param name="nosesi" value="%{nosesi}"></s:param>
							</s:url> <s:a href="%{detailURL}" class="btn btn-xs btn-success">
								<i class="glyphicon glyphicon-th-list"></i> Detail</s:a>
							<s:url id="editURL" action="edit">
								<s:param name="nosesi" value="%{nosesi}"></s:param>
							</s:url> <s:a href="%{editURL}" class="btn btn-xs btn-primary">
								<i class="glyphicon glyphicon-pencil"></i> Edit</s:a> <s:url
								id="deleteURL" action="delete">
								<s:param name="nosesi" value="%{nosesi}"></s:param>
							</s:url> <s:a href="%{deleteURL}" class="btn btn-xs btn-danger">
								<i class="glyphicon glyphicon-trash"></i> Delete</s:a></td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>

</body>
</html>