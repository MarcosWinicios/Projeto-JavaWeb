<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrp de Cidade</title>
</head>
<body>
	<h2>Cadastro de Cidade aqui</h2>
	<form action="sistema?logica=CadastrarCidade" method="post">
		Nome: <br> <input type="text" name="nome"> <br> <br>
		Estado: <br> <input type="text" name="estado"> <br>
		<br> <input type="submit" value="Salvar Cidade">
	</form>
</body>
</html>