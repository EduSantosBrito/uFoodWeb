/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.state;

/**
 *
 * @author Eduardo Santos
 */
public interface ProdutoState {
    public ProdutoState pedir();
    public ProdutoState enviar();
    public ProdutoState receber();
    public ProdutoState cancelar();
}
