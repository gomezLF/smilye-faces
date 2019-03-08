package userInterface;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class SmileyFacesController {

    @FXML
    private Pane gameBoardPane;

    @FXML
    void gameBoardClicked(MouseEvent event) {
    	double x = event.getX();
    	double y = event.getSceneY();
    	
    	Circle c = new Circle();
    	c.setRadius(50);
    	c.setLayoutX(x);
    	c.setLayoutY(y);
    	c.setFill(Color.LIGHTPINK);
    	
    	Circle eye1 = new Circle();
    	eye1.setRadius(8);
    	eye1.setLayoutX(event.getSceneX() + 20);
    	eye1.setLayoutY(event.getSceneY() - 20);
    	eye1.setFill(Color.BLACK);
    	
    	Circle eye2 = new Circle();
    	eye2.setRadius(8);
    	eye2.setLayoutX(event.getSceneX() - 20);
    	eye2.setLayoutY(event.getSceneY() - 20);
    	eye2.setFill(Color.BLACK);
    	
    	Arc arc = new Arc();
    	arc.setRadiusX(30);
    	arc.setRadiusY(30);
    	arc.setLayoutX(event.getX());
    	arc.setLayoutY(event.getY() + 5);
    	arc.setLength(180);
    	arc.setStartAngle(180);
    	arc.setFill(Color.BLACK);
    	
    	Arc mounth = new Arc();
    	mounth.setRadiusX(25);
    	mounth.setRadiusY(20);
    	mounth.setLayoutX(event.getX());
    	mounth.setLayoutY(event.getY() + 10);
    	mounth.setLength(180);
    	mounth.setStartAngle(180);
    	mounth.setFill(Color.RED);
    	
    	Arc hat = new Arc();
    	hat.setRadiusX(20);
    	hat.setRadiusY(20);
    	hat.setLayoutX(event.getX());
    	hat.setLayoutY(event.getY() - 40);
    	hat.setLength(180);
    	hat.setStartAngle(0);
    	hat.setFill(Color.BLACK);
    	
    	gameBoardPane.getChildren().addAll(c, eye1, eye2, arc, mounth, hat);
    }
}
