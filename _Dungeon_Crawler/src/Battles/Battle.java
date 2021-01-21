package Battles;

import Classes.Fighter;

public class Battle {

    public boolean isPlayerDead = false;

    public void startBattle(Fighter player, Enemy enemy) {
        while (player.getHealth() - enemy.getAttackDamage() >= 0 && enemy.getHealth() - player.getAttackDamage() >= 0) {
            player.setHealth(player.getHealth() - enemy.getAttackDamage());
            System.out.println("AHH! Ich wurde getroffen! Ich habe noch" + player.getHealth() + " Leben!");

            if (player.getHealth() - enemy.getAttackDamage() <= 0) {
                isPlayerDead = true;
                System.out.println("Du bist gestorben!");
                break;
            }

            //insert button listener here

            enemy.setHealth(enemy.getHealth() - player.getAttackDamage());
            System.out.println("Der Gegner hat noch " + enemy.getHealth() + " Leben!");

            if (enemy.getHealth() - player.getAttackDamage() <= 0) {
                System.out.println("Du hast deinen Gegner besiegt!");
                break;
            }

            //insert button listener here

        }
    }
}
