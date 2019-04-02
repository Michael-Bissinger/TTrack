package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Add controls
        Label title = new Label("Track it!");
        Label mid = new Label("Mid:");
        Label eve = new Label("Eve");

        Button midstart = new Button("Start mid!");
        Button evestart = new Button("Start eve!");

        TextField midtime = new TextField();
        TextField evetime = new TextField();

        // Add to GridPane
        GridPane grid = new GridPane();
        grid.add(title, 0, 0);
        grid.add(mid, 0,1);
        grid.add(midtime, 1, 1);
        grid.add(midstart,1,2);
        grid.add(eve,0,4);
        grid.add(evetime,1,4);
        grid.add(evestart,1,5);

        // Scene
        Scene scene = new Scene(grid, 400, 400);

        // Stage
        primaryStage.setTitle("TTrack");
        primaryStage.setScene(scene);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
