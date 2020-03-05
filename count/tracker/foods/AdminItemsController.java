package tracker.foods;

import java.io.IOException;

import controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.Food;
import tracker.Main;

public class AdminItemsController {
	
	@FXML
	private TextField foodsName;
	
	@FXML
	private TextField foodsCalories;
	
	@FXML
	private Button addFood;
	
	@FXML
	private Button backToLogin;
	
	@FXML
	private void backLogin() throws IOException {
		Main.showMainItems();
	}
	
	@FXML
	private void insertFood() {
		Food food = new Food();
		food.setFoodname(foodsName.getText());
		food.setFoodcals(Integer.valueOf(foodsCalories.getText()));
		//System.out.println(food.getFoodname() + " " +food.getFoodcals());
		
		Controller.insertFood(food.getFoodname(), food.getFoodcals());
		
		Alert done = new Alert(Alert.AlertType.INFORMATION);
		done.setTitle("Confirmation");
		done.setContentText("The food was added to the database");
		done.show();
		
	}

}
