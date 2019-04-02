package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
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

                Label border = new Label("-----------------");
                Label notes = new Label("Notes:");
                Label fivemin = new Label("5 Min = 300");
                Label thirtymin = new Label("30 Min = 1800");


        // GridPane settings
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(0, 10, 0, 10));

        // Add to GridPane
        grid.add(title, 0, 0);
        grid.add(mid, 0,1);
        grid.add(midtime, 1, 1);
        grid.add(midstart,1,2);
        grid.add(eve,0,4);
        grid.add(evetime,1,4);
        grid.add(evestart,1,5);

        grid.add(border,0,6);
        grid.add(notes,0,7);
        grid.add(fivemin,1,7);
        grid.add(thirtymin,1,8);

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
