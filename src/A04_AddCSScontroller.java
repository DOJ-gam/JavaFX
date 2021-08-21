import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class A04_AddCSScontroller {
	

@FXML
private Label myLabel;

public void generateRandom(ActionEvent even) {
		
		Random ran = new Random();
		int random = ran.nextInt(100) + 1;
		
		System.out.println(Integer.toString(random));
		
//		Display using label
		myLabel.setText(Integer.toString(random));
		
	}

}
