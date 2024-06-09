package com.example;

import javafx.application.Application;
import javafx.css.PseudoClass;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = new HBox();
        Scene scene = new Scene(root, 700, 700);
        root.setPadding(new Insets(10,10,10,10));
        root.setSpacing(20);

        VBox vBox1 = new VBox();
        String style = "-fx-border-color: #000000; -fx-border-width: 1.5px";
        vBox1.setStyle(style);
        vBox1.setPrefSize(250, 100);
        vBox1.setSpacing(20);
        vBox1.setPadding(new Insets(10,10,10,10));

        Pane pn = new Pane();
        pn.setPrefSize(20, 150);




        vBox1.getChildren().add(CreateLbl("Button:"));
        vBox1.getChildren().add(CreateLbl("CheckBox:"));
        vBox1.getChildren().add(CreateLbl("Hyperlink:"));
        vBox1.getChildren().add(CreateLbl("ToggleButton:"));
        vBox1.getChildren().add(CreateLbl("RadioButton:"));
        vBox1.getChildren().add(CreateLbl("Label:"));
        vBox1.getChildren().add(CreateLbl("TextField:"));
        vBox1.getChildren().add(CreateLbl("PasswordField:"));

        vBox1.getChildren().add(CreateLbl("TextArea:"));
        vBox1.getChildren().add(pn);
        vBox1.getChildren().add(CreateLbl("Progressindicator:"));
        vBox1.getChildren().add(CreateLbl("progressBar:"));
        vBox1.getChildren().add(CreateLbl("Slider:"));
        

        Button button = new Button("Button");
        button.setPrefSize(70, 20);

        CheckBox checkBox = new CheckBox("CheckBox");

        Hyperlink hyperlink = new Hyperlink("Hyperlink");

        ToggleButton toggleButton = new ToggleButton("ToggleButton");

        RadioButton radioButton = new RadioButton("RadioButton");

        TextField textField = new TextField();

        PasswordField passwordField = new PasswordField();

        TextArea textArea = new TextArea();

        ProgressIndicator progressIndicator = new ProgressIndicator();

        ProgressBar progressBar = new ProgressBar();
        
        Slider slider = new Slider(); 
        




        VBox vBox2 = new VBox();
        vBox2.setPrefSize(300, 100);
        vBox2.setPadding(new Insets(10,10,10,10));
        vBox2.setSpacing(20);
        vBox2.getChildren().add(button);
        vBox2.getChildren().add(checkBox);
        vBox2.getChildren().add(hyperlink);
        vBox2.getChildren().add(toggleButton);
        vBox2.getChildren().add(radioButton);
        vBox2.getChildren().add(CreateLbl("Label"));
        vBox2.getChildren().add(textField);
        vBox2.getChildren().add(passwordField);
        vBox2.getChildren().add(textArea);
        vBox2.getChildren().add(progressIndicator);
        vBox2.getChildren().add(progressBar);
        vBox2.getChildren().add(slider);







        root.getChildren().add(vBox1);
        root.getChildren().add(vBox2);


        primaryStage.setTitle("allControls.fxml");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    Label CreateLbl (String texto){
        Label lbltexto = new Label(texto);
        lbltexto.setFont(Font.font("Time New Roman", 15));
        String style = "-fx-font-weigth: bold; -fx-font-style: italic";
        lbltexto.setStyle(style);

        return lbltexto;

    }



}