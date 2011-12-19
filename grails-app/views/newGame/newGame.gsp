<%@ page contentType="text/html;charset=ISO-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="main"/>
<title>new game</title>
</head>
<body>
  <div class="body">
  	
  	<table>
  		<g:hasErrors bean="${data}">
  			<ul>
   				<g:eachError var="err" bean="${data}">
       				<li><g:message error="${err}" /></li> 
   				</g:eachError>
  			</ul>
		</g:hasErrors>
  		<g:form controller="newGame">
  			<tr><td>nombre:</td> <td><g:textField name="name" value="${data?.name}"/></td></tr>
  			<tr><td>descripcion:</td> <td> <g:textArea name="description" value="${data?.description}"/></td></tr>
  			<tr><td>nota: </td> <td> <g:textField name="rate" type="integer" value="${data?.rate}"/></td></tr>
  			<tr><td><g:actionSubmit action="add" value="new game"/></td> <td> 
  		</g:form>
  	</table>
  </div>
</body>
</html>