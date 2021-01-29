package Story;

import Classes.Fighter;
import GUI.TextAreaPrintStream;
import Map.Map;

import java.util.Scanner;

public class Riddle {
    private int choice = -1;
    private static boolean choiceDone = false, buttonPressed = false, riddleButtonPressed = false;
    Scanner scan = new Scanner(System.in);
    Fighter player = new Fighter();
    TextAreaPrintStream textAreaPrintStream = new TextAreaPrintStream();

    public void bossDoor(){
        textAreaPrintStream.printText("Die Tür wirkt warm und einladend.");
        textAreaPrintStream.printText("Es fällt auf dass etwas schwarzes an der Tür abgebildet ist.");
        System.out.println("Die Tür wirkt warm und einladend.");
        System.out.println("Es fällt auf dass etwas schwarzes an der Tür abgebildet ist.");
        if(choiceDone == false) {
            do {
                System.out.println("1 - Die Tür mit einem einem Stück Stoff anfassen.\n" +
                        "2 - Die Schwarze Abbild anfassen.");
                choice = scan.nextInt();
            } while (choice < 1 || choice > 2);
            if (choice == 1) {
                System.out.println("Das Stoff zieht sich langsam zusammen und wird schwarz.");
                System.out.println("Eine Sekunde später fängt es an zu brennen.");
            } else {
                player.setHealth((player.getHealth() - 1));
                System.out.println("(-1 HP) " +
                        "Sobald die Hand kurz in Kontakt kommt mit der Tür spürt " + player.getCharacterName() + "ein brennenden Schmerz.");
            }
            choiceDone = true;
        }
    }

    public void statue(){
        // TODO Falls Zeit Rätsel erweitern und Statue Bedeutung geben
        System.out.println("Eine grosse Statue mit aufwendigen Verzierungen.");
    }

    public boolean buttons(int x){

        if(riddleButtonPressed) {
            if (x == 16) {
                riddleText();
                System.out.println("Schalter Links - Wurzeln");
                buttonPressed = riddleButtonDecision();
                if (buttonPressed) {
                    System.out.println("Der Schalter rutscht viel zu einfach rein.");
                }

            } else if (x == 17) {
                riddleText();
                System.out.println("Schalter Mitte - Leidenschaft");
                buttonPressed = riddleButtonDecision();
                if (buttonPressed) {
                    System.out.println("Der Schalter bewegt sich kein Stück.");
                }

            } else {
                riddleText();
                System.out.println("Schalter Rechts - Feuer");
                buttonPressed = riddleButtonDecision();
                if (buttonPressed) {
                    System.out.println("Mit ein bisschen mehr Kraft bewegt sich der Schalter in seine Position.");
                    System.out.println("Man hört von weiter Ferne");
                    riddleButtonPressed = true;
                    return true;
                }
            }
        }else System.out.println("Der Schalter bleibt unverändert beim drücken.");
        return false;
    }

    // vv Methoden um Wiederholungen zu vermeiden vv
    private void riddleText(){
        System.out.println("Rätsel - Je mehr es bekommt, umso hungriger wird es;");
        System.out.println("Rätsel - und hat es alles gegessen, so stirbt es.");
    }

    private boolean riddleButtonDecision(){
        do{
            System.out.println("1 - Schalter drücken\n" +
                    "2 - Die anderen Schalter ansehen");
            choice = scan.nextInt();
            if(choice == 1){
                System.out.println(player.getCharacterName() + " drückt den Schalter.");
                return true;
            }else{
                System.out.println(player.getCharacterName() + " schaut sich weiter um.");
                return false;
            }
        }while(choice < 1 || choice > 2);
    }

}
