package com.example.calculatorgpa;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends HelloApplication implements Initializable{
    //defines the fxid of all the class input rows
    @FXML
    private TextField c1;
    @FXML
    private TextField c2;
    @FXML
    private TextField c3;
    @FXML
    private TextField c4;
    @FXML
    private TextField c5;
    @FXML
    private TextField c6;
    @FXML
    private TextField c7;
    @FXML
    private TextField c8;
    //defines the fxid of the gpa display text component
    @FXML
    private Text gparesult;
    //creates a list to initialize the dropdowns options
    private ObservableList<String> options =  FXCollections.observableArrayList("1","2","3","4","5","6","7","8");
    //defines fxid of the combobox used for the dropdown
    @FXML
    private ComboBox<String> dropdown;

//calculates and displays the gpa found from the users input
    public void calcGpa() {
       //creates variables to track the total and other math operations
        double total = 0;
        double result;
        int placeholder;
        //adds the corosponding value for each letter grade to total
        if (c1.getText().equals("a") || c1.getText().equals("A")) {
            total += 4;
        }
        if (c1.getText().equals("b") || c1.getText().equals("B")) {
            total += 3;
        }
        if (c1.getText().equals("c") || c1.getText().equals("C")) {
            total += 2;
        }
        if (c1.getText().equals("d") || c1.getText().equals("D")) {
            total += 1;
        }

        if (c2.getText().equals("a") || c2.getText().equals("A")) {
            total += 4;
        }
        if (c2.getText().equals("b") || c2.getText().equals("B")) {
            total += 3;
        }
        if (c2.getText().equals("c") || c2.getText().equals("C")) {
            total += 2;
        }
        if (c2.getText().equals("d") || c2.getText().equals("D")) {
            total += 1;
        }

        if (c3.getText().equals("a") || c3.getText().equals("A")) {
            total += 4;
        }
        if (c3.getText().equals("b") || c3.getText().equals("B")) {
            total += 3;
        }
        if (c3.getText().equals("c") || c3.getText().equals("C")) {
            total += 2;
        }
        if (c3.getText().equals("d") || c3.getText().equals("D")) {
            total += 1;
        }

        if (c4.getText().equals("a") || c4.getText().equals("A")) {
            total += 4;
        }
        if (c4.getText().equals("b") || c4.getText().equals("B")) {
            total += 3;
        }
        if (c4.getText().equals("c") || c4.getText().equals("C")) {
            total += 2;
        }
        if (c4.getText().equals("d") || c4.getText().equals("D")) {
            total += 1;
        }

        if (c5.getText().equals("a") || c5.getText().equals("A")) {
            total += 4;
        }
        if (c5.getText().equals("b") || c5.getText().equals("B")) {
            total += 3;
        }
        if (c5.getText().equals("c") || c5.getText().equals("C")) {
            total += 2;
        }
        if (c5.getText().equals("d") || c5.getText().equals("D")) {
            total += 1;
        }

        if (c6.getText().equals("a") || c6.getText().equals("A")) {
            total += 4;
        }
        if (c6.getText().equals("b") || c6.getText().equals("B")) {
            total += 3;
        }
        if (c6.getText().equals("c") || c6.getText().equals("C")) {
            total += 2;
        }
        if (c6.getText().equals("d") || c6.getText().equals("D")) {
            total += 1;
        }

        if (c7.getText().equals("a") || c7.getText().equals("A")) {
            total += 4;
        }
        if (c7.getText().equals("b") || c7.getText().equals("B")) {
            total += 3;
        }
        if (c7.getText().equals("c") || c7.getText().equals("C")) {
            total += 2;
        }
        if (c7.getText().equals("d") || c7.getText().equals("D")) {
            total += 1;
        }

        if (c8.getText().equals("a") || c8.getText().equals("A")) {
            total += 4;
        }
        if (c8.getText().equals("b") || c8.getText().equals("B")) {
            total += 3;
        }
        if (c8.getText().equals("c") || c8.getText().equals("C")) {
            total += 2;
        }
        if (c8.getText().equals("d") || c8.getText().equals("D")) {
            total += 1;
        }
        //calculates gpa based on value of total and how many classes inputted rounding to 3 decimals
        placeholder =(int) ((total/(dropdown.getSelectionModel().getSelectedIndex()+1))*1000);
        result = (double)placeholder/1000.0;
        //sets the text of the result to the value found
        gparesult.setText(String.valueOf(result));
    }
//changes what rows are visible based on user input
    @FXML
    private void setNumClasses(ActionEvent e){
        if(dropdown.getSelectionModel().getSelectedIndex() == 0){
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
        }
        if(dropdown.getSelectionModel().getSelectedIndex() == 1){
            c2.setVisible(true);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
        }
        if(dropdown.getSelectionModel().getSelectedIndex() == 2){
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
        }
        if(dropdown.getSelectionModel().getSelectedIndex() == 3){
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
        }
        if(dropdown.getSelectionModel().getSelectedIndex() == 4){
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true);
            c5.setVisible(true);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
        }
        if(dropdown.getSelectionModel().getSelectedIndex() == 5){
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true);
            c5.setVisible(true);
            c6.setVisible(true);
            c7.setVisible(false);
            c8.setVisible(false);
        }
        if(dropdown.getSelectionModel().getSelectedIndex() == 6){
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true);
            c5.setVisible(true);
            c6.setVisible(true);
            c7.setVisible(true);
            c8.setVisible(false);
        }
        if(dropdown.getSelectionModel().getSelectedIndex() == 7){
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true);
            c5.setVisible(true);
            c6.setVisible(true);
            c7.setVisible(true);
            c8.setVisible(true);
        }
        // clears out the text box and resets them
        c1.setText("");
        c2.setText("");
        c3.setText("");
        c4.setText("");
        c5.setText("");
        c6.setText("");
        c7.setText("");
        c8.setText("");
    }

//initializes the dropdown and sets it to the first value
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dropdown.setItems(options);
        dropdown.getSelectionModel().select(0);
    }

}