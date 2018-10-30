/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ufood.model.Compra;

/**
 *
 * @author Eduardo Santos
 */
public class CompraController {

    private Compra model;
    private CompraView view;

    public CompraController(Compra model, CompraView view) {
        this.model = model;
        this.view = view;
    }

    public void setIdCompra(Long idCompra) {
        model.setIdCompra(idCompra);
    }

    public Long getIdCompra() {
        return model.getIdCompra();
    }

    public void setIdUsuario(Long idUsuario) {
        model.setIdUsuario(idUsuario);
    }

    public Long getIdUsuario() {
        return model.getIdUsuario();
    }

    public void setIdProduto(Long idProduto) {
        model.setIdProduto(idProduto);
    }

    public Long getIdProduto() {
        return model.getIdProduto();
    }

    public void updateView(HttpServletRequest req,
            HttpServletResponse res, Long id) throws Exception {
        view.updateView(req, res, id);
    }
}
