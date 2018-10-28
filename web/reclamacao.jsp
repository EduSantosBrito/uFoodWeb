<%-- 
    Document   : reclamacao
    Created on : 27/10/2018, 22:36:36
    Author     : Eduardo Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reclamação</title>
    </head>
    <body>
        <h1>Página de reclamação</h1>
        <form action="ChainController" method="get">
            <input type="text" name="mensagem">
            <select name="tipoProblema">
                <option id="opcaoProblema" value="Entrega">Entrega</option>
                <option id="opcaoProblema" value="Bug">Bug</option>
                <option id="opcaoProblema" value="Outro">Outro</option>
            </select>
            <input type="submit">
        </form>
        <a href="index.jsp"><button>Home</button></a>
    </body>
</html>
