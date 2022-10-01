module validadoSudokuThreads {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    
    exports gui;    
    opens application to javafx.graphics, javafx.fxml, javafx.controls;
    opens gui to javafx.fxml, javafx.controls, javafx.graphics;
    //opens steps to application;
}







//{
//	requires javafx.controls;
//	requires javafx.fxml;
//	
//	opens application to javafx.graphics, javafx.fxml, javafx.controls;
//	//opens src.gui.MainViewController;
//}