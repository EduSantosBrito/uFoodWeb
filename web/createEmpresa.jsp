<%-- 
    Document   : create
    Created on : 28/10/2018, 16:52:14
    Author     : Eduardo Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar Empresa</title>
    </head>
    <body>
        <form action="EmpresaCreateController" method="post">
            <label for="id">Id</label><br>
            <input type="text" name="id"><br>
            <label for="nome">Nome</label><br>
            <input type="text" name="nome"><br>
            <input type="submit"><br>
        </form>
        <a href="index.jsp"><button>Home</button></a>
    </body>
</html>
