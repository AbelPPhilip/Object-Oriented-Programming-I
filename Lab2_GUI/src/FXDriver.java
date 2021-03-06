/*
 * Name: Abel P. 
 * Class: CMSC 203 
 * Instructor: Ahmed Tarek
 * Description: An introductory program to Java GUIs. This simple program outputs the buttons that are clicked by the users.
 * 
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 600, 400));
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
}