<<<<<<< Updated upstream
package Classes;
import Weapons.*;

abstract class Player {
    private int health = 0;
    private String characterName = "";

    /* Health */
    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        health = newHealth;
    }

    /* Character Name */
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String newCharacterName){
        characterName = newCharacterName;
    }

    /* Commands */
    public void setWeapon(IWeaponBehavior weaponBehavior){}

    public int fight(){
        return 10;
    } // maybe in enemy because they start the fights?
}
=======
package Classes;
import Weapons.*;

abstract class Player {
    private int health = 0;
    private String characterName = "";

    /* Health */
    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        health = newHealth;
    }

    /* Character Name */
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String newCharacterName){
        characterName = newCharacterName;
    }

    /* Commands */
    public void setWeapon(IWeaponBehavior weaponBehavior){}

    public void fight(){} // maybe in enemy because they start the fights?

    public void walk(){} // maybe into a seperate class?
}
>>>>>>> Stashed changes
