<%@ include file="../header.jsp"%>
<body>
	<%@ include file="../menu.jsp"%>

	<div class="container">
		<div class="row">
			<h3>
				Data Instruktur <a href="add" class="btn btn-success"> <i
					class="icon-plus"></i> Tambah Data
				</a>
			</h3>
			<table class="table table-condensed table-bordered table-hover">
				<tr>
					<th>No</th>
					<th>ID</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th class="text-center">Aksi</th>
				</tr>
				<s:iterator value="instrukturs" status="stat">
					<tr>
						<td><s:property value="#stat.count" /></td>
						<td><s:property value="iid" /></td>
						<td><s:property value="firstname" /></td>
						<td><s:property value="lastname" /></td>
						<td class="text-center"><s:url id="editURL" action="edit">
								<s:param name="iid" value="%{iid}"></s:param>
							</s:url> <s:a href="%{editURL}" class="btn btn-xs btn-primary">
								<i class="glyphicon glyphicon-pencil"></i> Edit</s:a> <s:url
								id="deleteURL" action="delete">
								<s:param name="iid" value="%{iid}"></s:param>
							</s:url> <s:a href="%{deleteURL}" class="btn btn-xs btn-danger">
								<i class="glyphicon glyphicon-trash"></i> Delete</s:a></td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>
	<%-- <div align="center">
		<s:form action="saveOrUpdate">
			<s:push value="instruktur" />
			<s:hidden name="iid" />
			<s:textfield name="firstname" label="Firstname" />
			<s:textfield name="lastname" label="Lastname" />
			<s:submit />
		</s:form>

	</div> --%>

</body>
</html>