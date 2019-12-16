/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2019C
  Assessment: Assignment 2
  Author: Nguyen Quoc Hoang
  ID: s3697305
  Created  date: 11/12/2019
  Last modified: 15/12/2019
  Acknowledgement: javafx media by Mr. Quang
*/

package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("MenuView.fxml"));

        primaryStage.setTitle("Matching cards");
        Scene scene = new Scene(root, 1000, 700);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        scene.getStylesheets().add("file:src/game/style.css");
        primaryStage.getIcons().add(new Image("file:src/img/icon.png"));
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
