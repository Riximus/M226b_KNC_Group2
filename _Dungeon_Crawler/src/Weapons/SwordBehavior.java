package Weapons;

public class SwordBehavior implements IWeaponBehavior {
    private int attackDamage;

    public SwordBehavior(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
