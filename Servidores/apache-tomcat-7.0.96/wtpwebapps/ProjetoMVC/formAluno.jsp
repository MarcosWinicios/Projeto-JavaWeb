<%@page import="br.com.macl.projetomvc.dao.CidadeDAO"%>
<%@page import="br.com.macl.projetomvc.model.Cidade"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Cadastro de Aluno</title>
</head>
<body>


	<h2>Cadastro de Aluno</h2>

	<form action="sistema?logica=CadastrarAluno" method="post">
		Nome: <br> <input type="text" name="nome"> <br>
		<br> Idade: <br> <input type="text" name="idade"> <br>
		<br> Cidade: <br> Selecione a cidade: 
		<select name="idCidade">
			<%
				List<Cidade> lista = new CidadeDAO().listarTudo();
				for (Cidade cidade : lista) {
					out.println("<option value='" + cidade.getId() + "'>" + cidade.getNome() + " - " + cidade.getEstado()
							+ "</option>");
				}
			%>

		</select> <br>
		<br> <input type="submit" value="Cadastrar Aluno">
	</form>

</body>
</html>