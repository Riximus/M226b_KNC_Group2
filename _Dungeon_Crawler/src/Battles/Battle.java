package Battles;

import Classes.Fighter;

public class Battle {

    public boolean isPlayerDead = false;

    public void startBattle(Fighter player, Enemy enemy) {
        while (player.getHealth() >= 0 && enemy.getHealth() >= 0) {
            player.setHealth(player.getHealth() - enemy.getAttackDamage());
            System.out.println("AHH! Ich wurde getroffen! Ich habe " + enemy.getAttackDamage() + " Leben verloren!");

            // Wait for any player input to continue

            enemy.setHealth(enemy.getHealth() - player.fight());
            System.out.println("Du hasst ihm " + player.fight() + " Schaden gemacht!");
        }

        if (player.getHealth() >= 0) {
            isPlayerDead = true;
        }

        if (enemy.getHealth() >= 0) {
            System.out.println("Du hast deinen Gegner besiegt!");
        }
    }
}
