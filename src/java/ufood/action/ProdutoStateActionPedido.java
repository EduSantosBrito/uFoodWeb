/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.action;

import ufood.state.PedidoState;
import ufood.state.ProdutoState;

/**
 *
 * @author Eduardo Santos
 */
public class ProdutoStateActionPedido implements Action{

    @Override
    public ProdutoState execute() {
        return new PedidoState();
    }
    
}
