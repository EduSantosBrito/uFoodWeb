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
public class FuncionarioUFood extends ChainMae {

    public FuncionarioUFood(ChainMae proximoPasso) {
        super(proximoPasso);
    }

    @Override
    public boolean isResolved(String problema) {
        if (problema.equals("Bug")) {
            return true;
        } else if (proximoPasso != null) {
            return proximoPasso.isResolved(problema);
        }
        return false;
    }
}
