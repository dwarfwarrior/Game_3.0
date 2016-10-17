package com.company.dataBaseOfGame;

import javax.swing.*;
import java.sql.*;

/**
 * Created by dwarfawrrior on 7/10/2016.
 */
public class ConnectAndWorkWhithDB {

    private static final String url = "jdbc:mysql://localhost:3306/game";
    private static final String user = "root";
    private static final String password = "1111";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void DataBase () {
        try {

            con = DriverManager.getConnection(url, user, password);

            String query  = "select * from data";
            String query2  = "insert into data (name) values (?)  ";

            PreparedStatement preparedStmt = con.prepareStatement(query2);
            preparedStmt.setString (1, JOptionPane.showInputDialog(null, "Call your Character"));
            preparedStmt.execute();

            stmt = con.createStatement();


            System.out.println("\n\t");

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int count = rs.getInt("id");
                String name = rs.getString(2);
                System.out.println("Total number of books in the table : " + count +  " : " +  name + " : ");

            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

    public static void Load(){
        try {

            con = DriverManager.getConnection(url, user, password);

            String query  = "select * from data";

            stmt = con.createStatement();


            System.out.println("\n\t");

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int count = rs.getInt("id");
                String name = rs.getString(2);
                System.out.println("Total number of books in the table : " + count +  " : " +  name + " : ");

            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

}
