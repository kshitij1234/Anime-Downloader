package application.view.animeheaven;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import application.Anime;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class AnimeHeavenController implements Initializable{

	@FXML
	TableView<Anime> table;
	@FXML
	TableColumn<Anime, String> name;
	@FXML
	TableColumn<Anime, String> status;
	@FXML
	TextField url;
	@FXML
	TextField path;
	@FXML
	Button pathbtn;
	@FXML
	Button downloadbtn;
	
	ObservableList<Anime> list = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		name.setCellValueFactory(new PropertyValueFactory<Anime,String>("name"));
		status.setCellValueFactory(new PropertyValueFactory<Anime,String>("status"));
		
		table.setItems(list);
	}
	
	@FXML
	public void pathbtnClick(ActionEvent event)
	{
		DirectoryChooser directoryChooser = new DirectoryChooser();
		directoryChooser.setTitle("Select Folder to save Episodes");
		
		Stage primaryStage = (Stage) pathbtn.getScene().getWindow();
		
		File selectedDirectory = directoryChooser.showDialog(primaryStage);
		path.setText(selectedDirectory.toString());
        
	}
	
	@FXML
	public void startDownload(ActionEvent event)
	{
		if(url.getText()==null)
		{
			//display error
		}
		else if(url.getText()==null)
		{
			//display error
		}
		else 
		{
			// Actual Downloading here
		}
	}
	
	
	
}
