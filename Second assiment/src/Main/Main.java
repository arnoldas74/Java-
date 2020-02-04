package Main;

import javafx.application.Application;
import temporary.Menu;
import javafx.stage.Stage;

public class Main extends Application {
	Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		Menu menu = new Menu(primaryStage);
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
