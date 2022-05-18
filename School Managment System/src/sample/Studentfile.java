package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.System.out;

public class Studentfile {
    @FXML
    private Button login;

    @FXML
    private TextField passwords;

    @FXML
    private TextField username;

    @FXML
    private Label wronglogin;
    @FXML
    private Label emptyinfo;

    public Studentfile(String userName, String pass) {
    }

    public void login(ActionEvent actionEvent) {
        String usernames = username.getText();
        String password = passwords.getText();

        ArrayList<Admin> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("sample/Student file.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) {
                String parts[] = line.split(",");
                
                String userName = parts[0];
                String pass = parts[1];
                list.add(new Admin(userName,pass));




            }
            reader.close();
            boolean successLogin = false;
            for (Admin ad : list) {
                if (ad.usernames.equals(username) && ad.password.equals(passwords)){

                    successLogin = true;
                }
            }
            if (successLogin) {
                {
                    wronglogin.setText("login success");
                    Stage primaryStage;
                    primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("StudentHome.fxml"));
                    primaryStage.setTitle("Student home");
                    primaryStage.setScene(new Scene(root, 900, 700));
                    primaryStage.show();
                }
            }

            else if (username.getText().equals("") && passwords.getText().equals("")) {
                emptyinfo.setText("Please Enter Username & password");
            }
            else {
                out.println("Login failed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
