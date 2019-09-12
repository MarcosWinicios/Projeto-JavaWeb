
<%@page import="br.com.macl.projetomvc.model.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Alunos</title>
</head>
<body>
	<ul>
		<li><a href="index.jsp">Home</a>
	</ul>
	<h2>Lista de Alunos</h2>

	<table border="1">
		<tr>
			<!-- <th>Id</th> -->
			<th>Nome</th>
			<th>Idade</th>
			<th>Cidade</th>
			<th>Excluir</th>
		</tr>

		<%
			List<Aluno> alunos = (List<Aluno>) request.getAttribute("lista");
			for (Aluno aluno : alunos) {
		%>



		<tr>
			<td><%=aluno.getNome()%></td>
			<td><%=aluno.getIdade()%></td>
			<td><%=aluno.getIdCidade().getNome()%></td>
			<td><a href="sistema?logica=ExcluirAluno&id=<%= aluno.getId() %>">X</a></td>
		</tr>

		<%
			}
		%>

	</table>

</body>
</html>