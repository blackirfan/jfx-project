package sample;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSql {

    public static void writeToDatabase(String userName, String userEmail, String userPassword) {

        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgres";
        String password = "123321";

        String name = userName;
        String email= userEmail;
        String pass = userPassword;

        // create table querry
//        CREATE TABLE teacher (
//                name VARCHAR ( 50 ) UNIQUE NOT NULL,
//                password VARCHAR ( 50 ) NOT NULL,
//                email VARCHAR ( 255 ) UNIQUE NOT NULL
//        );


        // query
        String query = "INSERT INTO teacher(name, email, password) VALUES(?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, pass);
            pst.executeUpdate();
            System.out.println("Sucessfully created.");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }
}
