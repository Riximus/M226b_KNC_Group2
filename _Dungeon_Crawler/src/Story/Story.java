package Story;

import java.util.Scanner;

/****
 *
 * Story will count up into the newer parts of the story.
 * Like the first text field is 0 and counts up
 *
 */


public class Story {
    private static String playerName = "Hans De Fault";
    Scanner scan = new Scanner(System.in);

    public void script(boolean ending) {
        int choice = -1;
        if (ending == false) {

            /* Name des Spielers setzen */
            System.out.println("Please set your name:");
            playerName = scan.next();

            /* Skript: Einführung */
            System.out.println(playerName + " spaziert durch den Wald um die Natur zu forschen.");
            System.out.println("Bald merkt "+ playerName +" das gewisse Indizien darauf zeigen das was grösseres unterwegs war dass" +
                    " man nicht indentifizieren kann.");
            System.out.println("Nach einer Weile der Verfolgung des Weges steht " + playerName + " vor einer Höhle mit einem dicht bewachsenem Eingang\n");

            /* Entscheidung A */
            do {
                System.out.println("1 - Betritt die Höhle\n" +
                        "2 - Lass die Höhle sein und mach deine Arbeit weiter");
                choice = scan.nextInt();
            }while(choice == 1 || choice == 2);

            /* Skript: In der Höhle */
            /* Resultat A : Antwort 1 */
            if (choice == 1){
                System.out.println("Beim betreten der Höhle sieht "+playerName+" wie sie aufgebaut ist und eine erstaunlich gute Architektur besitzt.");
                System.out.println(playerName+" läuft ein bisschen tiefer in die Höhle bis zu einer Kurve. In diesem Moment hört er das Echo einer Bewegung.");
                System.out.println("Es ist unklar woher diese Geräusche stammen.");
                System.out.println("Sei es jemand oder vielleicht die Konstruktion die durch das haltende Gewicht Geräusche abgibt.");
                System.out.println("Neugierig möchte der Charakter um die Ecke schauen doch das Unbekannte könnte gefährlich sein.");
                System.out.println("In diesem Moment hört "+playerName+" ein starkes Schnaufen.");

                /* Entscheidung B */
                do {
                    System.out.println("1 - Schau um die Ecke\n" +
                            "2 - Bewege dich Richtung Eingang um die Höhle zu verlassen");
                    choice = scan.nextInt();
                }while(choice == 1 || choice == 2);

                /* Resultat B : Antwort 1 */
                if (choice == 1){
                    System.out.println(playerName + " erblickt im Dunkeln eine grosse Gestalt. Durch das Licht leider unerkenntlich.");
                    System.out.println("Die Gestalt wird ruckartig kleiner bis man ein lautes Stampf Geräusch hört das die Wände zum zittern bringt.");
                    System.out.println("In diesem Moment als "+playerName+" sich an die Wand lehnen möchte wird man von einem Gesteinsbrocken an der Schläfe getroffen ...");
                    System.out.println("und auch das letzte spärliche Abendlicht das durch den Eingang scheint wird erloschen.");
                }
                /* Resultat B : Antwort 2 */
                else{
                    System.out.println(playerName+" wird durch das Unwissende auf seinen eigenen Puls aufmerksam gemacht ...");
                    System.out.println("und wird sich bewusst in welcher gefährlichen Lage man sich befindet.");
                    System.out.println(playerName+" tastet sich langsam aufrecht der Wand entlang und schleicht zunächst Richtung Eingang den er betrat.");
                    System.out.println("Die Wände erzittern durch ein lautes stampfendes Echo. "+playerName+" beschleunigt seine Schritte.");
                    System.out.println("Doch die letzten Lichtstrahlen der Abendsonne haben einen schiefen Stein nicht erreicht ...");
                    System.out.println("und "+playerName+" kam dem Boden näher als man sich wünscht und steht nun endgültig im dunkelm.");
                }

                /* Skript: Hütte */
                System.out.println(playerName+" erwacht mit einem dröhendem Kopf. Mit Schmerzen versucht man aufrecht zu sitzen.");
                System.out.println("Langsam nehmen die Augen die Umgebung auf und bemerkt erschrocken das der Aufenhalt nicht mehr in der Höhle ist.");
                System.out.println("Schritten und ein Klirren von Porzellan nähert sich dem Bett in dem man wohl geschlafen hat.");
                System.out.println("Ein Schalter wurde betätigt und das grelle Licht brennt sich gefühlt durch die Netzhaut.");
                System.out.println("Älterer Mann - \"Ah du bist schon wach. Wie fühlst du dich?\" sprach eine zitternde Stimme die trotzdem noch ein gutes Volumen besass.");
                System.out.println("Ein äterer Mann näherte sich mit einer Tasse die ein Duft aus Beeren und anderen Kräutern den Raum langsam einhüllte.");
                System.out.println("Der Mann war eher klein und besass eine Wunde die nie richtig behandelt wurde auf der Stirn und das innere seiner rechten Hand hatte starke Brandspuren.");

                /* Entscheidung C */
                // TODO Continue the Story with introducing the old man and the world
            }



            /* Resultat A : Antwort 2
            *  "SECRET" ENDING */
            else{
                System.out.println("Nach kurzem überlegen wäre es doch gescheiter die Arbeit noch fertig zu kriegen bevor" +
                        "die Sonne kein Licht mehr spenden kann.");
                System.out.println( playerName + " macht sich noch einige Minuten an die Arbeit bis der Weg nachhause begonnen wird.");
                System.out.println("Danke fürs spielen!");
                return; /* "SECRET" ENDING */
            }

        }else{

        }

    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
