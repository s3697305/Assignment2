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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuViewController implements Initializable {

    Player player = new Player();

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    @FXML TextField playerNameTF = new TextField();
    public void setPlayerNameTF() {
        player.setName(playerNameTF.getText());
        //System.out.println("Set" + player.getName());
    }


    public void changeToGameView(ActionEvent event) throws IOException {
        setPlayerNameTF();

        FXMLLoader loader = new FXMLLoader();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        loader.setLocation(getClass().getResource("GameView.fxml"));
        Parent gameViewParent = loader.load();

        GameViewController gameViewController = loader.getController();
        gameViewController.setHelloPlayer(playerNameTF.getText());

        Scene gameViewScene = new Scene(gameViewParent, 1000, 700);
        stage.setScene(gameViewScene);

    }

}
