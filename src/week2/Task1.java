package week2;



/**
 *  @author Vladik
 */
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

       Scanner scanner1 = new Scanner(System.in);

       System.out.println ("Please, enter current time");
       int time = scanner1.nextInt();

        if(time > 18 && time <= 24 || time >= 0 && time <9) {
            System.out.println("Im resting");
        } else if(time >= 9 && time <= 18) {
            System.out.println("Im working");
        } else {
            System.out.println("Please enter time from 0 to 24");
        }

    }
}

