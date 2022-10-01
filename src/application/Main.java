package application;
	

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	private static ObservableList<Node> mainGrid;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollPane = loader.load();
			HBox externHBox = (HBox) scrollPane.getContent();
			ObservableList<Node> grid = externHBox.getChildren();
			GridPane externGrid = (GridPane) grid.get(0);
			mainGrid = externGrid.getChildren();			
			Scene scene = new Scene(scrollPane);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static ObservableList<Node> getMainGrid (){
		return mainGrid;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
