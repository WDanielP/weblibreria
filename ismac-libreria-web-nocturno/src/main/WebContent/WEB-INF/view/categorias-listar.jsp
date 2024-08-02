<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>CATEGORIAS</h1>
	<button onclick="window.location.href='/ismac-libreria-web-nocturno/categorias/findOne?opcion=1'; return false;">
					Agregar
					</button>

		<table>
			<thead>
				<tr>
				<th>idCategoria</th>
				<th>Categoria</th>
				<th>Descripcion</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="item" items="${categorias}">
				<tr>
					<td>${item.idCategoria}</td>
					<td>${item.categoria}</td>
					<td>${item.descripcion}</td>
					<td>
					<button onclick="window.location.href='/ismac-libreria-web-nocturno/categorias/findOne?idCategoria=${item.idCategoria}&opcion=1'; return false;">
					Actualizar
					</button>
	
					<button onclick="window.location.href='/ismac-libreria-web-nocturno/categorias/findOne?idCategoria=${item.idCategoria}&opcion=2'; return false;">
					Eliminar
					</button>
					
					
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>