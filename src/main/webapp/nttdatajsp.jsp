<%@ page import="com.NTTData.tomcat.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NTTData | Formacion  - Apache Tomcat</title>
</head>
<body>
	<h3>Bienvenid@s a NTTData - Primer JSP | Contar de 1 a 10</h3>
	
	<%
		int cont = 0;
		while(cont <=10){
			out.print("A la de.. "+ cont++ +"<br />");
		}
	%>
	
	<p style="font-weight: bold"><%= NTTDataJSP.helloNTTData("Alejandro") %></p>
	
</body>
</html>