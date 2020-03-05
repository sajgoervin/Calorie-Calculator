package tracker.view;

import java.io.IOException;

import controller.Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import models.User;
import tracker.Main;

public class RegisterViewController {
	
	ObservableList<String> roleStatus = FXCollections.observableArrayList("User","Admin");
	
	@FXML
	private TextField userName;
	
	@FXML
	private TextField password;
	
	@FXML
	private ChoiceBox<String> role;
	
	@FXML
	private Button register;
	
	@FXML
	private void initialize() {
		role.setValue("User");
		role.setItems(roleStatus);
	}
	
	@FXML
	private void signUp() throws IOException {
		User nUser = new User();
		nUser.setUsername(userName.getText());
		nUser.setPassword(password.getText());
		nUser.setIsAdmin(role.getValue().equals("Admin"));
		//System.out.println(nUser.getUsername()+nUser.getPassword()+nUser.getIsAdmin());
		
		Controller.registerPerson(nUser);
		Alert done = new Alert(Alert.AlertType.INFORMATION);
		done.setTitle("Confirmation");
		done.setContentText("Thank you for your registration");
		done.show();	
		
		Main.showMainItems();
	}

}
