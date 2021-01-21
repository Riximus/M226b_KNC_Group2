package Story;

import java.util.Arrays;
import java.util.Scanner;

/****
 *
 * Story will count up into the newer parts of the story.
 * Like the first text field is 0 and counts up
 *
 */


public class Story {
    private static String playerName = "Hans De Fault", oldMan = "Ignis";
    Scanner scan = new Scanner(System.in);

    public void script(boolean ending) {
        int choice = -1;
        Boolean[] choiceBoolArray = new Boolean[3];
        Arrays.fill(choiceBoolArray, Boolean.FALSE);

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
            }while(choice < 1 || choice > 2);

            /* Skript: In der Höhle */
            /* Resultat A : Antwort 1 */
            if (choice == 1){
                System.out.println("Beim betreten der Höhle sieht "+playerName+" wie sie aufgebaut ist und eine erstaunlich gute Architektur besitzt.");
                System.out.println(playerName+" läuft ein bisschen tiefer in die Höhle bis zu einer Kurve. In diesem Moment hört er das Echo einer Bewegung.");
                System.out.println("Es ist unklar woher diese Geräusche stammen.");
                System.out.println("Sei es jemand oder vielleicht die Konstruktion die durch das haltende Gewicht Geräusche abgibt.");
                System.out.println("Neugierig möchte "+playerName+" um die Ecke schauen doch das Unbekannte könnte gefährlich sein.");
                System.out.println("In diesem Moment hört "+playerName+" ein starkes Schnaufen.\n");

                /* Entscheidung B */
                do {
                    System.out.println("1 - Schau um die Ecke\n" +
                            "2 - Bewege dich Richtung Eingang um die Höhle zu verlassen");
                    choice = scan.nextInt();
                }while(choice < 1 || choice > 2);

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
                System.out.println("Der Mann war eher klein und besass eine Wunde die nie richtig behandelt wurde auf der Stirn und das innere seiner rechten Hand hatte starke Brandspuren.\n");

                /* Entscheidung C */
                do {
                    do {
                        System.out.println("1 - Wer sind Sie\n" +
                                "2 - Wie haben Sie mich gefunden?\n" +
                                "3 - Wo sind wir?");

                        choice = scan.nextInt();
                    } while (choice < 1 || choice > 3);

                    /* Resultat C : Antwort 1 */
                    if(choice == 1){
                        choiceBoolArray[0] = true;
                        System.out.println(oldMan+" - \"Mein richtiger Name ist irrelevant aber in meinem altem Dorf nannten mich alle Ignis.\"");
                    }
                    /* Resultat C : Antwort 2 */
                    else if (choice == 2) {
                        choiceBoolArray[1] = true;
                        System.out.println(oldMan+" - \"Ganz ruhig. Du hast lange geschlafen seit du bewusstlos am Boden lagst in der Höhle.\"");
                        System.out.println(oldMan+" - \"Sieht aber so aus das du dich schnell genesen hast.\"");
                        System.out.println(oldMan+" - \"Ich war in der Nähe Beeren sammeln und habe Steine fallen höhren die ein Echo wiedergaben.\"");
                        System.out.println(oldMan+" - \"Da bin ich schnell dem Geräusch gefolgt und fand den Eingang und zuletzt dich.\"\n");

                        /* Entscheidung C.1 */
                        do{
                            System.out.println("1 - Was war das in der Höhle?");
                            choice = scan.nextInt();
                        }while(choice != 1);
                        System.out.println(oldMan+" - \"Ich weiss nicht was du gesehen hast. Doch die Legenden die diesen Wald beschreiben könnten doch wahr sein.\"\n");

                        /* Entscheidung C.2.1 */
                        do {
                            System.out.println("1 - Welche Legenden? Mysterien faszinieren mich.\n" +
                                    "2 - Das ist doch Schwachsinn! Legenden sind was für Kinder.");
                            choice = scan.nextInt();
                        }while(choice < 1 || choice > 2);
                        if (choice == 1){
                            System.out.println(oldMan+" - \"Es wurde vor langer Zeit über ein Biest berichtet der die Tiere des Waldes vereinigt hat um diesen Wald zu beschützen.\"");
                            System.out.println(oldMan+" - \"Doch um diese Energie zu besitzen muss er das Bewusstein eines Menschen in sich aufnehmen ...\"");
                            System.out.println(oldMan+" - \"um es den Tieren des Waldes zu verteilen um aus Ihnen eine Gemeinschaft aufzubauen.\"");
                        }
                        else{
                            System.out.println(oldMan+" - \"Mag sein das alles wie ein Märchen wirken kann.\"");
                            System.out.println(oldMan+" - \"Doch man soll behutsam sein. Den jede Legende hat mit was wahrem angefangen.\"");
                        }
                    }
                    /* Resultat C : Antwort 3 */
                    else{
                        choiceBoolArray[2] = true;
                        System.out.println(oldMan+" - \"Du bist in meiner bescheidenen Hütte nicht zu weit entfernt vom Hauptweg Richtung Norden.\"");
                    }
                }while((choiceBoolArray[0] && choiceBoolArray[1] && choiceBoolArray[2]) == false);

                System.out.println(playerName + " - Ich muss zurück und wieder auf die Spur gehen.");
                System.out.println(oldMan+" \"Es ist gefährlich und dich so schutzlos auszuliefern wäre keine gute Idee. Ich hab da was für dich.\"");
                System.out.println("Der Alte Mann verlässt kurz das Zimmer. Einige Minuten später bringt er einen Koffer mit sich.");
                System.out.println(oldMan+" \"Ich hab das hier von einem Fremden abgekauft der seit seine Familie das Kampfesleben an den Nagel gehängt haben es nicht mehr zu gebrauchen wusste.\"");
                System.out.println(oldMan+" \"Wähle eines aus dass dir den Weg erleichtern sollte.\"");
                System.out.println(playerName+" nimmt das Schwert und Schild.");
                System.out.println("Du hälst das Untarm Lange Schwert mit der rechten Hand und machst dich langsam vertraut mit dem Gewicht.");
                System.out.println("Das runde Schild besitzt eine bequeme Schlaufe und lässt sich schnell und leicht bewegen.");
                System.out.println(playerName+" trinkt das Getränk aus während Ignis erklärt wo die Höhle von seiner Hütte aus steht.");
                System.out.println("Sie geben sich noch einen schnellen Wortaustausch und der Charakter springt zur Tür.");
                System.out.println("Der Charakter bedankt sich und macht sich zielgerichtet auf dem Weg zur Höhle.");

                System.out.println("Angekommen sieht er wie der Eingang offener steht als bevor er eintrat. Mag sein das der Alte Mann sich hier durchgeschnitten hätte.");
                System.out.println("Vorsichtig macht sich "+playerName+" eine Fackel an und läuft los...");
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
            System.out.println("Mit einem entscheidenem Block der das einem in die Knie zwingt schwingt "+playerName+" den Arm des Bosses auf dem Boden.");
            System.out.println("Das Schwert wird kurz in der Luft geworfen um es zu drehen.");
            System.out.println("Mit der Klinge auf dem Boden gerichtet packt "+playerName+" den Schaft und durchbohrt den Arm mitsamt einige Zentimeter des Bodens.");
            System.out.println("Ein lautes Gebrüll erzittert den Raum.");
            System.out.println("In diesem Moment rennt "+playerName+" mit voller Wucht mit dem Schild ins Gesicht des Biestes.");
            System.out.println("Der Kontrast zur plötzlichen Stille als das Biest auf dem Boden fällt ist immens.");
        }

    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
