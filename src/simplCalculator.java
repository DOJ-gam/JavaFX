 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class simplCalculator extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
	
				
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10); //horizontal gap
		grid.setVgap(10); //vertical gap
		grid.setPadding(new Insets(25, 25, 25, 25));
		
//		grid.setGridLinesVisible(true); //for development only
		
		
//		UI Define
		Label la1 = new Label("Num1: ");
		grid.add(la1, 0, 0); //column 0, and row 0		
		TextField txtNum1 = new TextField();
		grid.add(txtNum1, 1, 0); //column 1, row 0
		
		Label la2 = new Label("Num2: ");
		grid.add(la2, 0, 1); //column 0, and row 0		
		TextField txtNum2 = new TextField();
		grid.add(txtNum2, 1, 1); //column 1, row 0
		
		Label laResult = new Label("Sum=");
		grid.add(laResult, 1, 2);
		
		Button btn = new Button();
		btn.setText("Click to Add");
		btn.setId("btnID");
		btn.setOnAction(event->{
			
			int n1 = Integer.parseInt(txtNum1.getText().toString());
			int n2 = Integer.parseInt(txtNum2.getText());
			
			int sum = n1 + n2;
			
//			laResult.setText(String.valueOf(sum));
			laResult.setText("Sum = " + sum);
		});
		grid.add(btn, 2, 3);
		
		
		Scene scene = new Scene(grid, 400, 350);
		
		scene.getStylesheets().add(simplCalculator.class.getResource("calculator.css").toExternalForm());;
		
		primaryStage.setTitle("Hello World"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}