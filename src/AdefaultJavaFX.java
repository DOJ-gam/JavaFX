 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AdefaultJavaFX extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
	
		StackPane root = new StackPane();
		
		
		Button btn = new Button();
		btn.setText("Say 'Hello World' ");
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root, 400, 150);
		primaryStage.setTitle("Hello World"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		System.out.println("launch application");
		Application.launch(args);
	}
}