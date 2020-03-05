package tracker.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import tracker.Main;

public class MainViewController {
	
	 
	
	@FXML
	private Button startButton;
	
	@FXML
	private Button register;
	
	@FXML
	private ImageView bckgr;
	
	@FXML	
	private void srart() throws IOException {
		Main.showMainItems();
	}
	
	@FXML
	private void register() throws IOException {
		Main.newRegister();
	}
}
