<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>CATEGORIAS</h1>
<form action="add" method="post">


		<input type="hidden" id="idCategoria" name= "idCategoria" value="${categoria.idCategoria}"/>
		Categoria
		<input type="text" id="categoria" name= "categoria" value="${categoria.categoria}"/>
		<br/>
		Descripcion
		<input type="text" id="descripcion" name= "descripcion" value="${categoria.descripcion}"/>
		<br/>
	
		
	<button type="submit">Guardar</button>
	
	<button onclick="window.location.href='/ismac-libreria-web-nocturno/categorias/findAll'; return false;">
					Cancelar
					</button>
	
</form>
</body>
</html>