package ua.artcode.fyrsenko.week2day1;

import java.util.Scanner;

/**
 * Created by admin on 01.06.16.
 */
public class Task4_06 {

    public static void main(String[] args) {

        System.out.println("Введите 2 числa");
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            int sum = a+b;
            if(sum >=11 && sum<=19) System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
