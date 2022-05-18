package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TeacherContoller {

    @FXML
    private Button loginTeacher;

    @FXML
    private PasswordField password;

    @FXML
    private TextField useername;
    @FXML
    private Label wronglogin;
    @FXML
    private Label emptyinfo;

    @FXML
    void loginbutton(ActionEvent event) throws Exception {
        //irfan part
        System.out.println(useername.getText());
        System.out.println(password.getText());
        JavaPostgreSql.writeToDatabase(useername.getText(),useername.getText(),password.getText());
        if (useername.getText().equals("Nick") && password.getText().equals("1234cvb")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
      else  if (useername.getText().equals("Eric") && password.getText().equals("576324678df")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
       else if (useername.getText().equals("Mark") && password.getText().equals("7645896458gfd")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
     else   if (useername.getText().equals("Mary") && password.getText().equals("asc678543hfds")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
       else if (useername.getText().equals("Lewis") && password.getText().equals("gfhyasklgd ")) {
            wronglogin.setText("login success");
            Stage primaryStage;
            primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHome.fxml"));
            primaryStage.setTitle("Home");
            primaryStage.setScene(new Scene(root, 660, 700));
            primaryStage.show();
        }
        else if (useername.getText().equals("") && password.getText().equals("")) {
            emptyinfo.setText("Please Enter Username & password");
        }

        else {
            wronglogin.setText("login failed !");
        }
    }
}
