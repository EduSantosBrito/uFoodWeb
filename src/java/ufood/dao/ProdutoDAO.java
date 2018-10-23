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
import ufood.model.Empresa;
import ufood.model.Produto;
import ufood.persistence.DatabaseLocator;

/**
 *
 * @author nicolas.cardoso
 */
public class ProdutoDAO {
    
    private static ProdutoDAO empresaDAO = new ProdutoDAO();
    private Connection conn;
    public static ProdutoDAO getInstance() {
        return empresaDAO;
    }
    private ProdutoDAO(){
        
    }
    
    public void save(Produto produto) throws ClassNotFoundException, SQLException {
        Statement st = null;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into produto (idProduto, nome, preco, tipo, idEmpresa)" +
                        " values ('"+ produto.getIdProduto() +"', '" + produto.getNome()+ "', '" + produto.getPreco() + "', '" + produto.getTipo() + "', '" + produto.getIdEmpresa() + "')");
        } catch(SQLException e) {
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
            st.execute("delete from empresa where codempresa = '" + id + "';");
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }
    
    public List<Empresa> read(Integer id) throws SQLException, ClassNotFoundException {
        Statement st = null;
        List<Empresa> empresas = new ArrayList<>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from empresa where codempresa = '" + id + "';");
            while(rs.next()){
              // empresas.add(new Empresa(rs.getInt("codempresa"),rs.getString("descricao")));
            }
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
        return empresas;
    }

    private void closeResources(Statement st, Connection conn) {
       try {
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        } catch(SQLException e) {

        }
    }
}