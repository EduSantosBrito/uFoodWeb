<%-- 
    Document   : createCompra
    Created on : 30/10/2018, 11:58:20
    Author     : Eduardo Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar compra</title>
    </head>
    <body>
        <form action="CompraCreateController" method="post">
            <label for="idCompra">Id Compra</label>
            <input type="text" name="idCompra">
            <label for="idUsuario">Id Usuario</label>
            <input type="text" name="idUsuario">
            <label for="idProduto">Id Produto</label>
            <input type="text" name="idProduto">
            <input type="submit">
        </form>
    </body>
</html>
