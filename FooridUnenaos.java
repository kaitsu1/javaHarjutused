package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */

public class FooridUnenaos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
//joonistan ekraani
        Pane kujund = new Pane();
        Scene stseen = new Scene(kujund, 500, 500);
        primaryStage.setScene(stseen);

        ArrayList<Circle> list = new ArrayList<>();   //ringide moodustamine
        for (int i = 0; i < 20; i++) {
            Circle joonistanRingi = new Circle(10+Math.random() * 50); //  ringi r=10-60 vahel, et poleks liiga väike +10
            joonistanRingi.setTranslateX(50+Math.random()*450); //kekspunkti x koordinaat
            joonistanRingi.setTranslateY(50+Math.random()*450); //keskpunkti y koordinaat
            joonistanRingi.setFill(Color.RED); //joonistatud ringi värv on punane
            //joonistanRingi.setStroke(Color.BLUE);
            //joonistanRingi.setStrokeWidth(5);
            kujund.getChildren().add(joonistanRingi); //kutsun välja, et lisaks ekraanile
            list.add( joonistanRingi); // ring pannakse ringide listi juurde

        }
        for (int i = 0; i <list.size() ; i++) {
            Circle tsekinRingi = list.get(i);
            tsekinRingi.setOnMouseEntered(event -> {
                tsekinRingi.setFill(Color.GREEN);
            });
        }
    }
}
