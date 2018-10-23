/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import ufood.model.Compra;
import ufood.persistence.DatabaseLocator;

/**
 *
 * @author ismael.pereira
 */
public class CompraDAO {
    private static CompraDAO compraDAO = new CompraDAO();
    private Connection conn;
    public static CompraDAO getInstance(){
        return compraDAO;
    }
    
    private CompraDAO(){
    }
    public void save(Compra compra)throws ClassNotFoundException, SQLException{
        Statement st = null;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into compra()");
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }
    private void closeResources(Statement st, Connection conn) {
       try {
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        } catch(SQLException e) {

        }
    }
}

