package projects.project1;

import assignments.assignment6.LinkedStack.LinkedStack;
import assignments.assignment6.LinkedStack.Node;
import assignments.assignment6.LinkedStack.StackADT;
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

public class GUILinkedList extends Application implements projects.project1.StackADT {
    String textInput;
    private Node top;
    public GUILinkedList(){
        top = new Node();
    }

    public static void main(String[] args) {
        StackADT stack = new LinkedStack();
        launch(args);
    }
    @Override
    public void push(Object val) {
        Node newNode = new Node(val);
        if (isEmpty()){
            newNode.setNext(null);
        }
        else{
            newNode.setNext(top);
            top = newNode;
        }
    }

    @Override
    public Object pop() {
        if (!isEmpty()){
            Object node = top.getElement();
            top = top.getNext();
            return node;
        }
        else{
            return 0;
        }
    }
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    @Override
    public boolean isFull() {
        return false;
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
        Label label2 = new Label("");
        label2.setTranslateX(200);
        label2.setTranslateY(400);
        button.setOnAction(actionEvent -> {
            textInput = textField.getText();
            push(textInput);
            label2.textField.setText();
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
        Group root = new Group(controls, label2);
        Scene scene = new Scene(root, 750, 500, background);

        primaryStage.setTitle("Linked List GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
