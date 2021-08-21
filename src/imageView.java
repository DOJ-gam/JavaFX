 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class imageView extends Application {
	
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		BorderPane pane = new BorderPane();
	
		Image pic = new Image("images/covid-app-footer.png");
		ImageView ivPic = new ImageView(pic);
		ivPic.setFitHeight(600);
		ivPic.setFitWidth(1300);
		pane.setCenter(ivPic);
		
		Scene scene = new Scene(pane, 1300, 700);
		primaryStage.setTitle("Image Viewer"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
} 




