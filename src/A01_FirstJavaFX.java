
// 1. first import application, then extend it.
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


//In javaFx language, the entire window is called the 'stage'
//The content inside the window is what is known as the scene
//In the scene is where we will e putting the stuff like buttons, widgets, labels, etc
// But nothing will display on the screen yet until we add a layout
// A layout is is how you want everything arranged on your screen

public class A01_FirstJavaFX  extends Application{
	

	public static void main(String[] args) {
		launch(args);
	}
	

	// 2. Create the start method, then show
	@Override
	public void start(Stage primStage) throws Exception {

		Button btn = new Button("Click me!");
		
//		btn.setOnAction(event -> {
//			
//			System.out.println("Hello World!");
//		});
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {

				System.out.println("Hello World again!");
			}
		});
		
//		3. Create a layout:
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
//		4. Create a Scene (Also can set the size of the Scene)
		Scene scene = new Scene(root, 300, 400);
		
//		5.Pass the Scene object to the primary stage
		primStage.setScene(scene);
		
		primStage.show();
	}

}
