package Story;

import Classes.Fighter;

import java.util.Scanner;

public class Riddle {
    private int choice = -1;
    Scanner scan = new Scanner(System.in);
    Fighter player = new Fighter();

    public void bossDoor(){
        System.out.println("Die Tür wirkt warm und einladend.");
        System.out.println("Es fällt auf dass etwas schwarzes an der Tür abgebildet ist.");

        do{
            System.out.println("1 - Die Tür mit einem einem Stück Stoff anfassen.\n" +
                    "2 - Die Schwarze Abbild anfassen.");
            choice = scan.nextInt();
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            System.out.println("Das Stoff zieht sich langsam zusammen und wird schwarz.");
            System.out.println("Eine Sekunde später fängt es an zu brennen.");
        }else{
            player.setHealth((player.getHealth()-1));
            System.out.println("(-1 HP) " +
                    "Sobald die Hand kurz in Kontakt kommt mit der Tür spürt "+player.getCharacterName()+"ein brennenden Schmerz.");
        }
    }

    public void statue(){

    }

    public void buttons(int x){

        if(x == 16){

        }else if(x == 17){

        }else{
            // TODO Button Texte erstellen und mit 'E' interagieren lassen. Weitere Methoden erstellen.
        }

    }

}
