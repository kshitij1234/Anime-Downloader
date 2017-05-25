package application.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sun.rmi.server.Activation;

public class MainPageViewController {
	
	@FXML
	private Button animehaevenbtn;
	@FXML
	private Button nineanimebtn;
	@FXML
	private Button kissanimebtn;
	
	@FXML
	private void getAnimeHeaven(ActionEvent event) throws IOException{
		
		Stage stage = (Stage) animehaevenbtn.getScene().getWindow();
		String path = "animeheaven/AnimeHeavenView.fxml";
		String title = "Anidpy - Animeheaven Downloader";
		changeScene(stage, title, path);
	}

	@FXML
	private void getNineAnime(ActionEvent event)throws IOException{
		
		Stage stage = (Stage) nineanimebtn.getScene().getWindow();
		String path = "nineanime/NineAnimeView.fxml";
		String title = "Anidpy - 9Anime Downloader";
		changeScene(stage, title, path);
	}
	
	@FXML
	private void getKissAnime(ActionEvent event) throws IOException{
		
		Stage stage = (Stage) kissanimebtn.getScene().getWindow();
		String path = "kissanime/KissAnimeView.fxml";
		String title = "Anidpy - KissAnime Downloader";
		changeScene(stage, title, path);
	}
	
	private void changeScene(Stage stage, String title, String path) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getResource(path));
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.setResizable(true);
	    stage.setMaximized(true);
	    stage.setTitle(title);
	}
}
