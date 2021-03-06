package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Add controls
        Label title = new Label("Track it!");
        Label mid = new Label("Mid:");
        Label eve = new Label("Eve");
        Label x_curve = new Label("X-value");
        Label y_curve = new Label("Y-value");

        TextField midtime = new TextField();
        TextField evetime = new TextField();

        Label border = new Label("-----------------");
        Label notes = new Label("Notes:");
        Label fivemin = new Label("5 Min = 300");
        Label thirtymin = new Label("30 Min = 1800");

        Label lblTest = new Label("write test to do test");
        TextField testfield = new TextField();
        TextField xfield = new TextField();
        xfield.setText("782"); // old: 2782
        TextField yfield = new TextField();
        yfield.setText("724"); // old: 764
        //Checkbox cbtestCheckbox = new Checkbox("Test");
        //cbtestCheckbox.setState(false);

        // Central buttons
        Button midstart = new Button("Start mid!");
        midstart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    String waittime = (midtime.getText());
                    int waittime_int = Integer.parseInt(waittime);
                    int coordinatex = Integer.parseInt(xfield.getText());
                    int coordinatey = Integer.parseInt(yfield.getText());

                    String test = testfield.getText();
                    Action.start("mid", waittime_int, test, coordinatex, coordinatey);
                } catch (InterruptedException | IOException | AWTException e) {
                    e.printStackTrace();
                }
            }
        });


        Button evestart = new Button("Start eve!");
        evestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    String waittime = (evetime.getText());
                    int waittime_int = Integer.parseInt(waittime);
                    int coordinatex = Integer.parseInt(xfield.getText());
                    int coordinatey = Integer.parseInt(yfield.getText());

                    String test = testfield.getText();
                    Action.start("eve", waittime_int, test, coordinatex, coordinatey);
                } catch (InterruptedException | IOException | AWTException e) {
                    e.printStackTrace();
                }
            }
        });



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

        grid.add(lblTest,0,6);
        grid.add(testfield,1,6);

        grid.add(x_curve, 0, 7); // X-Achse
        grid.add(xfield, 1, 7); // X-Achse
        grid.add(y_curve, 0, 8); // Y-Achse
        grid.add(yfield, 1, 8); // Y-Achse

        //grid.add(cbtestCheckbox,0,6);

        grid.add(border,0,9);
        grid.add(notes,0,10);
        grid.add(fivemin,1,10);
        grid.add(thirtymin,1,11);

        // Scene
        Scene scene = new Scene(grid, 400, 450);

        // Stage
        primaryStage.setTitle("TTrack");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
