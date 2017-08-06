import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.paint.Color;

public class Login extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		String admin_login = "admin";
		String admin_password = "admin";

		primaryStage.setTitle("Serco-ROTA");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text welcome = new Text("Welcome to Serco-ROTA");
		welcome.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
		grid.add(welcome, 0, 0, 2, 1);

		Label userName =  new Label("Username:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		Label password = new Label("Password:");
		grid.add(password, 0, 2);

		PasswordField passwordField = new PasswordField();
		grid.add(passwordField, 1, 2);
		
		Button signInBtn = new Button("Sign in");
		HBox hsignInBtn = new HBox(10);
		hsignInBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hsignInBtn.getChildren().add(signInBtn);
		grid.add(hsignInBtn, 1, 4);

		final Text actiontarget = new Text();
			grid.add(actiontarget, 1, 6);

		signInBtn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				String login = userTextField.getText();
				String passwd = passwordField.getText();
				actiontarget.setFill(Color.FIREBRICK);
				//actiontarget.setText("Sign in button pressed");
				if(login.equals(admin_login)){
					actiontarget.setText("Logged in");
				}else{
					actiontarget.setText("Incorrect login/password");
				}

			}
		});

		Scene scene = new Scene(grid, 800, 600);
		primaryStage.setScene(scene);	
		primaryStage.show();
	}
}
