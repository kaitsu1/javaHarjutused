package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        Pane kujund = new Pane();
        Scene stseen = new Scene(kujund, 500, 500);
        primaryStage.setScene(stseen);


        ArrayList<Circle> list = new ArrayList<>();   //ringide moodustamine
        for (int i = 0; i <400; i++) {
            Circle joonistanRingi = new Circle(50); // raadius 50 võib ka  Circle joonistanRingi = new Circle(100, 100, 50), siis pole 2 järgmist rida vaja
            joonistanRingi.setCenterX(50+Math.random()*400); //50 sest raadius50, ei jää ääre taha ja 400+50=450, ei jää 500se stseeni ääre taha
            joonistanRingi.setCenterY(50+Math.random()*400);
            kujund.getChildren().add(joonistanRingi); // kutusb välja ringi
            list.add( joonistanRingi); //arraylist vaja saada ringid
            joonistanRingi.setFill(Color.BLUE); //värv
        }
        for (int i = 0; i <list.size() ; i++) { // tsükkel käib array läbi
            Circle tsekinRingi = list.get(i); // hakkab järjest võtma elemente 0,1,2
            tsekinRingi.setOnMouseEntered(event -> {  //kui hiirega vastu lähen, siis leiab ringi
                tsekinRingi.setVisible(false);; //muudan nähtamatuks, (muutub läbipaistvaks-EI SAA transparentiga, siis ei kustuta alumisi)
            });
        }
    }
}