/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.dao;

import java.sql.Connection;

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
}
