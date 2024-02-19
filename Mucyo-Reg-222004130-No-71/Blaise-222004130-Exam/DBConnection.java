/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careerconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */

//
public class DBConnection {
    static final String URL = "jdbc:mysql://localhost/careersinfo";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection DBConnection(){
     Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USER,PASS);
            return con;
        } catch (SQLException ex) {
            System.out.println("There is an Error while connecting.");
            return null;
        }
    }
}
