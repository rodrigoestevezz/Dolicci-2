<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login <a href="index.html"> (Voltar)</a></h1>

	<form id="form1">
		<label>CPF:</label>
		<input type="text" name="tcpf" value="<%= request.getAttribute("cpf")==null?"": request.getAttribute("cpf") %>" /><br>
		
		<label>Senha:</label>
		<input type="text" name="tsenha" value="<%= request.getAttribute("senha")==null?"": request.getAttribute("senha") %>"/><br><br>
		
		<input type="text" name="tmensagem" value="<%= request.getAttribute("tmensagem")==null?"": request.getAttribute("tmensagem") %>"/><br><br>
		
		<input type="submit" value ="Logar" formaction="SvLogar" formmethod="get"/><br><br><br>
		<input type="submit" value ="Criar Tudo" formaction="SvCriarTudo" formmethod="get"/>
		<input type="submit" value ="Parar Tudo" formaction="SvPararTudo" formmethod="get"/>

	</form>
</body>
</html>