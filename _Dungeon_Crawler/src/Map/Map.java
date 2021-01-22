package Map;
import Battles.*;
import Classes.Fighter;
import Story.Riddle;

public class Map {
    private String imageName = "", fileType = ".png";
    private String[][][] map={  /*0*/   {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"wall","6_0_1","wall","6_0_3"},{"wall","7_0_1","wall","7_0_3"},{"wall","8_0_1","wall","8_0_3"},{"wall","9_0_1","wall","9_0_3"},{"wall","10_0_1","wall","10_0_3"},{"11_0_0","corner_right","wall","11_0_3"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*1*/   {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"11_1_0","wall","11_1_2","wall"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*2*/   {{"0_2_0","0_2_1","corner_right","corner_left"},{"1_2_0","1_2_1","wall","1_2_3"},{"2_2_0","corner_right","corner_left","2_2_3"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"11_2_0","wall","11_2_2","wall"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*3*/   {{"0_3_0","0_3_1","0_3_2","wall"},{"1_3_0","1_3_1","1_3_2","1_3_3"},{"2_3_0","2_3_1","2_3_2","2_3_3"},{null,null,null,null},{"4_3_0","4_3_1","corner_right","4_3_3"},{"5_3_0","5_3_1","wall","5_3_3"},{"6_3_0","6_3_1","wall","6_3_3"},{"7_3_0","corner_right","corner_left","7_3_3"},{null,null,null,null},{"9_3_0","9_3_1","corner_right","corner_left"},{"10_3_0","10_3_1","wall","10_3_3"},{"11_3_0","wall","11_3_2","11_3_3"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*4*/   {{"0_4_0","0_4_1","0_4_2","wall"},{"1_4_0","1_4_1","1_4_2","1_4_3"},{"2_4_0","2_4_1","2_4_2","2_4_3"},{"3_4_0","3_4_1","3_4_2","3_4_3"},{"4_4_0","4_4_1","4_4_2","4_4_3"},{"5_4_0","5_4_1","5_4_2","5_4_3"},{"6_4_0","6_4_1","6_4_2","6_4_3"},{"7_4_0","7_4_1","7_4_2","7_4_3"},{"wall","8_4_1","wall","8_4_3"},{"9_4_0","9_4_1","9_4_2","9_4_3"},{"10_4_0","10_4_1","10_4_2","10_4_3"},{"11_4_0","wall","11_4_2","11_4_3"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*5*/   {{"0_5_0","0_5_1","0_5_2","wall"},{"1_5_0","1_5_1","1_5_2","1_5_3"},{"2_5_0","2_5_1","2_5_2","2_5_3"},{null,null,null,null},{"4_5_0","4_5_1","4_5_2","4_5_3"},{"5_5_0","5_5_1","5_5_2","5_5_3"},{"6_5_0","6_5_1","6_5_2","6_5_3"},{"7_5_0","wall","7_5_2","7_5_3"},{null,null,null,null},{"corner_left","9_5_1","9_5_2","corner_right"},{"wall","10_5_1","10_5_2","10_5_3"},{"11_5_0","wall","11_5_2","11_5_3"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*6*/   {{"corner_left","0_6_1","0_6_2","corner_right"},{"wall","1_6_1","1_6_2","1_6_3"},{"corner_right","corner_left","2_6_2","2_6_3"},{null,null,null,null},{"corner_left","4_6_1","4_6_2","corner_right"},{null,null,null,null},{"wall","6_6_1","6_6_2","6_6_3"},{"corner_right","corner_left","7_6_2","7_6_3"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"11_6_0","wall","11_6_2","wall"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*7*/   {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"11_7_0","wall","11_7_2","wall"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*8*/   {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"corner_left","11_8_1","11_8_2","corner_right"},{"wall","12_8_1","wall","12_8_3"},{"wall","13_8_1","wall","13_8_3"},{"14_8_0","corner_right","corner_left","14_8_3"},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null}},
                                /*9*/   {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"corner_left","14_9_1","14_9_2","corner_right"},{"wall","15_9_1","wall","15_9_3"},{"16_9_0","16_9_1","wall","16_9_3"},{"17_9_0","17_9_1","wall","17_9_3"},{null,null,null,null}},
                                /*10*/  {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"16_10_0","16_10_1","16_10_2","wall"},{"17_10_0","17_10_1","17_10_2","17_10_3"},{"18_10_0","wall","18_10_2","18_10_3"}},
                                /*11*/  {{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{null,null,null,null},{"16_11_0","16_11_1","16_11_2","wall"},{"17_11_0","17_11_1","17_11_2","17_11_3"},{"18_11_0","wall","18_11_2","18_11_3"}}
                                };
    Battle battle = new Battle();
    Riddle riddle = new Riddle();

    public String getImageName(int x, int y, int viewDirection){
        imageName = map[y][x][viewDirection];

        return imageName + fileType;
    }

    public boolean checkWall(int x, int y, int viewDirection){
        imageName = map[y][x][viewDirection];
        if(imageName == null) {
            System.out.println("There is a wall in front of you");
            return true;
        }
        else
            return false;
    }

    public void checkPosition(int x, int y, int viewDirection, Fighter player){
        battleSpawn(x, y, player);
        riddle(x, y, viewDirection);
    }

    public void battleSpawn(int x, int y, Fighter player){
        if(x == 16 && y == 9){
            Enemy enemy1 = new Enemy();
            enemy1.setHealth(100);
            enemy1.setAttackDamage(9);

            imageName = enemy1.getEnemy(0);
            // show imageName on GUI
            System.out.println(imageName);
            battle.startBattle(player, enemy1);
        }
        if(x == 2 && y == 4){
            Enemy boss = new Enemy();
            boss.setHealth(100);
            boss.setAttackDamage(9);

            imageName = boss.getEnemy(1);
            System.out.println(imageName);
            battle.startBattle(player, boss);
        }
    }

    public void riddle(int x, int y, int viewDirection){

        if(x == 4 && y == 4 && viewDirection == 3){
            riddle.bossDoor();
        }else if(x == 5 && y == 5 && viewDirection == 0){
            riddle.statue();
        }else if((x==16 || x==17 || x==18) && y==11 && viewDirection == 0){
            riddle.buttons(x);
        }
    }
}
