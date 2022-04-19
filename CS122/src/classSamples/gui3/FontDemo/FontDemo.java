package classSamples.gui3.FontDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//************************************************************************
//  FontDemo.java       Author: Lewis/Loftus
//
//  Demonstrates the creation and use of fonts.
//************************************************************************

public class FontDemo extends Application {
	// --------------------------------------------------------------------
	// Displays three Text objects using various font styles.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Font font1 = new Font("Courier", 36);
		Font font2 = Font.font("Times", FontWeight.BOLD, FontPosture.ITALIC, 28);
		Font font3 = Font.font("Arial", FontPosture.ITALIC, 14);
		Font font4 = Font.font("Lucida", FontWeight.NORMAL, FontPosture.ITALIC, 20);



		Text text1 = new Text(30, 55, "Dream Big");
		text1.setFont(font1);
		text1.setUnderline(true);

		Text text2 = new Text(150, 110, "Know thyself!");
		text2.setFont(font2);
		text2.setFill(Color.GREEN);

		Text text3 = new Text(50, 150,
				"In theory, there is no difference " + "between theory\nand practice, but in practice there is.");
		text3.setFont(font3);

		/*
		Text text4 = new Text(275, 55, "New Font!");
		text4.setFont(font4);
		*/
		Button changeFont = new Button("Change Font");
		changeFont.setOnAction((event)->{
			text1.setFont(font4);
		});

		changeFont.setLayoutX(275);
		changeFont.setLayoutY(55);



		Group root = new Group(text1, text2, text3, changeFont);
		Scene scene = new Scene(root, 400, 200, Color.LIGHTCYAN);

		primaryStage.setTitle("Font Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}