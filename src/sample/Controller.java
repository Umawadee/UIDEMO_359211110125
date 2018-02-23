package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private loginModel loginModel = new loginModel();

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton btilogin;

    @FXML
    private Label loginStatus;

    @FXML
    private Label dbStatus;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.loginModel.isDatabaseConnection()){
            this.dbStatus.setText("Connected to Database");
        }else {
            this.dbStatus.setText("Not Connected to Database");
        }

        this.combobox.setItems(FXCollections.observableArrayList(option.values()));
    }
    @FXML
    public void Login(ActionEvent event){

        System.out.println(this.username.getText());
        System.out.println(this.password.getText());
        System.out.println(this.combobox.getValue().toString());
        try {
            if
                    (this.loginModel.isLogin(this.username.getText(),this.password.getText(),
                    this.combobox.getValue().toString())){
                Stage stage = (Stage) this.btnLogin.getScene().getWindow();
                stage.close();
                switch (this.combobox.getValue().toString()){
                    case "Admin": adminLogin(); break;
                    case "Student": studentLogin(); break;
                }
            }else{
                this.loginStatus.setText("Wrong Credential");
            }
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }
    public void adminController(){
        try {
            Stage userStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane)
                    loader.load(getClass().getResource("/admin/adminDashboard.fxml").openStream
                            ());
             adminController adminController.
                    loader.getController();
            Scene scene = new Scene(root);
            userStage.setScene(scene);
            userStage.setTitle("Student Dashboard");
            userStage.setResizable(false);
            userStage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void adminLogin(){
        try {
            Stage adminStage = new Stage();
            FXMLLoader adminLoader = new FXMLLoader();
        }
    }