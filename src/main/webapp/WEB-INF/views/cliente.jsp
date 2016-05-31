<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Formulário Cliente</h1>
	<form action="adicionarClientes" method="post">

		<label for="nome">Nome</label>
		<input type="text" name="nome" id="nome"> <br>
		<label for="ruaNroComp">Rua Número</label>
		<input type="text"  name="ruaNroComp" id="ruaNroComp"><br>
		<label for="bairro">Bairro</label> 
		<input type="text"  name="bairro" id="bairro"> <br>
		<label for="cidade">Cidade</label> 
		<input type="text"  name="cidade" id="cidade"><br>

		<button type="submit">Cadastrar</button>
	</form>
	
	<table>
						<thead>
							<tr>
								<th >Nome</th>
								<th >Rua Numero</th>
								<th >Bairro</th>
								<th >Cidade</th>
								
							</tr>
						</thead>
						<tbody>

							<c:forEach var="c" items="${clientes}">
								<tr>
									<td>${c.nome}</td>
									<td>${c.ruaNroComp}</td>
                                     <td>${c.bairro}</td>
                                     <td>${c.cidade}</td>
								
								</tr>
							</c:forEach>
						</tbody>
					</table>
</body>
</html>