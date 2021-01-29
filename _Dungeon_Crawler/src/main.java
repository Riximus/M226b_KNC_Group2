import Battles.Battle;
import Battles.Enemy;
import Classes.Fighter;
import GUI.ImagePanel;
import GUI.MainScreen;
import GUI.TextAreaPrintStream;
import Map.Movement;
import Story.Story;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        /*
        remove comments to test logics
         */

        /* Story test */
        /*
        Story story = new Story();
        story.script(false); // story beginning
        story.script(true); // story ending
        */

        /* Logic test of Map Movement */
        /*do {
            Fighter fighter = new Fighter();
            Movement movement = new Movement();
            Scanner scan = new Scanner(System.in);
            char input;

            System.out.println("Controls:\n'w' = forward\n'a' = turn left\n'd' = turn right\n");
            System.out.println("Your input:");
            input = scan.next().charAt(0);

            System.out.println(movement.move(input, fighter));

            System.out.println("Walking end\n");
        }while(true);
        */


        /* Battle test */
        /*
        Fighter fighter = new Fighter();
        Enemy enemy = new Enemy();
        Battle battle = new Battle();

        enemy.setHealth(100);
        enemy.setAttackDamage(9);
        fighter.setHealth(100);

        battle.startBattle(fighter, enemy);
        */

        /* GUI start */
        MainScreen mainScreen = new MainScreen();
        mainScreen.run();
    }
}
