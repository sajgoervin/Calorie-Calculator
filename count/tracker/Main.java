package tracker;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	private static BorderPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Track your food.");
		showMainView();
		//showMainItems();
	}
	
	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void showMainItems() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);	
	}
	
	public static void showFoodsInsert() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("foods/foodsInsert.fxml"));
		BorderPane foodsInsert = loader.load();
		mainLayout.setCenter(foodsInsert);
	}
	
	public static void showFoodsTracker() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("foods/foodsTracker.fxml"));
		BorderPane foodsInsert = loader.load();
		mainLayout.setCenter(foodsInsert);
	}
	
	public static void showUnsuccessLog() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("foods/foodsUnsucces.fxml"));
		BorderPane foodsInsert = loader.load();
		mainLayout.setCenter(foodsInsert);
	}
	
	public static void newRegister() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/RegisterView.fxml"));
		BorderPane register = loader.load();
		mainLayout.setCenter(register);
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
