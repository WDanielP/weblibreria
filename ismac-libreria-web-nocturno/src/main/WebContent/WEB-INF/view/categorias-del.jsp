<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-table.min.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<title>Insert title here</title>
</head>
<body>
<h1>Eliminar Categorias</h1>

<form action="del" method="get">

		<input type="hidden" id="idCategoria" name= "idCategoria" value="${categoria.idCategoria}"/>
		<strong>¿Desea eliminar el dato?</strong>
		<br/>
		<button type ="submit"><i class="fa-solid fa-trash"></i>Eliminar</button>
		
		<button onclick="window.location.href='/ismac-libreria-web-nocturno/categorias/findAll'; return false;"><i class="fa-solid fa-ban"></i>
					Cancelar
					</button>
		

</form>


</body>
</html>