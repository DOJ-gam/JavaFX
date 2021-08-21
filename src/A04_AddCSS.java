import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class A04_AddCSS extends Application{
	
	

	public static void main(String[] args) {

		launch(args);
	}
	
	

	@Override
	public void start(Stage primStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("A04_AddCSS.fxml"));
		
		Scene scene = new Scene(root);
		
//		Add CSS to JavaFX
		scene.getStylesheets().add( getClass().getResource("A04_AddCSScss.css").toExternalForm() );
		
		
		primStage.setScene(scene);
		primStage.show();
		
//		Search for JavaFX CSS reference
	}

}
