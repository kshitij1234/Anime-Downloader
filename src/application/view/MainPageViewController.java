package application.view;

import java.beans.Visibility;
import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainPageViewController {
	
	@FXML
	private Button animehaevenbtn;
	private Button nineanimebtn;
	private Button kissanimebtn;
	
	@FXML
	private void getAnimeHeaven(ActionEvent event) throws IOException{
		
		Stage stage = (Stage) animehaevenbtn.getScene().getWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("animeheaven/AnimeHeavenView.fxml"));
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.setResizable(true);
	    stage.setMaximized(true);
	    stage.setTitle("Anidpy - Animeheaven Downloader");
	}

}
