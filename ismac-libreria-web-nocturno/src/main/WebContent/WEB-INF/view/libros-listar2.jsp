<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>LIBROS</h1>>
	
	<table>
		<thead>
			<tr>
			<th>idLibro</th>
			<th>titulo</th>
			<th>editorial</th>
			<th>numpaginas</th>
			<th>edicion</th>
			<th>idioma</th>
			<th>fechapublicacion</th>
			<th>descripcion</th>
			<th>descripcion</th>
			<th>tipoPasta</th>
			<th>iSBN</th>
			<th>numejemplares</th>
			<th>portada</th>
			<th>presentacion</th>
			<th>precio</th>
			<th>categoria</th>
			<th>autor</th>
			<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach  var="item" items="${libros}">
		<tr>
			<td>${item.idLibro}</td>
			<td>${item.titulo}</td>
			<td>${item.editorial}</td>
			<td>${item.numPaginas}</td>
			<td>${item.edicion}</td>
			<td>${item.idioma}</td>
			<td>${item.fechaPublicacion}</td>
			<td>${item.descripcion}</td>
			<td>${item.tipoPasta}</td>
			<td>${item.ISBN}</td>
			<td>${item.numEjemplares}</td>
			<td>${item.portada}</td>
			<td>${item.presentacion}</td>
			<td>${item.precio}</td>
			<td>${item.categoria}</td>
			<td>${item.autor}</td>
			<td>
				<button>Actualizar</button>
				<button>Borrar</button>
			</td>
			</tr>
		</c:forEach>
				</tbody>
	</table>
</body>
</html>