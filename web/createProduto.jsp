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
        <form action="ProdutoCreateController" method="post">
            <label for="id">Id</label><br>
            <input type="text" name="id"><br>
            <label for="nome">Nome</label><br>
            <input type="text" name="nome"><br>
            <label for="preco">Preço</label><br>
            <input type="text" name="preco"><br>
            <label for="tipo">Tipo</label><br>
            <input type="text" name="tipo"><br>
            <label for="idEmpresa">Empresa</label><br>
            <input type="text" name="idEmpresa"><br>
            <input type="submit"><br>
        </form>
        <a href="index.jsp"><button>Home</button></a>
    </body>
</html>
