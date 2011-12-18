<%@ page contentType="text/html;charset=ISO-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="main"/>
<title>home</title>
</head>
<body>
  <div class="body">
  	
  	<h1>Listado de juegos disponibles</h1>
  	<table>
  		<th>Nombre</th>
  		<th>Descripcion</th>
  		<th>rate</th>
  		<g:each var="game" in="${games}">
  			<tr>
  				<td>${game.name}</td>
  				<td>${game.description}</td>
  				<td>${game.rate}</td>
  			</tr>
  		</g:each>
  	</table>
  	
  </div>
</body>
</html>