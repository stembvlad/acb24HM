package week2;

import java.util.Scanner;

/**
 * Created by Влад on 18.05.2017.
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Please, enter your number");

        int a = scanner3.nextInt();

        if (a%7 == 0){
            System.out.println(a*2);
        } else{
            System.out.println(a);
        }

    }
}
