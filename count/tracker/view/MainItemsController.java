package tracker.view;

import java.io.IOException;

import controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.User;
import tracker.Main;

public class MainItemsController {
	
	@FXML
	private Button homeButton;

	@FXML
	private Label unameLabel;
	
	@FXML
	private Label pswdLabel;
	
	@FXML
	private Button logginB;
	
	@FXML
	private TextField usernameField;
	
	@FXML
	private TextField userpassField;
	
	
	@FXML	
	private void goHome() throws IOException {
		Main.showMainItems();
	}
	
	@FXML
	private void showRightScene() throws IOException{
		
		User logedInUser = Controller.login(usernameField.getText(), userpassField.getText());
		if (logedInUser.getPassword() != null && logedInUser.getUsername() != null) {
		if (	logedInUser.getIsAdmin())	{
				Main.showFoodsInsert();
			}
			else {
					Main.showFoodsTracker();
				} 
			}
		else {
			//System.out.println("Hibas bejelentkezes.");
			Main.showUnsuccessLog();
		}
	}
	
	@FXML
	private void goInsertFoods() throws IOException {
		Main.showFoodsInsert();
	}
}
