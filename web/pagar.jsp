<%-- 
    Document   : pagar
    Created on : 30/10/2018, 19:36:10
    Author     : nicolas.cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Pagamento</title>
    </head>
    <body>
        <form action="PagarController" method="post">
            <label for="id">Id</label><br>
            <input type="text" name="id"><br>  
            <select name="tipoPagamento">
                <option value="Dinheiro">Dinheiro</option>
                <option value="Cartão">Cartão</option>                
            </select>
        </form>
        
    </body>
</html>
