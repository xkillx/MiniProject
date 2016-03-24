<%@ include file="../header.jsp"%>
<body>
	
	<div class="container">
		`
		<div class="row">
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
							<s:url id="daftar" action="daftar">
								<s:param name="nosesi" value="%{nosesi}"></s:param>
							</s:url> <s:a href="%{daftar}" class="btn btn-xs btn-success">
								<i class="glyphicon glyphicon-pencil"></i> Daftar</s:a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>

</body>
</html>