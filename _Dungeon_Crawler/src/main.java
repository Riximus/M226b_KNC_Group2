import Map.Movement;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        do {
            Movement movement = new Movement();
            Scanner scan = new Scanner(System.in);
            char input;

            System.out.println("Controls:\n'w' = forward\n'a' = turn left\n'd' = turn right\n");
            System.out.println("Your input:");
            input = scan.next().charAt(0);

            System.out.println(movement.move(input));

            System.out.println("Walking end\n");
        }while(true);
    }
}
