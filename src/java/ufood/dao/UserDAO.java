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
public class UserDAO {
    private static UserDAO userDAO = new UserDAO();
    private Connection conn;
    public static UserDAO getInstance() {
        return userDAO;
    }
    private UserDAO(){
        
    }
}
