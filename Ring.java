package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring  extends Application {

    int algx;
    int algy;
    int raadius;
    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.show();

//kasutajalt sisendi küsimine
        VBox vbox = new VBox();
        Scene sisend = new Scene(vbox, 300, 200);
        stage.setScene(sisend);

        Label pealkiriAlgX = new Label("Keskpunkti x-koordinaat");
        TextField algX = new TextField();
        Label pealkiriAlgY = new Label("Keskpunkti y-koordinaat");
        TextField algY = new TextField();
        Label pealkiriRaadius = new Label("Ringi raadius");
        TextField keskpunkt = new TextField();
        Button submitButton = new Button("Joonista");

        vbox.getChildren().addAll(pealkiriAlgX, algX, pealkiriAlgY, algY, pealkiriRaadius,keskpunkt, submitButton);

        submitButton.setOnAction(event -> {
            algx = Integer.parseInt(algX.getText());
            algy = Integer.parseInt(algY.getText());
            raadius = Integer.parseInt(keskpunkt.getText());
            joonistaRing();
        });
    }
        public void joonistaRing(){
            Pane kujund = new Pane();
            Scene stseen = new Scene(kujund, 500, 500);
            stage.setScene(stseen);

            Circle ring = new Circle(algx,algy,raadius);
            kujund.getChildren().add(ring);

    }
}