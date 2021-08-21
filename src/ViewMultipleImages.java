 
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ViewMultipleImages extends Application{
	
	int img; 
//	ImageView ivNext;
	ImageView ivPrev;

	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		
		
		BorderPane pane = new BorderPane();
	
		ArrayList<Image> imgs =  new ArrayList<Image>();
		
		
		
		
		Image pic2 = new Image("images/covid-app-Global.png");
		imgs.add(pic2);
		
		Image pic1 = new Image("images/covid-app-footer.png");
		imgs.add(pic1);
		
		
		
		
		img = 0;
		ImageView ivPic = new ImageView(imgs.get(img));
		ivPic.setFitHeight(600);
		ivPic.setFitWidth(1300);
		pane.setCenter(ivPic);
		
		Button next = new Button();
		next.setText("Next");
		next.setOnAction(event->{
			ImageView ivNext = new ImageView(imgs.get(1));
			ivNext.setFitHeight(600);
			ivNext.setFitWidth(1300);				
		});
		pane.setBottom(next);
		
		
		Button prev = new Button();
		prev.setText("Prev");
		prev.setOnAction(event->{
			
			img = img - 1;
			ivPrev = new ImageView(imgs.get(img));
			ivPrev.setFitHeight(600);
			ivPrev.setFitWidth(1300);			
		});
		pane.setTop(prev);
		
		
		
		Scene scene = new Scene(pane, 1300, 700);
		primaryStage.setTitle("Image Viewer"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
} 