<%-- 
    Document   : create
    Created on : 30/10/2018, 10:43:59
    Author     : Eduardo Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar Usuário</title>
    </head>
    <body>
        <form action="UsuarioCreateController" method="post">
            <label for="id">Id</label><br>
            <input type="text" name="id"><br>
            <label for="username">Username</label><br>
            <input type="text" name="username"><br>
            <label for="password">Password</label><br>
            <input type="password" name="password"><br>
            <input type="submit"><br>
        </form>
        <a href="index.jsp"><button>Home</button></a>
    </body>
</html>
