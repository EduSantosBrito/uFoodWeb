/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.chain;

/**
 *
 * @author ismael.pereira
 */
public abstract class FuncionarioChain {

    public FuncionarioChain proximoPasso;

    public FuncionarioChain(FuncionarioChain proximoPasso) {
        this.proximoPasso = proximoPasso;
    }

    public abstract boolean isResolved(String problema);
}
