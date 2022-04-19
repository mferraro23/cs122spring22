package classlab.week11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.util.Random;

public class ColorChangeRectangles extends Application {
    //Create arrays
    public Rectangle[] rectArray = new Rectangle[5];
    public Color[] colors = new Color[3];

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Random random = new Random();
        int upperBound = 100;
        int lowerBound = 10;
        int randW;
        int randH;

        //set values to rects in array
        rectArray[0] = new Rectangle();
        rectArray[1] = new Rectangle();
        rectArray[2] = new Rectangle();
        rectArray[3] = new Rectangle();
        rectArray[4] = new Rectangle();

        rectArray[0].setX(10);
        rectArray[0].setY(10);

        rectArray[1].setX(100);
        rectArray[1].setY(100);

        rectArray[2].setX(200);
        rectArray[2].setY(200);

        rectArray[3].setX(300);
        rectArray[3].setY(300);

        rectArray[4].setX(400);
        rectArray[4].setY(400);

        for (Rectangle rect : rectArray) {
            randW = random.nextInt(lowerBound, upperBound);
            randH = random.nextInt(lowerBound, upperBound);
            rect.setWidth(randW);
            rect.setHeight(randH);
        }

        //set colors to color objects in arrays
        colors[0] = Color.rgb(255,0,0);
        colors[1] = Color.rgb(0,0,255);
        colors[2] = Color.rgb(0,255,0);

        Button btn = new Button("Change Color");
        btn.setLayoutX(250);
        btn.setLayoutY(0);
        btn.setOnAction(this::changeColor);

        Group root = new Group(rectArray[0],rectArray[1],rectArray[2],rectArray[3], rectArray[4], btn);
        Scene scene = new Scene(root,600,600);
        primaryStage.setTitle("Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void changeColor(ActionEvent actionEvent) {
        Random rand = new Random();
        int upperBound = colors.length;
        int rand1;
        for (Rectangle rect : rectArray){
            //Each rectangle color will be dynamically decided
            rand1 = rand.nextInt(upperBound);
            rect.setFill(colors[rand1]);

        }

    }
}
