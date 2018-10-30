/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.mvc;

import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ufood.dao.CompraDAO;
import ufood.model.Compra;

/**
 *
 * @author Eduardo Santos
 */
public class CompraView {

    public void updateView(HttpServletRequest req,
            HttpServletResponse res, Long id) throws Exception {
        RequestDispatcher rd = req.getRequestDispatcher("mostrarCompras.jsp");
        List<Compra> compra = CompraDAO.getInstance().read(id);
        req.setAttribute("compra", compra);
        rd.forward(req, res);
    }
}
