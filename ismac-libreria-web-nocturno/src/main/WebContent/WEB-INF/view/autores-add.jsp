 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>AUTORES</h1>
<form action="add" method="post">


		<input type="hidden" id="idAutor" name= "idAutor" value="${autor.idAutor}"/>
		Nombre
		<input type="text" id="nombre" name= "nombre" value="${autor.nombre}"/>
		<br/>
		Apellido
		<input type="text" id="apellido" name= "apellido" value="${autor.apellido}"/>
		<br/>
		Pais
		<input type="text" id="pais" name= "pais" value="${autor.pais}"/>
		<br/>
		Direccion
		<input type="text" id="direccion" name= "direccion" value="${autor.direccion}"/>
		<br/>
		Telefono
		<input type="text" id="telefono" name= "telefono" value="${autor.telefono}"/>
		<br/>
		Correo
		<input type="email" id="correo" name= "correo" value="${autor.correo}"/>
		<br/>
		
	<button type="submit">Guardar</button>
	
	<button onclick="window.location.href='/ismac-libreria-web-nocturno/autores/findAll'; return false;">
					Cancelar
					</button>
	
</form>
</body>
</html>