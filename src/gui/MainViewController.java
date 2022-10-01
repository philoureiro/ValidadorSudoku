package gui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import application.Main;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import tasks.Execute;

public class MainViewController implements Initializable{
	@FXML
	private Button confirmButton = new Button("Confirmar");
	@FXML
	private TextField txtMessage = new TextField();
	@FXML
	private TextField txtF0_0 = new TextField();
	@FXML
	private TextField txtF0_1 = new TextField();
	@FXML
	private TextField txtF0_2 = new TextField();
	@FXML
	private TextField txtF0_3 = new TextField();
	@FXML
	private TextField txtF0_4 = new TextField();
	@FXML
	private TextField txtF0_5 = new TextField();
	@FXML
	private TextField txtF0_6 = new TextField();
	@FXML
	private TextField txtF0_7 = new TextField();
	@FXML
	private TextField txtF0_8 = new TextField();
	
	
	@FXML
	private TextField txtF1_0 = new TextField();
	@FXML
	private TextField txtF1_1 = new TextField();
	@FXML
	private TextField txtF1_2 = new TextField();
	@FXML
	private TextField txtF1_3 = new TextField();
	@FXML
	private TextField txtF1_4 = new TextField();
	@FXML
	private TextField txtF1_5 = new TextField();
	@FXML
	private TextField txtF1_6 = new TextField();
	@FXML
	private TextField txtF1_7 = new TextField();
	@FXML
	private TextField txtF1_8 = new TextField();
	
	@FXML
	private TextField txtF2_0 = new TextField();
	@FXML
	private TextField txtF2_1 = new TextField();
	@FXML
	private TextField txtF2_2 = new TextField();
	@FXML
	private TextField txtF2_3 = new TextField();
	@FXML
	private TextField txtF2_4 = new TextField();
	@FXML
	private TextField txtF2_5 = new TextField();
	@FXML
	private TextField txtF2_6 = new TextField();
	@FXML
	private TextField txtF2_7 = new TextField();
	@FXML
	private TextField txtF2_8 = new TextField();
	
	@FXML
	private TextField txtF3_0 = new TextField();
	@FXML
	private TextField txtF3_1 = new TextField();
	@FXML
	private TextField txtF3_2 = new TextField();
	@FXML
	private TextField txtF3_3 = new TextField();
	@FXML
	private TextField txtF3_4 = new TextField();
	@FXML
	private TextField txtF3_5 = new TextField();
	@FXML
	private TextField txtF3_6 = new TextField();
	@FXML
	private TextField txtF3_7 = new TextField();
	@FXML
	private TextField txtF3_8 = new TextField();
	
	@FXML
	private TextField txtF4_0 = new TextField();
	@FXML
	private TextField txtF4_1 = new TextField();
	@FXML
	private TextField txtF4_2 = new TextField();
	@FXML
	private TextField txtF4_3 = new TextField();
	@FXML
	private TextField txtF4_4 = new TextField();
	@FXML
	private TextField txtF4_5 = new TextField();
	@FXML
	private TextField txtF4_6 = new TextField();
	@FXML
	private TextField txtF4_7 = new TextField();
	@FXML
	private TextField txtF4_8 = new TextField();
	
	@FXML
	private TextField txtF5_0 = new TextField();
	@FXML
	private TextField txtF5_1 = new TextField();
	@FXML
	private TextField txtF5_2 = new TextField();
	@FXML
	private TextField txtF5_3 = new TextField();
	@FXML
	private TextField txtF5_4 = new TextField();
	@FXML
	private TextField txtF5_5 = new TextField();
	@FXML
	private TextField txtF5_6 = new TextField();
	@FXML
	private TextField txtF5_7 = new TextField();
	@FXML
	private TextField txtF5_8 = new TextField();
	
	@FXML
	private TextField txtF6_0 = new TextField();
	@FXML
	private TextField txtF6_1 = new TextField();
	@FXML
	private TextField txtF6_2 = new TextField();
	@FXML
	private TextField txtF6_3 = new TextField();
	@FXML
	private TextField txtF6_4 = new TextField();
	@FXML
	private TextField txtF6_5 = new TextField();
	@FXML
	private TextField txtF6_6 = new TextField();
	@FXML
	private TextField txtF6_7 = new TextField();
	@FXML
	private TextField txtF6_8 = new TextField();
	
	@FXML
	private TextField txtF7_0 = new TextField();
	@FXML
	private TextField txtF7_1 = new TextField();
	@FXML
	private TextField txtF7_2 = new TextField();
	@FXML
	private TextField txtF7_3 = new TextField();
	@FXML
	private TextField txtF7_4 = new TextField();
	@FXML
	private TextField txtF7_5 = new TextField();
	@FXML
	private TextField txtF7_6 = new TextField();
	@FXML
	private TextField txtF7_7 = new TextField();
	@FXML
	private TextField txtF7_8 = new TextField();
	
	@FXML
	private TextField txtF8_0 = new TextField();
	@FXML
	private TextField txtF8_1 = new TextField();
	@FXML
	private TextField txtF8_2 = new TextField();
	@FXML
	private TextField txtF8_3 = new TextField();
	@FXML
	private TextField txtF8_4 = new TextField();
	@FXML
	private TextField txtF8_5 = new TextField();
	@FXML
	private TextField txtF8_6 = new TextField();
	@FXML
	private TextField txtF8_7 = new TextField();
	@FXML
	private TextField txtF8_8 = new TextField();
	private static boolean result = true;
	private  Execute execute;
	ObservableList<Node> GRID3X3;
	private int[][] recoveredMatrix = new int[9][9];
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GRID3X3 = Main.getMainGrid();
	}
	@FXML
	public void onConfirmButtonClicked() {
		txtMessage.setText("");
		int countDD = 0;
		int countGridRow = 0;
		int countGridColumn = 0;
		for(int selectGrid = 0; selectGrid < 9; selectGrid++) {
			HBox hBoxGrid1 = (HBox) Main.getMainGrid().get(selectGrid);
			ObservableList<Node> grid1 = hBoxGrid1.getChildren();
			GridPane getTextFieldGrid = (GridPane) grid1.get(0);
			ObservableList<Node> textFieldList = getTextFieldGrid.getChildren();
			countGridRow = selectGrid == 1 ? 0 : countGridRow;
			countGridRow = selectGrid == 2 ? 0 : countGridRow;
			countGridRow = selectGrid == 3 ? 3 : countGridRow;
			countGridRow = selectGrid == 4 ? 3 : countGridRow;
			countGridRow = selectGrid == 5 ? 3 : countGridRow;
			countGridRow = selectGrid == 6 ? 6 : countGridRow;
			countGridRow = selectGrid == 7 ? 6 : countGridRow;
			countGridRow = selectGrid == 8 ? 6 : countGridRow;
			for(int h = 0; h < 3; h++) {
				countGridColumn = selectGrid == 0 ? 0 : countGridColumn;
				countGridColumn = selectGrid == 1 ? 3 : countGridColumn;
				countGridColumn = selectGrid == 2 ? 6 : countGridColumn;
				countGridColumn = selectGrid == 3 ? 0 : countGridColumn;
				countGridColumn = selectGrid == 4 ? 3 : countGridColumn;
				countGridColumn = selectGrid == 5 ? 6 : countGridColumn;
				countGridColumn = selectGrid == 6 ? 0 : countGridColumn;
				countGridColumn = selectGrid == 7 ? 3 : countGridColumn;
				countGridColumn = selectGrid == 8 ? 6 : countGridColumn;
				for(int i = 0; i < 3; i++) {
					TextField txtInt = (TextField) textFieldList.get(countDD);
					if(txtInt.getText() != "") {
						recoveredMatrix[countGridRow][countGridColumn] = Integer.parseInt(txtInt.getText());
					}else {
						recoveredMatrix[countGridRow][countGridColumn] = 0;
					}
					countGridColumn += 1;
					countDD += 1;
				}
				countGridRow += 1;	
			}
			countDD = 0;
		}
		execute = new Execute(recoveredMatrix);
		boolean result = execute.start();
		if(result) {
			txtMessage.setText("Grid válido");
		}else {
			txtMessage.setText("Grid inválido");
		}

}
	public static boolean getResult() {
		return result;
	}
	public static void setResult(boolean result) {
		MainViewController.result = result;
	}
	


}
