package classSamples.gui2.ImageDisplay;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//************************************************************************
//  ImageDisplay.java       Author: Lewis/Loftus
//
//  Demonstrates a the use of Image and ImageView objects.
//************************************************************************

public class ImageDisplay extends Application {
	// --------------------------------------------------------------------
	// Displays an image centered in a window.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Image img = new Image("https://cdn.vox-cdn.com/thumbor/_AobZZDt_RVStktVR7mUZpBkovc=/0x0:640x427/1200x800/filters:focal(0x0:640x427)/cdn.vox-cdn.com/assets/1087137/java_logo_640.jpg");
		ImageView imgView = new ImageView(img);

		StackPane pane = new StackPane(imgView);
		pane.setStyle("-fx-background-color: cornsilk");
		//imgView.setViewport(new Rectangle2D(0, 0, 500, 500));

		Scene scene = new Scene(pane, 750, 500);

		primaryStage.setTitle("Image Display");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}