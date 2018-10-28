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
public class FuncionarioRestaurante extends FuncionarioChain {

    public FuncionarioRestaurante(FuncionarioChain proximoPasso) {
        super(proximoPasso);
    }

    @Override
    public boolean isResolved(String problema) {
        if (problema.equals("Entrega")) {
            return true;
        } else if (proximoPasso != null) {
            return proximoPasso.isResolved(problema);
        }
        return false;
    }
}
