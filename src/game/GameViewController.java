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

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class GameViewController implements Initializable {

    @FXML
    private ImageView img1 = new ImageView("file:src/img/hoangduc.jpg");

    @FXML
    private Button btVolume;

    @FXML
    private Button menu;

    private MediaPlayer mediaPlayer;

    public void initialize(URL location, ResourceBundle resources) {

        playMusic();
        startTimer();
    }



    /* Function SOUND */

    private ImageView soundOn = new ImageView("file:src/img/soundOn.png");
    private ImageView soundOff = new ImageView("file:src/img/soundOff.png");

    public void playMusic() {
        String path = new File("src/sfx/background.mp3").getAbsolutePath();
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(-1);
        mediaPlayer.setVolume(0.5);
        mediaPlayer.setAutoPlay(true);

        soundOn.setFitWidth(25);
        soundOn.setFitHeight(25);
        soundOff.setFitWidth(25);
        soundOff.setFitHeight(25);
        btVolume.setGraphic(soundOn);
    }

    public void setVolume() {
        if (mediaPlayer.getVolume() == 0.5) {
            mediaPlayer.setVolume(0);
            btVolume.setGraphic(soundOff);
        }
        else {
            mediaPlayer.setVolume(0.5);
            btVolume.setGraphic(soundOn);
        }
    }


    /* Function TIME */

    private Timeline timer = new Timeline();
    private static Integer defaultTime = 10;

    @FXML Text timerText;
    @FXML Text timeText;

    private void startTimer() {

        KeyFrame frame = new KeyFrame(Duration.millis(1000), event -> {
            int min = defaultTime / 60;
            int sec = defaultTime % 60;
            defaultTime--;
            String showTime = String.format("%02d", min) + ":" + String.format("%02d", sec);
            timerText.setText(showTime);
            System.out.println(defaultTime);
            if(defaultTime == -2) {
                //defaultTime = 10;
                timer.stop();
                timeText.setText("");
                timerText.setTranslateX(-50);
                timerText.setText("Time's up!!");
            }
        });
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.getKeyFrames().add(frame);
        timer.play();
    }



    public void btMenu (ActionEvent event) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("MenuView.fxml"));
//        Scene scene = new Scene(root, 1000, 700);
//
//        //Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
//
//        Stage primaryStage = new Stage();
//        primaryStage.setScene(scene);
//        primaryStage.setResizable(false);
//        primaryStage.show();
//        startTimer();
//        playMusic();

    }






//    private ImageView cardBack = new ImageView("file:src/img/back.jpg");
//    @FXML
//    private Button btCard = new Button();
//
//    public void btImg() {
//        System.out.println(btCard.getWidth() + " " + btCard.getHeight());
//        cardBack.setFitWidth(95);
//        cardBack.setFitHeight(130);
//        btCard.setGraphic(cardBack);
//
//
//    }



//    public static void pick() {
//        ArrayList<Integer> solution = new ArrayList<>();
//        for (int i = 1; i < 6; i++) {
//            solution.add(i);
//        }
//        for (int i = 0; i < 5; i++) {
//
//
//            Collections.shuffle(solution);
//            System.out.println(solution);
//        }

//    ArrayList<Integer>[][] cards =

    }

