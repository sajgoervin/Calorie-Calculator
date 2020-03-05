package tracker.foods;

import java.io.IOException;

import controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Food;
import tracker.Main;

public class UserItemsController {

	private static Food finalFood = new Food();
	
	@FXML
	private Button addFood;
	
	@FXML
	private Button addFood1;
	
	@FXML
	private Button addFood2;
	
	@FXML
	private Button addFood3;
	
	@FXML
	private TextField serving;
	
	@FXML
	private TextField serving1;
	
	@FXML
	private TextField serving2;
	
	@FXML
	private TextField serving3;
	
	@FXML
	private TextField breakfast;
	
	@FXML
	private TextField lunch;
	
	@FXML
	private TextField dinner;
	
	@FXML
	private TextField snack;
	
	@FXML
	private Label totalCalories;
	
	@FXML
	private Button backLogin;
	
	@FXML
	private void trackFood() {
		Food food = Controller.trackFood(breakfast.getText());
		//System.out.println(food.getFoodname() + " " + food.getFoodcals());
		
		finalFood.setFoodcals(Integer.parseInt(serving.getText())*food.getFoodcals()+finalFood.getFoodcals());
		
		totalCalories.setText(Integer.toString(finalFood.getFoodcals()));
	}
	
	@FXML
	private void trackFood1() {
		Food food = Controller.trackFood(lunch.getText());
		//System.out.println(food.getFoodname() + " " + food.getFoodcals());
		
		finalFood.setFoodcals(Integer.parseInt(serving1.getText())*food.getFoodcals()+finalFood.getFoodcals());
		
		totalCalories.setText(Integer.toString(finalFood.getFoodcals()));
	}
	
	@FXML
	private void trackFood2() {
		Food food = Controller.trackFood(dinner.getText());
		//System.out.println(food.getFoodname() + " " + food.getFoodcals());
		
		finalFood.setFoodcals(Integer.parseInt(serving2.getText())*food.getFoodcals()+finalFood.getFoodcals());
		
		totalCalories.setText(Integer.toString(finalFood.getFoodcals()));
	}
	
	@FXML
	private void trackFood3() {
		Food food = Controller.trackFood(snack.getText());
		//System.out.println(food.getFoodname() + " " + food.getFoodcals());
		
		finalFood.setFoodcals(Integer.parseInt(serving3.getText())*food.getFoodcals()+finalFood.getFoodcals());
		
		totalCalories.setText(Integer.toString(finalFood.getFoodcals()));
	}
	
	@FXML
	private void backToLogin() throws IOException {
		
		Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
		confirm.setTitle("Confirm your choice");
		confirm.setContentText("Are you sure you want to go back?");
		confirm.showAndWait().ifPresent((btnType) -> {
			  if (btnType == ButtonType.OK) {
				  try {
					Main.showMainItems();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  } 
				});
	}
	
}
