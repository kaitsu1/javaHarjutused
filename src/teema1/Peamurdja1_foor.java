package teema1;


import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Kasuta objekti Foor, et teha valgusfoori tsükkel 5 korda.
 * Foori kasutusjuhend: https://github.com/KristerV/javaHarjutused
 *
 * Abiks on "Naidis_KollaneVilkuja" klass, kus on juba kollane tuli vilkuma pandud.
 * Lisaks tuleb teada, et Foor on JavaFX programm. Tavalise programmiga
 * on kaks erinevust: klass peab laiendama (extends) teist klassi nimega
 * Application ja programm mitte ei alga main() meetodi seest, vaid
 * hoopis start() meetodi seest. Vaata Naidis_KollaneVilkuja näidet. Muide,
 * kui "extends Application" õigesse kohta ära kirjutad siis Intellij
 * pakub sulle, et kirjutab ise start() meetodi õigesti ära - proovi järgi.
 *
 * NB! Kui kirjutad new Foor(); siis IDE pakub sulle Foori importimise võimalust.
 * Kliki punase teksti peale ja vajuta alt+enter.
 */
public class Peamurdja1_foor extends Application
{

    public void start(Stage primaryStage) throws Exception
    {
        Foor foor = new Foor();


        for (int i = 0; i < 5; i++) {
            performRed(foor);
            performYellow(foor, "down");
            performGreen(foor);
            performYellow(foor, "up");
        }
    }

    private void performRed(Foor foor)
    {
        foor.vahetaPunast();
        foor.paus(3);
    }

    private void performYellow(Foor foor, String cicle)
    {
        if (cicle.equals("down")) {
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.vahetaPunast();
        } else if (cicle.equals("up")) {
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
    }
    }

    private void performGreen(Foor foor)
    {
        foor.vahetaRohelist();
        foor.paus(1.0);
        foor.vahetaRohelist();

        for (int i = 0; i < 6; i++)
        {
            foor.vahetaRohelist();
            foor.paus(0.5);
        }

        foor.vahetaRohelist();
    }
}