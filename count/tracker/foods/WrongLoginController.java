package tracker.foods;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import tracker.Main;

public class WrongLoginController {
	
	@FXML
	private Button WrongLoggin;
	
	@FXML
	
	private void backToLogin() throws IOException {
		Main.showMainItems();
	}

}
