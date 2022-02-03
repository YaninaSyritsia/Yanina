import java.util.Scanner;

public class Zadanie1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите число:");

            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
        } catch (Exception e) {
            System.out.println("Сказано же - ЧИСЛО введи!!!");
        }
    }
}

