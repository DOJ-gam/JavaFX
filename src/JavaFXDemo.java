 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
	
		StackPane root = new StackPane();
		
		Button btn = new Button();
		btn.setText("Say 'Hello World' ");

//		OnCLick
		
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent arg0) {
//
//				System.out.println("Hello World!");
//			}
//		});
		
//	Using Lambda(Because the event has only one method!)
		btn.setOnAction(event->{
			
			System.out.println("Hello World");
		});
		root.getChildren().add(btn);
		
		
		
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World JavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		System.out.println("launch application");
		Application.launch(args);
	}
}