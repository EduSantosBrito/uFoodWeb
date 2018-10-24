/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ufood.model.Compra;
import ufood.model.Empresa;
import ufood.persistence.DatabaseLocator;

/**
 *
 * @author ismael.pereira
 */
public class CompraDAO {

    private static CompraDAO compraDAO = new CompraDAO();
    private Connection conn;

    public static CompraDAO getInstance() {
        return compraDAO;
    }

    private CompraDAO() {
    }

    public void save(Compra compra) throws ClassNotFoundException, SQLException {
        Statement st = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into compra(idCompra,idUsuario,idProduto) values ('" + compra.getIdCompra()
                    + "', '" + compra.getIdUsuario() + "', '" + compra.getIdProduto());
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }

    public void delete(Integer id) throws SQLException, ClassNotFoundException {
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from compra where idCompra = '" + id + "';");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }

    public List<Compra> read(Integer id) throws SQLException, ClassNotFoundException {
        Statement st = null;
        List<Compra> compras = new ArrayList<>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("");
            while (rs.next()) {
                compras.add(new Compra(rs.getLong("idCompra"), rs.getLong("idUsuario"), rs.getLong("idProduto")));
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
        return compras;
    }

    private void closeResources(Statement st, Connection conn) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {

        }
    }
}
