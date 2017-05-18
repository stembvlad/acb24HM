package week2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

/**
 * Created by Влад on 18.05.2017.
 */
public class Task2 {

    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);


        System.out.println("Please, enter 3 numbers");

        int a = scanner2.nextInt();
        int b = scanner2.nextInt();
        int c = scanner2.nextInt();

        if (a < c && a < b) {
            System.out.print(a);
            System.out.print("= min");
        } else if (b < a && b < c) {
            System.out.print(b);
            System.out.print("= min");
        } else if (c < a && c < b) {
            System.out.print(c);
            System.out.print("= min");
        }

        System.out.println();

        if (a > b && a > c) {
            System.out.print(a);
            System.out.print("= max");
        } else if (b > a && b > c){
            System.out.print(b);
            System.out.print("= max");
        } else if (c > a && c > b){
            System.out.print(c);
            System.out.print("= max");
        }


    }

}
