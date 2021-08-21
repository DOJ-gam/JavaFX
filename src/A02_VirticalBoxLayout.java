import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class A02_VirticalBoxLayout extends Application {

	public static void main(String[] args) {

		launch(args);
		
	}

	@Override
	public void start(Stage primStage) throws Exception {

		Button btn = new Button("Click me!");
		
		btn.setOnAction(event -> {
			
			System.out.println("Hello World!");
		});	
		
		Button exit = new Button("Exit");
		exit.setOnAction( event -> {
			
			System.out.println("Application exited successfully!");
			System.exit(0);
		});
		
		
		
		VBox root = new VBox();
		root.getChildren().addAll(btn, exit);
		
		Scene scene = new Scene(root, 300, 400);
		primStage.setScene(scene);
		primStage.show();
	}
}
