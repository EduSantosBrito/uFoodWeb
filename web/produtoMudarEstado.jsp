<%-- 
    Document   : produtoMudarEstado
    Created on : 30/10/2018, 19:33:27
    Author     : ismael.pereira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mudar Estado do Produto</title>
    </head>
    <body>
        <form action="MementoController" method="post">
            <label>ID Produto</label>
            <input type="text" name="idProduto">
            <select name="estadoProduto">
                <option value="Cancelado" name="Cancelado">Cancelado</option>
                <option value="Enviado" name="Enviado">Enviado</option>
                <option value="Recebido" name="Recebido">Recebido</option>
                <option value="Pedido" name="Pedido">Pedido</option>
            </select>
            <br><input type="submit" name="enviarEstado">
        </form>
        <a href="index.jsp"><button>Home</button></a>
    </body>
</html>
