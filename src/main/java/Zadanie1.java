import java.util.Scanner;

public class Zadanie1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = sc.nextInt();

         if (a % 2 == 0) {
             System.out.println("Четное");
         } else if (a % 2 == 1) {
             System.out.println("Нечетное");
         } else {
             System.out.println("Сказано же - ЧИСЛО введи!!!");
         }

    }
}
