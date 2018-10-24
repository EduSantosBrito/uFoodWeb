/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.state;

/**
 *
 * @author nicolas.cardoso
 */
public class EnviadoState implements ProdutoState{

    @Override
    public ProdutoState pedir() {
        return this;
    }

    @Override
    public ProdutoState enviar() {
        return this;
    }

    @Override
    public ProdutoState receber() {
        return RecebidoState;
    }

    @Override
    public ProdutoState cancelar() {
        return this;
    }
    
}
