package Saves;

import Map.*;

public class SavePosition {
    Map map = new Map();

    private int saveX, saveY, saveViewDirection;

    public SavePosition(int x, int y, int viewDirection){
        this.saveX = x;
        this.saveY = y;
        this.saveViewDirection = viewDirection;
    }

    public int getSaveX() {
        return saveX;
    }

    public int getSaveY() {
        return saveY;
    }

    public int getSaveViewDirection() {
        return saveViewDirection;
    }

    public void setSaveX(int saveX) {
        this.saveX = saveX;
    }

    public void setSaveY(int saveY) {
        this.saveY = saveY;
    }

    public void setSaveViewDirection(int saveViewDirection) {
        this.saveViewDirection = saveViewDirection;
    }

    public void saveAll(int x, int y, int viewDirection){
        this.saveX = x;
        this.saveY = y;
        this.saveViewDirection = viewDirection;
    }
}