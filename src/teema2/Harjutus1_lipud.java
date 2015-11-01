package teema2;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 600, 300);
        primaryStage.setScene(stseen);

        Rectangle kast1 = new Rectangle(0, 0, 600, 100);
        kast1.setFill(Color.BLUE);
        Rectangle kast2 = new Rectangle(0, 100, 600, 100);
        kast2.setFill(Color.BLACK);
        Rectangle kast3 = new Rectangle(0, 200, 600, 100);
        kast3.setFill(Color.WHITESMOKE);
        pane.getChildren().add(kast1);
        pane.getChildren().add(kast2);
        pane.getChildren().add(kast3);
        primaryStage.setScene(stseen);

        primaryStage.show();

    }}




