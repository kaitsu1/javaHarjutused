package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {

        int algx;
        int algy;
        int ristkylikuLaius;
        int ristkylikuKorgus;
        Stage stage;

        @Override
        public void start(Stage primaryStage) throws Exception {
            stage = primaryStage;
            primaryStage.show();

//kasutajalt sisendi küsimine
            VBox vbox = new VBox();
            Scene sisend = new Scene(vbox, 300, 200);
            stage.setScene(sisend);

            Label pealkiriAlgX = new Label("Ülemise vasaku nurga x-koordinaat");
            TextField algX = new TextField();
            Label pealkiriAlgY = new Label("Ülemise vasaku nurga y-koordinaat");
            TextField algY = new TextField();
            Label pealkiriLaius = new Label("Ristküiku laius");
            TextField laius = new TextField();
            Label pealkiriKorgus = new Label("Ristküliku kõrgus");
            TextField korgus = new TextField();

            Button submitButton = new Button("Joonista");

            vbox.getChildren().addAll(pealkiriAlgX, algX, pealkiriAlgY, algY, pealkiriLaius, laius, pealkiriKorgus, korgus, submitButton);

            submitButton.setOnAction(event -> {
                algx = Integer.parseInt(algX.getText());
                algy = Integer.parseInt(algY.getText());
                ristkylikuKorgus = Integer.parseInt(korgus.getText());
                ristkylikuLaius = Integer.parseInt(laius.getText());
                joonistaRistkylik();
            });
        }
        public void joonistaRistkylik(){
            Pane kujund = new Pane();
            Scene stseen = new Scene(kujund, 500, 500);
            stage.setScene(stseen);

            Rectangle ristkylik = new Rectangle(algx,algy,ristkylikuLaius, ristkylikuKorgus);
            kujund.getChildren().add(ristkylik);

        }
    }

