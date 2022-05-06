package projects.project1;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class GUILinkedList extends Application {

    private LinkedList<String> list = new LinkedList<>();

    @Override

    public void start(Stage primaryStage) {

        TextField textField = new TextField();

        Button addButton = new Button("Add");

        Button removeButton = new Button("Remove");

        Button clearButton = new Button("Clear");

        addButton.setOnAction(e -> {

            String value = textField.getText();

            list.add(value);

            textField.clear();

        });

        removeButton.setOnAction(e -> {

            list.remove();

        });

        clearButton.setOnAction(e -> {

            list.clear();

        });

        HBox hBox = new HBox(10);

        hBox.getChildren().addAll(textField, addButton, removeButton, clearButton);

        VBox vBox = new VBox(10);

        vBox.getChildren().addAll(list, hBox);

        Scene scene = new Scene(vBox, 400, 400);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}

class LinkedList<T> extends VBox {

    private Node<T> head;

    private Node<T> tail;

    public LinkedList() {

        super(10);

        this.head = null;

        this.tail = null;

    }

    public void add(T value) {

        Node<T> node = new Node<>(value);

        if (head == null) {

            head = node;

            tail = node;

        } else {

            tail.setNext(node);

            tail = node;

        }

        this.getChildren().add(node);

    }

    public void remove() {

        if (head == null) {

            throw new RuntimeException("List is empty");

        }

        this.getChildren().remove(head);

        head = head.getNext();

        if (head == null) {

            tail = null;

        }

    }

    public void clear() {

        this.getChildren().clear();

        head = null;

        tail = null;

    }

    @Override

    public String toString() {

        if (head == null) {

            return "null";

        }

        return head.toString();

    }

}

class Node<T> extends HBox {

    private T value;

    private Node<T> next;

    public Node(T value) {

        super(10);

        this.value = value;

        this.next = null;

        this.getChildren().add(new Button(value.toString()));

    }

    public T getValue() {

        return value;

    }

    public void setValue(T value) {

        this.value = value;

    }

    public Node<T> getNext() {

        return next;

    }

    public void setNext(Node<T> next) {

        this.next = next;

    }

    @Override

    public String toString() {

        if (next == null) {

            return value + " -> null";

        }

        return value + " -> " + next.toString();

    }

}