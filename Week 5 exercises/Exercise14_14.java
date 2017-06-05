import javafx.application.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.geometry.*; 
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.*;

public class Exercise14_14 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		//Change values to change cube's size
		double W = 400; //Window's width
		double H = 700; //Window's height
		
		
		//Width is 100, Height is 50
		double W1 = W / 2.5;
		double H1 = H / 3;
		
		Rectangle r1 = new Rectangle(20, 20, W1, H1);
		r1.setStroke(Color.BLACK);
		r1.setFill(null);
		pane.getChildren().add(r1); 
		
		//Width is same as above, as is height
		double W2 = W1;
		double H2 = H1;
		
		Rectangle r2 = new Rectangle(40, 40 ,W2, H2);
		r2.setStroke(Color.BLACK);
		r2.setFill(null);
		pane.getChildren().add(r2);
		
		Line tl = new Line(20, 20, 40, 40);
		pane.getChildren().add(tl);
		
		Line tr = new Line(W2 + 20, 20, W2 + 40, 40);
		pane.getChildren().add(tr);
		
		Line bl = new Line(20, H2 + 20, 40, H2 + 40);
		pane.getChildren().add(bl);
		
		Line br = new Line(W2 + 20, H2 + 20, W2 + 40, H2 + 40);
		pane.getChildren().add(br);
		
		Scene scene = new Scene(pane, W, H);
		primaryStage.setTitle("Exercise 14.14"); 
		primaryStage.setScene(scene); 
		primaryStage.show();		
		
	}
	
	
	
	public static void main(String[] args) { 
	Application.launch(args);
	}
}
