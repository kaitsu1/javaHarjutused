package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {

    int algx;
    int algy;
    int loppx;
    int loppy;
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
        Label pealkiriLoppX = new Label("Lõpp-punkti x-koordinaat");
        TextField loppX = new TextField();
        Label pealkiriLoppY = new Label("Lõpp-punkti y-koordinaat");
        TextField loppY = new TextField();
        Button submitButton = new Button("Joonista");

        vbox.getChildren().addAll(pealkiriAlgX, algX, pealkiriAlgY, algY, pealkiriLoppX,loppX,pealkiriLoppY, loppY, submitButton);

        submitButton.setOnAction(event -> {
            algx = Integer.parseInt(algX.getText());
            algy = Integer.parseInt(algY.getText());
            loppx = Integer.parseInt(loppX.getText());
            loppy = Integer.parseInt(loppY.getText());
            joonistaJoon();
        });
    }
    public void joonistaJoon(){
        Pane kujund = new Pane();
        Scene stseen = new Scene(kujund, 500, 500);
        stage.setScene(stseen);

        Line joon = new Line(algx,algy,loppx, loppy);
        kujund.getChildren().add(joon);

    }
}