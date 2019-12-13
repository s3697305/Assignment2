/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2019C
  Assessment: Assignment 2
  Author: Nguyen Quoc Hoang
  ID: s3697305
  Created  date: 11/12/2019
  Last modified: 15/12/2019
  Acknowledgement:
*/

package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

            Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));


        //ImageView img = new ImageView("file:src/players/tiendung.jpg");
//        Pane pane = new Pane();
//        pane.getChildren().add(img);
//        Scene scene = new Scene(pane);
//        primaryStage.setScene(scene);

//        String path = "/Users/doroke/RMIT Drive/Object Oriented Programming/Projects/Assignment2/src/sfx/test.mp3";
//        Media sfx = new Media(new File(path).toURI().toString());
//        Media sfxx = new Media("https://data19.chiasenhac.com/downloads/2044/4/2043801-8a189b71/128/Em%20Oi%20Len%20Pho%20-%20Minh%20Vuong%20M4U.mp3");
//        MediaPlayer sfx1 = new MediaPlayer(sfxx);

//        String path = new File("file:src/sfx/test.mp3").getAbsolutePath();
//        Media media = new Media(new File(path).toURI().toString());
//
//        System.out.println(media.getMetadata());
//
//        MediaPlayer mp = new MediaPlayer(media);
//
//        mp.setAutoPlay(true);



        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root, 1000, 700);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        //scene.getStylesheets().add("file:src/game/style.css");

        primaryStage.setResizable(false);
        primaryStage.show();
}


    public static void main(String[] args) {
        launch(args);
    }
}
