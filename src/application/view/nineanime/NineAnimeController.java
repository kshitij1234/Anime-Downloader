package application.view.nineanime;

import java.net.URL;
import java.util.ResourceBundle;

import application.Anime;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class NineAnimeController implements Initializable{

	@FXML
	TableView<Anime> table;
	@FXML
	TableColumn<Anime, String> name;
	@FXML
	TableColumn<Anime, String> status;
	@FXML
	ChoiceBox<String> choicebox;
	@FXML
	TextField animename;
	@FXML
	TextField location;
	@FXML
	Button locationbtn;
	@FXML
	Button downloadbtn;
	@FXML
	Button refreshbtn;
	@FXML
	Label errormsg;
	
	ObservableList<Anime> list = FXCollections.observableArrayList();
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		
	}

}
