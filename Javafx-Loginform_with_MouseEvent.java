//JAVAFX-Simple Login Page Design With MouseEVENT

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
public class LoginForm extends Application
{
    public void start(Stage stage)
    {
        Button Login = new Button("Login");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(Login);
        Button Cancel = new Button("Cancel");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn1.getChildren().add(Cancel);

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(25, 25, 25, 25));
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);

        Text  scenetitle=new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
        pane.add(scenetitle,0,0,2,1);
        
        Label userName = new Label("User Name:");
        pane.add(userName, 0, 1);
        TextField userTextField = new TextField();
        pane.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        pane.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        pane.add(pwBox, 1, 2);
        
        Label l = new Label("button not selected");
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l.setText("Login button selected ");
            }
        };
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l.setText("Cancel button selected ");
            }
        };

        Login.setOnAction(event);
        Cancel.setOnAction(event1);
        pane.add(hbBtn, 1, 4);
        pane.add(hbBtn1, 1, 5);
        pane.add(l,1,7);
        
        Scene scene = new Scene(pane, 300,275);
        stage.setTitle("Login Form");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }
}
