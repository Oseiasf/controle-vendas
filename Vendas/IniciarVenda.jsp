<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center><h2>Clientes cadastrados</h2>
	<form action="iniciarVenda" method="POST">
	<label>Cliente</label>
		
		
			ProdutoDao dao = new ProdutoDao();
			List<Cliente> listaCliente = dao.listar();
			for (Cliente cliente : listaCliente ) {
			%>
			<li><%=cliente.getCodigo()%> </li>
			
			}
			
		
		
	</form>
	<br><br><br><button>Prosseguir</button>
	</center>
	
</body>
</html>