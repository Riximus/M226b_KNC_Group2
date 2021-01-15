package Map;
import Saves.SavePosition;

public class Movement {
    private static int x = 6, y = 0, viewDirection = 1; // static -> value still increases on method call
    String imageName = "";
    Map map = new Map();
    SavePosition savePosition = new SavePosition(x,y,viewDirection);

    // method: move
    public String move(char direction){
        //savePosition.setSaveX(x);
        //savePosition.setSaveY(y);
        //savePosition.setSaveViewDirection(viewDirection);

        /*-----*/
        System.out.println("Start values:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("viewDirection = " + viewDirection);
        System.out.println();
         /*---------*/
        imageName = map.getImageName(x, y, viewDirection);

        /* saves the current position of the player */
        savePosition.saveAll(x, y, viewDirection);

        /*---------*/
        System.out.println("Saved values:");
        System.out.println("saved x = " + savePosition.getSaveX());
        System.out.println("saved y = " + savePosition.getSaveY());
        System.out.println("saved viewDirection = " + savePosition.getSaveViewDirection());
        System.out.println();
        /*---------------*/


        /* checks input of the player in which direction he wants to go */
        switch (direction) {
            /* forward */
            case 'w':

                /*-----*/
                System.out.println("Direction pressed: forward (" + direction + ")");
                System.out.println();
                /*---------*/

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
            /* turn left */
            case 'a':

                /*-----*/
                System.out.println("Direction pressed: turn left (" + direction + ")");
                System.out.println();
                /*---------*/

                viewDirection--;
                if(viewDirection<0)
                    viewDirection = 3;
                break;
            /* turn right */
            case 'd':

                /*-----*/
                System.out.println("Direction pressed: turn right (" + direction + ")");
                System.out.println();
                /*---------*/

                viewDirection++;
                if(viewDirection>3)
                    viewDirection = 0;
                break;

            default:
                System.out.println("Error Message in Movement.move");
        }

        /*-----*/
        System.out.println("Changed values:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("viewDirection = " + viewDirection);

       // System.out.println("Was there a wall? = " + map.checkWall(x, y, viewDirection));
        System.out.println("\n");
        /*---------*/

        /* check if wall is infront of character
        * if false the character can move
        * else the previous position will get loaded */
        try {
            if (map.checkWall(x, y, viewDirection) == false) {
                imageName = map.getImageName(x, y, viewDirection);
                savePosition.saveAll(x, y, viewDirection);

                /*------*/
                System.out.println("no wall");
                System.out.println("New Position that got saved:");
                System.out.println("saved x = " + savePosition.getSaveX());
                System.out.println("saved y = " + savePosition.getSaveY());
                System.out.println("saved viewDirection = " + savePosition.getSaveViewDirection());
                System.out.println();
                /*--------*/
            } else {
                x = savePosition.getSaveX();
                y = savePosition.getSaveY();
                viewDirection = savePosition.getSaveViewDirection();
                //map.getImageName(x, y, viewDirection); //placeholder if the position picture doesnt stay the same somehow and we need to reload it

                /*------*/
                System.out.println("wall");
                System.out.println();
                /*--------*/
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            x = savePosition.getSaveX();
            y = savePosition.getSaveY();
            viewDirection = savePosition.getSaveViewDirection();
        }
        return imageName;
        //map.Position();
    }
}
