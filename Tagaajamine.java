package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        Pane kujund = new Pane();
        Scene stseen = new Scene(kujund, 500, 500);
        primaryStage.setScene(stseen);

        Circle joonistanRingi = new Circle(100);
        joonistanRingi.setCenterX(Math.random()*500); //VÕIB KA joonistanRingi.setTranslateX(Math.random()*500);
        joonistanRingi.setCenterX(Math.random()*500); // Annab suvalise ringi keskkoha
        kujund.getChildren().add(joonistanRingi);

        joonistanRingi.setOnMouseEntered(event -> { //Cliked-vajutades, Pressed-allavajutades, Released-lahti lastes jpm
            joonistanRingi.setCenterX(Math.random()*500);
            joonistanRingi.setCenterY(Math.random()*500);
        });
    }
}