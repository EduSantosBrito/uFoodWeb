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
import ufood.persistence.DatabaseLocator;

/**
 *
 * @author nicolas.cardoso
 */
public class EmpresaDAO {
    
    private static EmpresaDAO empresaDAO = new EmpresaDAO();
    private Connection conn;
    public static EmpresaDAO getInstance() {
        return empresaDAO;
    }
    private EmpresaDAO(){
        
    }
    
    public void save(Empresa empresa) throws ClassNotFoundException, SQLException {
        Statement st = null;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into empresa (idEmpresa, nome)" +
                        " values ('"+ empresa.getIdEmpresa() +"', '" + empresa.getNome()+ "')");
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }
    
    public void delete(Integer idEmpresa) throws SQLException, ClassNotFoundException {
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from empresa where idempresa = '" + idEmpresa + "';");
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
    }
    
    public List<Empresa> read(Integer idEmpresa) throws SQLException, ClassNotFoundException {
        Statement st = null;
        List<Empresa> empresas = new ArrayList<>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from empresa where idempresa = '" + idEmpresa + "';");
            while(rs.next()){
               empresas.add(new Empresa(rs.getLong("idEmpresa"),rs.getString("nome")));
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