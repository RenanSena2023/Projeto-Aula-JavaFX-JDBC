package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.print("Action");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.print("Action");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.print("Action");
	}	
	
	@Override
	public void initialize(URL url, ResourceBundle rb ) {
		
		
	}

}