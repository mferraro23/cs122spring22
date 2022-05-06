package projects.project1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUILinkedList extends Application {
    String text;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Color background = Color.rgb(1,46,64);
        Label label1 = new Label("Value:");
        label1.setTranslateX(10);
        label1.setTranslateY(10);
        TextField textField = new TextField ();
        textField.setTranslateX(30);
        textField.setTranslateY(10);
        Button button = new Button("Add");
        button.setTranslateX(25);
        button.setTranslateY(45);
        button.setOnAction(actionEvent -> {
            text = textField.getText();
            System.out.println(text);
        });

        Button button1 = new Button("Delete");
        button1.setTranslateX(75);
        button1.setTranslateY(45);
        Button button2 = new Button("Clear");
        button2.setTranslateX(135);
        button2.setTranslateY(45);
        Group root = new Group(button, button1, button2, label1, textField);
        Scene scene = new Scene(root, 750, 500, background);

        primaryStage.setTitle("Linked List GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
