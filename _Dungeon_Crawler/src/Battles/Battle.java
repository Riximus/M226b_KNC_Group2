package Battles;

import Classes.Fighter;

public class Battle {

    private boolean isPlayerDead = false;

    public void startBattle(Fighter fighter, Enemy enemy) {
        while (fighter.getHealth() - enemy.getAttackDamage() >= 0 && enemy.getHealth() - fighter.getAttackDamage() >= 0) {
            fighter.setHealth(fighter.getHealth() - enemy.getAttackDamage());
            System.out.println("AHH! Ich wurde getroffen! Ich habe noch" + fighter.getHealth() + " Leben!");

            if (fighter.getHealth() - enemy.getAttackDamage() <= 0) {
                isPlayerDead = true;
                System.out.println("Du bist gestorben!");
                break;
            }

            //insert button listener here

            enemy.setHealth(enemy.getHealth() - fighter.getAttackDamage());
            System.out.println("Der Gegner hat noch " + enemy.getHealth() + " Leben!");

            if (enemy.getHealth() - fighter.getAttackDamage() <= 0) {
                System.out.println("Du hast deinen Gegner besiegt!");
                break;
            }

            //insert button listener here

        }
    }

    public boolean getIsPlayerDead() {
        return isPlayerDead;
    }
}
