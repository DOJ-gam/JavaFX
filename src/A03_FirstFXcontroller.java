import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class A03_FirstFXcontroller {
	
//	To make this class the controller of the fxml class, we go to the scene builder, and at the button, choose controller and enter the class name.
	
//	To set on action for our button, at the bottom of the scene builder, on the right, we click Code, and then paste the method we want (also give an id to button)
	
//	A method to generate random numbers
	
//	Always use the @FXML to make sure your fxml always connects to controller,
	
	@FXML
	private Label myLabel; //create a label and link it to label in fxml to display results(Make sure the name here is the same as the id on the fxml)
	
	public void generateRandom(ActionEvent even) {
		
		Random ran = new Random();
		int random = ran.nextInt(100) + 1;
		
		System.out.println(Integer.toString(random));
		
//		Display using label
		myLabel.setText(Integer.toString(random));
		
	}

}
