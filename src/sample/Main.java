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

        GridPane grid = new GridPane();

        Label title = new Label("Track it!");
        Label mid = new Label("Mid:");
        Label eve = new Label("Eve");

        Button midstart = new Button("Start mid!");
        Button evestart = new Button("Start eve!");

        TextField midtime = new TextField();
        TextField evetime = new TextField();

        Scene scene = new Scene(grid, 400, 400)

        grid.add(midstart, 0, 1);



        primaryStage.setTitle("TTrack");
        primaryStage.setScene(scene);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
