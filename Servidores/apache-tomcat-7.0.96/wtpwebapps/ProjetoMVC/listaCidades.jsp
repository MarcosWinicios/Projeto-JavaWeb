<%@page import="br.com.macl.projetomvc.model.Cidade"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Cidades</title>
</head>
<body>

	<ul>
		<li><a href="index.jsp">Home</a>
	</ul>
	<h3>Listando...</h3>

	<table border="1">
		<tr>
			<!-- <th>Id</th> -->
			<th>Nome</th>
			<th>Estado</th>
			<th>Excluir</th>
		</tr>

		<%
			List<Cidade> cidades = (List<Cidade>) request.getAttribute("lista");
			for (Cidade cidade : cidades) {
		%>


		<tr>
			<%="<td>" + cidade.getNome() + "</td>"%>
			<%="<td>" + cidade.getEstado() + "</td>"%>
			<td><a href="sistema?logica=ExcluirCidade&id=<%= cidade.getId() %>">X</a></td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>