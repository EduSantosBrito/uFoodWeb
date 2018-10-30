/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eduardo Santos
 */
public class DatabaseLocator {
    private static DatabaseLocator databaseLocator = new DatabaseLocator();
    public static DatabaseLocator getInstance() {
        return databaseLocator;
    }
    private DatabaseLocator(){
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ufood", "root", "root");
        return conn;
    }
}