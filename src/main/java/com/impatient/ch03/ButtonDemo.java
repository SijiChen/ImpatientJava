package com.impatient.ch03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by sjchen on 8/9/16.
 */
public class ButtonDemo extends Application {
    public void start(Stage stage) {

        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(new CancelAction());
        Button okButton = new Button("OK");
        okButton.setOnAction(event -> System.out.println("Oh yes!"));

        Label message = new Label("Hello, JavaFX!");
        message.setFont(new Font(100));
        VBox root = new VBox();
        root.getChildren().addAll(cancelButton, okButton, message);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

class CancelAction implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
        System.out.println("Oh noes!");
    }
}