<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastra Produto</title>
</head>
<body>
	<center>
		<h2>Cadastrar Produto</h2>
		<form>
			<table border="4">
				<tr>
					<td>Nome Produto: <input type="text" name="produto"
						placeholder="Nome Produto"><br> Preço: <input
						type="text" name="preco" placeholder="Preço" class="preco"><br>
						<center>
							<input type="button" onclick="funcao1()" value="salvar" />
						</center>
						<br>
						</form>
						</center> <script>
							function funcao1() {
								alert("Produto cadastrado com sucesso!");
							}
						</script>

						<style>
h2 {
	color: green;
}

</style>
</body>
</html>