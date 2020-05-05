package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	
	
	public static void showAlert(String title, String header, String content, AlertType alertype) {
		
		
		Alert alert = new Alert(alertype);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}

}
