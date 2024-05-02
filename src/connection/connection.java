/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.*;

/**
 *
 * @author CIAGamester
 */
public class connection {
    private static Connection connection;
    public static Connection connect()throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connected!");
        } catch(ClassNotFoundException ex){
            System.out.println("Not Connected!" + ex);
        }
        String url = "jdbc:mysql://localhost:3306/project-cafe";
        try{
            connection = DriverManager.getConnection(url, "root", "");
            System.out.println("Database connected!");
        } catch(SQLException ex){
            System.out.println("Database not connected!");
        }
        return connection;
    }
}
