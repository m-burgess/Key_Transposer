package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML
    private Button submitButton;
    @FXML
    private TextField originalKeyTextfield;
    @FXML
    private Label transposedKeyPlus1Label;
    @FXML
    private Label transposedKeyPlus2Label;
    @FXML
    private Label transposedKeyPlus3Label;
    @FXML
    private Label transposedKeyMinus1Label;
    @FXML
    private Label transposedKeyMinus2Label;
    @FXML
    private Label transposedKeyMinus3Label;

    public void convertKey() {

        String key = originalKeyTextfield.getText();

        if(key.toUpperCase().contains("A")) {
            transposedKeyPlus1Label.setText("A#/Bb");
            transposedKeyPlus2Label.setText("B");
            transposedKeyPlus3Label.setText("C");
            transposedKeyMinus1Label.setText("G#/Ab");
            transposedKeyMinus2Label.setText("G");
            transposedKeyMinus3Label.setText("F#/Gb");
        }
        if(key.toUpperCase().contains("A#")) {
            transposedKeyPlus1Label.setText("B");
            transposedKeyPlus2Label.setText("C");
            transposedKeyPlus3Label.setText("C#/Db");
            transposedKeyMinus1Label.setText("A");
            transposedKeyMinus2Label.setText("G#/Ab");
            transposedKeyMinus3Label.setText("G");
        }

        if(key.toUpperCase().contains("B")) {
            transposedKeyPlus1Label.setText("C");
            transposedKeyPlus2Label.setText("C#/Db");
            transposedKeyPlus3Label.setText("D");
            transposedKeyMinus1Label.setText("A#/Bb");
            transposedKeyMinus2Label.setText("A");
            transposedKeyMinus3Label.setText("G#/Ab");
        }

        if(key.toUpperCase().contains("C")) {
            transposedKeyPlus1Label.setText("C#/Db");
            transposedKeyPlus2Label.setText("D");
            transposedKeyPlus3Label.setText("E");
            transposedKeyMinus1Label.setText("B");
            transposedKeyMinus2Label.setText("A#/Bb");
            transposedKeyMinus3Label.setText("A");
        }

        if(key.toUpperCase().contains("C#")) {
            transposedKeyPlus1Label.setText("D");
            transposedKeyPlus2Label.setText("D#/Eb");
            transposedKeyPlus3Label.setText("E");
            transposedKeyMinus1Label.setText("C");
            transposedKeyMinus2Label.setText("B");
            transposedKeyMinus3Label.setText("A#/Bb");
        }

        if(key.toUpperCase().contains("D")) {
            transposedKeyPlus1Label.setText("D#/Eb");
            transposedKeyPlus2Label.setText("E");
            transposedKeyPlus3Label.setText("F");
            transposedKeyMinus1Label.setText("C#/Db");
            transposedKeyMinus2Label.setText("C");
            transposedKeyMinus3Label.setText("B");
        }

        if(key.toUpperCase().contains("D#")) {
            transposedKeyPlus1Label.setText("E");
            transposedKeyPlus2Label.setText("F");
            transposedKeyPlus3Label.setText("F#/Gb");
            transposedKeyMinus1Label.setText("D");
            transposedKeyMinus2Label.setText("C#/Db");
            transposedKeyMinus3Label.setText("C");
        }

        if(key.toUpperCase().contains("E")) {
            transposedKeyPlus1Label.setText("F");
            transposedKeyPlus2Label.setText("F#/Gb");
            transposedKeyPlus3Label.setText("G");
            transposedKeyMinus1Label.setText("D#/Eb");
            transposedKeyMinus2Label.setText("D");
            transposedKeyMinus3Label.setText("C#/Db");
        }

        if(key.toUpperCase().contains("F")) {
            transposedKeyPlus1Label.setText("F#/Gb");
            transposedKeyPlus2Label.setText("G");
            transposedKeyPlus3Label.setText("G#/Ab");
            transposedKeyMinus1Label.setText("E");
            transposedKeyMinus2Label.setText("D#/Eb");
            transposedKeyMinus3Label.setText("D");
        }

        if(key.toUpperCase().contains("F#")) {
            transposedKeyPlus1Label.setText("G");
            transposedKeyPlus2Label.setText("G#/Ab");
            transposedKeyPlus3Label.setText("A");
            transposedKeyMinus1Label.setText("F");
            transposedKeyMinus2Label.setText("E");
            transposedKeyMinus3Label.setText("D#/Eb");
        }

        if(key.toUpperCase().contains("G")) {
            transposedKeyPlus1Label.setText("G#/Ab");
            transposedKeyPlus2Label.setText("A");
            transposedKeyPlus3Label.setText("A#/Bb");
            transposedKeyMinus1Label.setText("F#/Gb");
            transposedKeyMinus2Label.setText("F");
            transposedKeyMinus3Label.setText("E");
        }

        if(key.toUpperCase().contains("G#")) {
            transposedKeyPlus1Label.setText("A");
            transposedKeyPlus2Label.setText("A#/Bb");
            transposedKeyPlus3Label.setText("B");
            transposedKeyMinus1Label.setText("G");
            transposedKeyMinus2Label.setText("F#/Gb");
            transposedKeyMinus3Label.setText("F");
        }
    }

}
