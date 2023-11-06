<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription Cours</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body style="margin: 10%;">
<%
	String s = (String) request.getAttribute("succes");
	if(s!=null){
%>
	<div class="succes alert alert-success"><%=s%></div><%}%> 
<%	
	String e = (String) request.getAttribute("erreur");
	if(e!=null){
%>
	<div class="erreur alert alert-danger"><%=e%></div><%}%> 
	
 <h1>Welcome on this App</h1>
 <a href="./etudiant" class="btn btn-outline-primary">Creer un compte</a>
 <a href="./creation" class="btn btn-outline-primary">Creation de cours</a>
 <a href="./inscription" class="btn btn-outline-primary">Inscription au cours</a>
 
 <script src="jquery.min.js">
 </script>
 <script>
 $(document).ready(function(){
	 $(".succes").fadeOut(5000);
	 $(".erreur").fadeOut(5000);
 });
 </script>
</body>
</html>