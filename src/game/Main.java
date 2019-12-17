/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2019C
  Assessment: Assignment 2
  Author: Nguyen Quoc Hoang
  ID: s3697305
  Created  date: 11/12/2019
  Last modified: 16/12/2019
  Acknowledgement: javafx Media Player by Prof. Quang
*/

package game;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Parent root = FXMLLoader.load(getClass().getResource("MenuView.fxml"));
        //Parent game = FXMLLoader.load(getClass().getResource("GameView.fxml"));


        primaryStage.setTitle("Matching cards");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MenuView.fxml"));
        Parent menuViewParent = loader.load();
        Scene menuViewScene = new Scene(menuViewParent, 1000, 700);
        menuViewScene.setFill(Color.BLACK);
        primaryStage.setScene(menuViewScene);

        menuViewScene.getStylesheets().add("file:src/game/style.css");
        primaryStage.getIcons().add(new Image("file:src/img/icon.png"));
        primaryStage.setResizable(false);


        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
