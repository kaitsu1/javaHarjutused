package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */

public class PixelChaser extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        for (int i = 0; i < 15; i++) {
            Rectangle ristkulik = new Rectangle(100,50);
            ristkulik.setFill(Color.AZURE);
            ristkulik.setStroke(Color.BLACK);
            ristkulik.setX(Math.random()*400);
            ristkulik.setY(Math.random()*450);
            pane.getChildren().add(ristkulik);

            ristkulik.setId("Original"); // annad nime esimesena valmis tehtud ristkülikule

            ristkulik.setOnMouseClicked(event -> {

                if(ristkulik.getId().equals("Original")){
                    ristkulik.setId("small");
                    ristkulik.setScaleY(0.5);
                    ristkulik.setScaleX(0.5);                }
                else if(ristkulik.getId().equals("small")){
                    pane.getChildren().remove(ristkulik);
                }
            });
        }
    }
}
/* public class PixelChaser extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        Pane kujund = new Pane();
        Scene stseen = new Scene(kujund, 500, 500);
        primaryStage.setScene(stseen);

        ArrayList<Rectangle> list = new ArrayList<>();   //ristkylikute moodustamine
        for (int i = 0; i < 20; i++) {
            Rectangle rectangle = new Rectangle(10+Math.random()*450,10+Math.random()*450, 100, 100);
            kujund.getChildren().add(rectangle);
            list.add(rectangle);
        }
        for (int i = 0; i <list.size() ; i++) {
            Rectangle changeSize = list.get(i);
            changeSize.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2) {
                    changeSize.setVisible(false);
                    System.out.println("double clicked");
                }
                changeSize.setHeight(50);
                changeSize.setWidth(50);
            });
        }
    }
}
*/