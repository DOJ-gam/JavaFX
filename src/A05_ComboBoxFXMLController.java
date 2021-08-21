
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class A05_ComboBoxFXMLController implements Initializable {
	
	
	
	@FXML
	public Label myLabel;
	
	@FXML
	public Button btn_addItems;
	
	@FXML
	public ComboBox<String> myComboBox;
	
	
	
	
//	ObservableList<String> list = FXCollections.observableArrayList("Mango", "Orange", "Apple", "Cashew", "Pawpaw");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		//myComboBox.setItems(list); //initialize our list
		
	}
	
	public void comboChanged(ActionEvent event) {
		
		myLabel.setText(myComboBox.getValue());
	}
	
	public void ButtonCombo(ActionEvent event) {
		
		myComboBox.getItems().addAll("Car", "House", "School", "Juice");
	}

}
