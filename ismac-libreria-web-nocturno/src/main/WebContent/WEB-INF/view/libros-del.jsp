<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>LIBROS</h1>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />


<form action="del" method="get">

		<input type="hidden" id="idLibro" name= "idLibro" value="${libro.idLibro}"/>
		<strong>¿Desea eliminar el dato?</strong>
		<br/>
		<button type ="submit"><i class="fa-solid fa-floppy-disk"></i>Guardar</button>
		
		<button onclick="window.location.href='/ismac-libreria-web-nocturno/libros2/findAll'; return false;"><i class="fa-solid fa-ban"></i>Cancelar
					</button>
		

</form>


</body>
</html>