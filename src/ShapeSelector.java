import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeSelector extends Application {

	
	HBox hBox1, hBox2;
	VBox vBox;
	Circle circle;
	Rectangle rectangle;
	Ellipse ellipse;
	BorderPane pane;
	
	CheckBox fill;
	RadioButton red, blue, green, yellow, cir;
	Color color;
	
	
	public static void main(String[] args) {

		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("OmarJeng-21826004===Shape Selector");
		
		
		pane = new BorderPane();

		
		pane.setBottom(getHBox());
		pane.setRight(getVbox());
//		top, right, down, left
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setMargin(vBox, new Insets(10, 10, 10, 10));
		
		pane.setCenter(getCircle());
		cir.setSelected(true);		


		Scene scene = new Scene(pane, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
//		JOptionPane.showMessageDialog(null, "You first select the shape, then select the fill color");
	}
	
	
	private  VBox getVbox() {
		
		vBox = new VBox(30);
		
		red = new RadioButton("Red    ");
		green = new RadioButton("Green ");
		blue = new RadioButton("Blue   ");
		yellow = new RadioButton("Yellow");
		
		vBox.getChildren().addAll(red, green, blue, yellow);
		
		ToggleGroup group = new ToggleGroup();
		red.setToggleGroup(group);
		blue.setToggleGroup(group);
		green.setToggleGroup(group);
		yellow.setToggleGroup(group);
		
//		red.setOnAction(event ->{
//			color = Color.RED;
//			circle.setFill(color);
//			rectangle.setFill(color);
//			ellipse.setFill(color);			
//		});
//		
//		blue.setOnAction(event ->{
//			color = Color.BLUE;
//			circle.setFill(color);
//			rectangle.setFill(color);
//			ellipse.setFill(color);		
//		});
//		
//		yellow.setOnAction(event ->{
//			color = Color.YELLOW;
//			circle.setFill(color);
//			rectangle.setFill(color);
//			ellipse.setFill(color);		
//		});
//		
//		green.setOnAction(event ->{
//			color = Color.GREEN;
//			circle.setFill(color);
//			rectangle.setFill(color);
//			ellipse.setFill(color);		
//			
//		});
		
		vBox.setAlignment(Pos.CENTER);
		vBox.setStyle("-fx-border-color: green;");
		vBox.setMinWidth(80);
		
		return vBox;
	}
	
	
	
	private HBox getHBox() {
		
		hBox2 = new HBox(10);
		
		cir = new RadioButton("circle");
		RadioButton rect = new RadioButton("rectangle");
		RadioButton elli = new RadioButton("ellipse");
//		fill = new CheckBox("fill");
		
		ToggleGroup group = new ToggleGroup();
		cir.setToggleGroup(group);
		rect.setToggleGroup(group);
		elli.setToggleGroup(group);
		
		
		hBox2.getChildren().addAll(cir, rect, elli);
		
		rect.setOnAction(event -> {
			pane.setCenter(getRectangle());

		});
		
		cir.setOnAction(event -> {
			pane.setCenter(getCircle());
		});
		
		elli.setOnAction(event ->{
			pane.setCenter(getEllipse());
		});
		
//		fill.setOnAction(event -> {
//			
//			if (fill.isSelected()) {
//				circle.setFill(Color.RED);
//				rectangle.setFill(Color.BLUE);
//				ellipse.setFill(Color.GREEN);
//			}
//			if (fill.isSelected()==false) {
//				circle.setFill(Color.WHITE);
//				rectangle.setFill(Color.WHITE);
//				ellipse.setFill(Color.WHITE);
//			}
//			
//		});
//		
		hBox2.setAlignment(Pos.CENTER);
		hBox2.setStyle("-fx-border-color: black;");	
		hBox2.setMinHeight(30);
		
		return hBox2;
	}	
	
	//Shapes
	private Rectangle getRectangle() {
		
		rectangle = new Rectangle(25, 10, 300, 150);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(color);
		
		red.setOnAction(event ->{
			color = Color.RED;
			rectangle.setFill(color);
		});
		
		blue.setOnAction(event ->{
			color = Color.BLUE;
			rectangle.setFill(color);
		});
		
		yellow.setOnAction(event ->{
			color = Color.YELLOW;
			rectangle.setFill(color);
		});
		
		green.setOnAction(event ->{
			color = Color.GREEN;
			rectangle.setFill(color);
			
		});
		
		return rectangle;
	}
	
	private Circle getCircle() {
		
		circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(100);
		circle.setStroke(Color.BLACK);
		circle.setFill(color);
		
		red.setOnAction(event ->{
			color = Color.RED;
			circle.setFill(color);
			
		});
		
		blue.setOnAction(event ->{
			color = Color.BLUE;
			circle.setFill(color);
			
		});
		
		yellow.setOnAction(event ->{
			color = Color.YELLOW;
			circle.setFill(color);
			
		});
		
		green.setOnAction(event ->{
			color = Color.GREEN;
			circle.setFill(color);
			
		});
			
		return circle;
	}
	
	private Ellipse getEllipse() {
		
		ellipse = new Ellipse();
		ellipse.setCenterX(300);
		ellipse.setCenterY(150);
		ellipse.setRadiusX(150);
		ellipse.setRadiusY(75);
		ellipse.setStroke(Color.BLACK);
		ellipse.setFill(color);
		
		red.setOnAction(event ->{
			color = Color.RED;
			ellipse.setFill(color);			
		});
		
		blue.setOnAction(event ->{
			color = Color.BLUE;
			ellipse.setFill(color);		
		});
		
		yellow.setOnAction(event ->{
			color = Color.YELLOW;
			ellipse.setFill(color);		
		});
		
		green.setOnAction(event ->{
			color = Color.GREEN;
			ellipse.setFill(color);		
			
		});
		
		
		return ellipse;
	}
	
}

//import javafx.application.Application;
//
//public class ShapeSelector extends Application {
//
//	Circle circle;
//	Rectangle rectangle;
//	Ellipse ellipse;
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		// TODO Auto-generated method stub
//		
//		BorderPane pane = new BorderPane();
//		
//				
////				pane.setBottom(getHBox());
////				pane.setRight(getVbox());
////				top, right, down, left
////				pane.setPadding(new Insets(10, 10, 10, 10));
//	//			pane.setMargin(vBox, new Insets(10, 10, 10, 10));
////				
//				pane.setCenter(getCircle());
////				cir.setSelected(true);		
//		
//		
//				Scene scene = new Scene(pane, 600, 400);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		
//	}
//
//	public static void main(String[] args) {
//		
//		Application.launch(args);
//	}
//	
//	private Circle getCircle() {
//		
//		circle = new Circle();
//		circle.setCenterX(50);
//		circle.setCenterY(50);
//		circle.setRadius(50);
//		circle.setStroke(Color.BLACK);
//		circle.setFill(Color.WHITE);
//		
//		
//		return circle;
//	}
//	
//	private Rectangle getRectangle() {
//		
//	}
//	
//	
//}






























