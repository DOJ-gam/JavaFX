import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class A03_firstFXML extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primStage) throws Exception {

//		To add FXML (note that, the anchor pane we have in the fxml(Scene Builder) is the root of our project )
		Parent root = FXMLLoader.load(getClass().getResource("A03_myFirstFXML.fxml"));
		
		
		 Scene scene = new Scene(root);
		 primStage.setScene(scene);
		 primStage.show();

	}

}
