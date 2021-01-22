package Battles;

public class Enemy {
    private int health;
    private int attackDamage;
    private boolean status;
    private String fileType = ".jpg";

    private String[] enemy = {"rat", "boss"};

    /* Verschiedene Gegner Klassen erstellen maybe?
    *  */

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setEnemyAlive(boolean status){
        this.status = status;
    }

    public boolean getEnemyAlive(){
        return this.status;
    }

    public String getEnemy(int enemyType){
        return enemy[enemyType] + fileType;
    }
}
