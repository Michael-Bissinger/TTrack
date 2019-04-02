package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        GridPane root = new GridPane();
        
        Label title = new Label("Track it!");
        Label mid = new Label("Mid:");
        Label eve = new Label("Eve");

        TextField midtime = new TextField();
        TextField evetime = new TextField();

        root.add(title, 0, 1);

        primaryStage.setTitle("TTrack");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
