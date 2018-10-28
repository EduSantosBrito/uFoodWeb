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
        <form action="EmpresaCreateController" method="get">
            <label for="id">Id</label>
            <input type="text" name="id">
            <label for="nome">Nome</label>
            <input type="text" name="nome">
            <input type="submit">
        </form>
    </body>
</html>
