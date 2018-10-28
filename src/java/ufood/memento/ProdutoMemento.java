/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.memento;

import ufood.state.ProdutoState;

/**
 *
 * @author Eduardo Santos
 */
public class ProdutoMemento {
    ProdutoState estado;
    
    public ProdutoState getEstado() {
        return estado;
    }

    public ProdutoMemento(ProdutoState estado) {
        this.estado = estado;
    }
}
