import javafx.application.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.geometry.*; 
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.text.*;


public class Exercise14_12 
		extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		
		
		int standardWidth = 75;
		int baseHeight = 25;
		
	
		
		//20%, red H:50, W:75
		Rectangle projects = new Rectangle(10, 140, standardWidth, baseHeight * 2);
		projects.setFill(Color.RED);
		pane.getChildren().add(projects);
		pane.getChildren().add(new Text(5, 130, "Project -- 20%"));
			
		
		//10%, blue H:25, W:75
		Rectangle quizzes = new Rectangle(95, 165, standardWidth, baseHeight);
		quizzes.setFill(Color.BLUE);
		pane.getChildren().add(quizzes);
		pane.getChildren().add(new Text(95, 155, "Quiz -- 10%"));
		
		
		//30%, green H:75, W:75
		Rectangle midterms = new Rectangle(185, 115, standardWidth, baseHeight * 3);
		midterms.setFill(Color.GREEN);
		pane.getChildren().add(midterms);
		pane.getChildren().add(new Text(180, 105, "Midterm -- 30%"));
		
		//40%, orange H:100, W:75
		Rectangle finals = new Rectangle(290, 90, standardWidth, baseHeight * 4);
		pane.getChildren().add(finals);
		finals.setFill(Color.ORANGE);
		pane.getChildren().add(new Text(290, 80, "Final -- 40%"));
		
		
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("Exercise 14.12"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);	
	}
	

}
