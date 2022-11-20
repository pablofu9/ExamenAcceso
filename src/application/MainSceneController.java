package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainSceneController {

	@FXML
	private Button boton;
	
	@FXML
	private TextField txt;
	
	@FXML
	private void botonOnClick() throws IOException{
		txt.setText("Hola");
		Stage stage = new Stage();
	    Parent root = FXMLLoader.load(getClass().getResource("SecondaryScene.fxml"));
	    Scene scene = new Scene(root);
	    stage = new Stage(StageStyle.DECORATED);
	    stage.setScene(scene);
	    stage.show();
	    //Para cerrar el login
	    Stage loginStage = (Stage) this.boton.getScene().getWindow();
	    loginStage.close();
	}
}
