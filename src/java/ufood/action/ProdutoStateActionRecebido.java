/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.action;

import ufood.state.ProdutoState;
import ufood.state.RecebidoState;

/**
 *
 * @author Eduardo Santos
 */
public class ProdutoStateActionRecebido implements Action{

    @Override
    public ProdutoState execute() {
        return new RecebidoState();
    }
    
}
