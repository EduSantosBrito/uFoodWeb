<%-- 
    Document   : create
    Created on : 28/10/2018, 01:43:26
    Author     : Eduardo Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar Produto</title>
    </head>
    <body>
        <form action="ProjetoSaveController" method="get">
            <label for="id">Id</label>
            <input type="text" name="id">
            <label for="nome">Nome</label>
            <input type="text" name="nome">
            <label for="preco">Preço</label>
            <input type="text" name="preco">
            <label for="tipo">Tipo</label>
            <input type="text" name="tipo">
            <label for="idEmpresa">Empresa</label>
            <input type="text" name="idEmpresa">
            <input type="submit">
        </form>
    </body>
</html>
