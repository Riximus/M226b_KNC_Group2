package Classes;

import Weapons.*;

abstract class Player {
    private static int health = 0;
    private static String characterName = "";

    /* Health */
    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }

    /* Character Name */
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String newCharacterName) {
        characterName = newCharacterName;
    }

    /* Commands */
    public void setWeapon(IWeaponBehavior weaponBehavior) {
    }

}
