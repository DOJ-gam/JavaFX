import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class A05_ComboBoxMain extends Application{

	
	
	public void start(Stage primaryStage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("A05_ComboBoxFXML.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("A05_ComboBox.css").toExternalForm());
			primaryStage.setScene(scene); 
			primaryStage.show();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	

	public static void main(String[] args) {
		
		Application.launch(args);
	}

}
