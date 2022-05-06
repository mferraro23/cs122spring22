package projects.project1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUILinkedList extends Application {
    String textInput;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Color background = Color.rgb(1,46,64);
        Color buttonBackground = Color.rgb(242,227,213);
        Color labelText = Color.rgb(60, 166, 166);
        Color labelBackground = Color.rgb(2,73,89);
        Label label1 = new Label("Value:");
        label1.setBackground(Background.fill(labelBackground));
        label1.setTextFill(labelText);
        label1.setTranslateX(0);
        label1.setTranslateY(10);
        TextField textField = new TextField ();
        textField.setTranslateX(35);
        textField.setTranslateY(10);
        Button button = new Button("Add");
        button.setBackground(Background.fill(buttonBackground));
        button.setTranslateX(25);
        button.setTranslateY(45);
        button.setOnAction(actionEvent -> {
            textInput = textField.getText();
            System.out.println(textInput);
        });

        Button button1 = new Button("Delete");
        button1.setTranslateX(75);
        button1.setTranslateY(45);
        button1.setBackground(Background.fill(buttonBackground));
        Button button2 = new Button("Clear");
        button2.setTranslateX(135);
        button2.setTranslateY(45);
        button2.setBackground(Background.fill(buttonBackground));
        Group controls = new Group(button, button1, button2, label1, textField);
        controls.setTranslateX(150);
        controls.setTranslateY(50);
        Group root = new Group(controls);
        Scene scene = new Scene(root, 750, 500, background);

        primaryStage.setTitle("Linked List GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
