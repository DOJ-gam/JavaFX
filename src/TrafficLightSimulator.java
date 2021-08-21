
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficLightSimulator extends Application {

	VBox vBox;
	HBox hBox;
	Circle circle1, circle2, circle3, circle4;
	
	
	RadioButton red, yellow, green, blue;
	
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane pane = new BorderPane();

			
		pane.setCenter(getVBox());
		
		
		pane.setBottom(getHBox());
//		hBox.setPadding(new Insets(0, 0, 0, 50));


		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("OmarJeng-21826004==Traffic light simulator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	private VBox getVBox() {
		
		vBox = new VBox(30);
		

		circle1 = new Circle();
		circle1.setCenterX(20);
		circle1.setCenterY(20);
		circle1.setRadius(20);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.WHITE);
		
		circle2 = new Circle();
		circle2.setCenterX(20);
		circle2.setCenterY(20);
		circle2.setRadius(20);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.WHITE);

		
		circle3 = new Circle();
		circle3.setCenterX(20);
		circle3.setCenterY(20);
		circle3.setRadius(20);
		circle3.setStroke(Color.BLACK);
		circle3.setFill(Color.WHITE);

		circle4 = new Circle();
		circle4.setCenterX(20);
		circle4.setCenterY(20);
		circle4.setRadius(20);
		circle4.setStroke(Color.BLACK);
		circle4.setFill(Color.WHITE);
		
		
		vBox.getChildren().addAll(circle1, circle2, circle3, circle4);
		
		vBox.setMaxWidth(60);
		vBox.setMaxHeight(300);
		
		vBox.setStyle("-fx-border-color: black;");

		

		vBox.setAlignment(Pos.CENTER);
		
		return vBox;
	}
	
	private HBox getHBox() {
		
		hBox = new HBox(30);
		
		red = new RadioButton("Red");
		yellow = new RadioButton("Yellow");
		green = new RadioButton("Green");
		blue = new RadioButton("Blue");

		
		hBox.getChildren().addAll(red, yellow, green, blue);
		
		ToggleGroup group = new  ToggleGroup();
		red.setToggleGroup(group);
		yellow.setToggleGroup(group);
		green.setToggleGroup(group);
		blue.setToggleGroup(group);

		red.setOnAction(event ->{
			circle1.setFill(Color.RED);
			circle2.setFill(Color.WHITE);
			circle3.setFill(Color.WHITE);
			circle4.setFill(Color.WHITE);
		});
		
		yellow.setOnAction(event ->{
			circle1.setFill(Color.WHITE);
			circle2.setFill(Color.YELLOW);
			circle3.setFill(Color.WHITE);
			circle4.setFill(Color.WHITE);
		});
		
		green.setOnAction(event ->{
			circle1.setFill(Color.WHITE);
			circle2.setFill(Color.WHITE);
			circle3.setFill(Color.GREEN);
			circle4.setFill(Color.WHITE);
		});
		
		blue.setOnAction(event ->{
			circle4.setFill(Color.BLUE);
			circle1.setFill(Color.WHITE);
			circle2.setFill(Color.WHITE);
			circle3.setFill(Color.WHITE);
		});
		
		hBox.setAlignment(Pos.CENTER);	
		return hBox;
	}
}


