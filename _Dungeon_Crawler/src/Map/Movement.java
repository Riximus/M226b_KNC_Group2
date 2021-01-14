package Map;
import Saves.SavePosition;

public class Movement {
    private int x = 6, y = 0, viewDirection = 1;
    Map map = new Map();
    SavePosition savePosition = new SavePosition(x,y,viewDirection);

    public void move(char direction){
        //savePosition.SavePosition(x, y, viewDirection);
        //savePosition.setSaveX(x);
        //savePosition.setSaveY(y);
        //savePosition.setSaveViewDirection(viewDirection);
        savePosition.saveAll(x, y, viewDirection);

        switch (direction) {
            case 'w':
                switch (viewDirection){
                    case 0:
                        y++;
                        break;

                    case 1:
                        x++;
                        break;

                    case 2:
                        y--;
                        break;

                    case 3:
                        x--;
                        break;

                    default:
                        System.out.println("Error Message in Movement.move case 'w'");
                }
                break;

            case 'a':
                viewDirection--;
                if(viewDirection<0)
                    viewDirection = 3;
                break;

            case 'd':
                viewDirection++;
                if(viewDirection>3)
                    viewDirection = 0;
                break;

            default:
                System.out.println("Error Message in Movement.move");
        }
        /* check if wall is infront of character
        * if false the character can move
        * else the previous position will get loaded */
        if(map.checkWall(x, y, viewDirection) == false) {
            map.getImageName(x, y, viewDirection);
            savePosition.saveAll(x, y, viewDirection);
        }
        else{
            x = savePosition.getSaveX();
            y = savePosition.getSaveY();
            viewDirection = savePosition.getSaveViewDirection();
            //map.getImageName(x, y, viewDirection); //placeholder if the position picture doesnt stay the same somehow and we need to reload it
        }
        //map.Position();
    }
}
