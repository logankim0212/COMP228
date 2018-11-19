package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
//		FlowPane pane = new FlowPane();
		FlowPane pane = new FlowPane(Orientation.VERTICAL);
		pane.setPadding(new Insets(10, 10, 10, 10));
//		pane.setPadding(new Insets(11, 12, 13, 14));
//		pane.setHgap(100);
//		pane.setVgap(15);
		pane.setHgap(5);
		pane.setVgap(5);

		// button controls
		Button btnOK = new Button("OK");
		Button btnCancel = new Button("Cancel");

		// Place nodes in the pane
		pane.getChildren().addAll(btnOK, btnCancel);
//		pane.getChildren().addAll(new Label("First Name:"),
//				new TextField(), new Label("MI:"));
//		TextField tfMi = new TextField();
//		tfMi.setPrefColumnCount(1);
//		pane.getChildren().addAll(tfMi,
//				new Label("Last Name:"), new TextField());

		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("ShowFlowPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args) {
		launch(args);
	}
}