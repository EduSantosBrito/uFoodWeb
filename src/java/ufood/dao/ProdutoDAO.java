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
                        " values ('"+ produto.getIdProduto() +"', '" + produto.getNome()+ "', '" + produto.getPreco() + "', '" + produto.getTipo() + "', '" + produto.getIdEmpresa() + "');");
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }
    
    public void delete(Long idProduto) throws SQLException, ClassNotFoundException {
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from empresa where idproduto = '" + idProduto + "';");
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }
    
    public List<Produto> read(Long idProduto) throws SQLException, ClassNotFoundException {
        Statement st = null;
        List<Produto> produtos = new ArrayList<>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from produto where idProduto = '" + idProduto + "';");
            while(rs.next()){
                produtos.add(new Produto(rs.getLong("idProduto"),rs.getString("nome"),rs.getDouble("preco"),
                        rs.getString("tipo"),rs.getLong("idEmpresa")));
              //empresas.add(new Empresa(rs.getInt("codempresa"),rs.getString("descricao")));
            }
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
        return produtos;
    }

    private void closeResources(Statement st, Connection conn) {
       try {
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        } catch(SQLException e) {

        }
    }
}