package week2;

import java.util.Scanner;

/**
 * Created by Влад on 18.05.2017.
 */
// 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Please, enter number");
        double a = scanner4.nextDouble();

        if(a >= 0 && a <= 1){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

}
