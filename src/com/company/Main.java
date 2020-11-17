package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Calculator
        /*Parent root = FXMLLoader.load(getClass().getResource("Resources/Calculator.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();*/

        //Hello World
        Text text = new Text("Hello from JavaFX!");
        text.setLayoutY(80); // установка положения надписи по оси Y
        text.setLayoutX(100); // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setTitle("First Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(250);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
