import Battles.Battle;
import Battles.Enemy;
import Classes.Fighter;
import GUI.ImagePanel;
import GUI.MainScreen;
import Map.Movement;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        /* Logic test of Map Movement Save
        do {
            Movement movement = new Movement();
            Scanner scan = new Scanner(System.in);
            char input;

            System.out.println("Controls:\n'w' = forward\n'a' = turn left\n'd' = turn right\n");
            System.out.println("Your input:");
            input = scan.next().charAt(0);

            System.out.println(movement.move(input));

            System.out.println("Walking end\n");
        }while(true);*/


        /*
        Fighter fighter = new Fighter();
        Enemy enemy = new Enemy();
        Battle battle = new Battle();

        enemy.setHealth(100);
        enemy.setAttackDamage(9);
        fighter.setHealth(100);

        battle.startBattle(fighter, enemy);*/


        MainScreen mainScreen = new MainScreen();
        ImagePanel imagePanel = new ImagePanel();


        mainScreen.setjPanelPicture(imagePanel.createImageLabel("wall.png"));
        mainScreen.run();
    }
}
