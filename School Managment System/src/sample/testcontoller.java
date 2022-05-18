package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class testcontoller {

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

        @FXML
        void loginBtn(ActionEvent event) throws Exception{
                if(username.getText().equals("Jack")&&passwords.getText().equals("qwert87456")) {
                                        wronglogin.setText("login success");
                                        Stage primaryStage;
                                        primaryStage = new Stage();
                                        Parent root = FXMLLoader.load(getClass().getResource("StudentHome.fxml"));
                                        primaryStage.setTitle("Home");
                                        primaryStage.setScene(new Scene(root, 900, 700));
                                        primaryStage.show();
                                }
                    else if(username.getText().equals("Oliver")&&passwords.getText().equals("ghudfvhjdfv")) {
                        wronglogin.setText("login success");
                        Stage primaryStage;
                        primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("StudentHome.fxml"));
                        primaryStage.setTitle("Home");
                        primaryStage.setScene(new Scene(root, 900, 700));
                        primaryStage.show();
                }
                else if(username.getText().equals("Harry")&&passwords.getText().equals("67345345")) {
                        wronglogin.setText("login success");
                        Stage primaryStage;
                        primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("StudentHome.fxml"));
                        primaryStage.setTitle("Home");
                        primaryStage.setScene(new Scene(root, 900, 700));
                        primaryStage.show();
                }
                else if(username.getText().equals("Arun")&&passwords.getText().equals("njkfbg")) {
                        wronglogin.setText("login success");
                        Stage primaryStage;
                        primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("StudentHome.fxml"));
                        primaryStage.setTitle("Home");
                        primaryStage.setScene(new Scene(root, 900, 700));
                        primaryStage.show();
                }
                else if(username.getText().equals("Ava")&&passwords.getText().equals("yrteb")) {
                        wronglogin.setText("login success");
                        Stage primaryStage;
                        primaryStage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("StudentHome.fxml"));
                        primaryStage.setTitle("Home");
                        primaryStage.setScene(new Scene(root, 900, 700));
                        primaryStage.show();
                }
                else if(username.getText().equals("Tony")&&passwords.getText().equals("gfdehb")) {
                    wronglogin.setText("login success");
                    Stage primaryStage;
                    primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("StudentHome.fxml"));
                    primaryStage.setTitle("Home");
                    primaryStage.setScene(new Scene(root, 900, 700));
                    primaryStage.show();
                }


                else if (username.getText().equals("") && passwords.getText().equals("")) {
                    emptyinfo.setText("Please Enter Username & password");
                }


                else {
                        wronglogin.setText("login failed !");
                }

        }

}