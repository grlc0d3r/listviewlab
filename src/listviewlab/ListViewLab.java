/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listviewlab;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Karyn
 */
public class ListViewLab extends Application 
{
    Stage stage;
    Button button;
    ListView<String> listView;
    TextField outputPerson;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        stage = primaryStage;
        stage.setTitle("ListView");
        button = new Button("Submit");
        
        listView = new ListView<>();
        listView.getItems().addAll("Harry Dresden", "Karrin Murphy", "Waldo Butters");
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
        outputPerson = new TextField(); 
        button.setOnAction(e -> buttonClicked());
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets (20, 20, 20, 20));
        layout.getChildren().addAll(listView, button, outputPerson);
        
        Scene scene = new Scene(layout, 250, 600);
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    private void buttonClicked() 
    {
        String person = listView.getSelectionModel().getSelectedItem();
        outputPerson.setText(person);
    }
    
}
