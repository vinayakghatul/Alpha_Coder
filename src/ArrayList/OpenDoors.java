package ArrayList;

import java.util.Scanner;

/**
 * Given an integer A, which denotes the number of doors in a row numbered 1 to A. All the doors are closed initially.
 *
 * A person moves to and fro, changing the states of the doors as follows: the person opens a door that is already closed and closes a door that is already opened.
 *
 * In the first go, he/she alters the states of doors numbered 1, 2, 3, … , A.
 * In the second go, he/she alters the states of doors numbered 2, 4, 6 ….
 * In the third go, he/she alters the states of doors numbered 3, 6, 9 …
 * This continues till the A'th go in, which you alter the state of the door numbered A.
 *
 * Find and return the number of open doors at the end of the procedure.
 */



public class OpenDoors {

    public static int numberOfOpenDoors(int A) {
        return (int)Math.sqrt(A);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalDoors = sc.nextInt();

        System.out.println(numberOfOpenDoors(totalDoors));
    }

}
