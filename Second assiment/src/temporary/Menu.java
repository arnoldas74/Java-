package temporary;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Menu {
	private BorderPane bpRoot;
	private Stage primaryStage;
public Menu(Stage primaryStage) {
		this.primaryStage = primaryStage;
		addElementsToScene();
		
		primaryStage.show();
	
	}
private void addElementsToScene() {
	//this code make the menu window 
	primaryStage.setTitle("Menu");
	this.bpRoot=new BorderPane();
	Scene scene = new Scene(this.bpRoot,500,500);
	
	primaryStage.setResizable(false);
	primaryStage.centerOnScreen();
	
	
	
	primaryStage.setScene(scene);
	primaryStage.show();
}
}