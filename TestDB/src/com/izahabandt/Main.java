package com.izahabandt;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\izabe\\Desktop\\testjava.db");
//             Statement statement = conn.createStatement()){
//             statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\izabe\\Desktop\\testjava.db");
//          conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                    "(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    "VALUES('Joe', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    "VALUES('Fido', 9038, 'dog@email.com')");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()){
                System.out.println(results.getString("name") + " " +
                       results.getInt("phone") + "" +
                        results.getString("email"));
            }

            results.close();

//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Joe'");

            statement.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }
}
