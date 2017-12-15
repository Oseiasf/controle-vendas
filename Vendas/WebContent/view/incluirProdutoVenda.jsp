<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.List"%>
<jsp:useBean id="produto" class="model.Produto" />


<jsp:useBean id="dao" class="model.ProdutoDAO" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border='1'>
		<tr>
			<td>Codigo</td>
			<td>Nome</td>
			<td>Preço</td>

		</tr>

		<c:forEach var="produto" items="${dao.listar()}">


			<tr>
				<td>${produto.codigo}</td>
				<td>${produto.nome}</td>
				<td>${produto.preco}</td>
				<td>
					<form action="iniciarVenda" method="POST">

						<input type='radio' name='iniciar' value='${produto.codigo}'>
						<input type='radio' name='iniciar' value='Não iniciar'> <input
							type='submit' value="Enviar">
					</form>

				</td>
			</tr>

		</c:forEach>
	</table>





</body>
</html>