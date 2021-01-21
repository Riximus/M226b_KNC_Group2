package Classes;

import Weapons.SwordBehavior;

public class Fighter extends Player {

    SwordBehavior swordBehavior = new SwordBehavior(10);

    public Fighter() {
        this.setWeapon(swordBehavior);
    }

    public int getAttackDamage() {
        return swordBehavior.getAttackDamage();
    }

}
