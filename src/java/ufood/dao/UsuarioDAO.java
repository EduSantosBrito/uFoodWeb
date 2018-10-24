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
import ufood.model.Usuario;
import ufood.persistence.DatabaseLocator;

/**
 *
 * @author Eduardo Santos
 */
public class UsuarioDAO {
    private static UsuarioDAO userDAO = new UsuarioDAO();
    private Connection conn;
    public static UsuarioDAO getInstance() {
        return userDAO;
    }
    private UsuarioDAO(){
    }
     public void save(Usuario usuario)throws ClassNotFoundException, SQLException{
        Statement st = null;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into usuario(idUsuario, nome, senha) values ('" + usuario.getIdUsuario() 
                    + "', '" + usuario.getNome() + "', '" + usuario.getSenha());
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
            st.execute("delete from usuario where idUsuario = '" + id + "';");
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
     }
      public List<Usuario> read(Integer id) throws SQLException, ClassNotFoundException {
        Statement st = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("");
            while(rs.next()){
               usuarios.add(new Usuario(rs.getLong("idUsuario"),rs.getString("nome"),rs.getString("senha")));
            }
        } catch(SQLException e) {
            throw e;
        } finally {
            closeResources(st, conn);
        }
        return usuarios;
    }
      
          private void closeResources(Statement st, Connection conn) {
       try {
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        } catch(SQLException e) {

        }
    }
}
