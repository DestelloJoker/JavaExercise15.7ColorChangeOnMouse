/*Program Name: ColorChangeOnMouse.java
 * Authors: Austin P
 * Date last Updated: 9/21/2024
 * Purpose: This program is meant to use javaFX to change the color of the window 
 * based on if the the mouse if pressed, held, or released.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorChangeOnMouse extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle with a radius of 100 then sets the color to white and outlines it in black
        Circle circle = new Circle(100); 
        circle.setFill(Color.WHITE); 
        circle.setStroke(Color.BLACK); 

        // Adds an event when the mouse button is pressed to change it to black
        circle.setOnMousePressed((MouseEvent event) -> {
            circle.setFill(Color.BLACK); 
        });

        // Adds an event when the mouse button is released to revert the color back to white
        circle.setOnMouseReleased((MouseEvent event) -> {
            circle.setFill(Color.WHITE); 
        });

        // Create a new layout and add the circle to it
        StackPane root = new StackPane();
        root.getChildren().add(circle);

        // Creates a scene and places it in the stage(window)
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Circle Color Change with Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
