import java.util.Scanner;

public class Zadanie12 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите 2 числa:");

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a % 2 == 0 && b % 2 == 0) {
                System.out.println("Четные");
            } else if (a % 2 == 1 && b % 2 == 1) {
                System.out.println("Нечетные");
            } else if (a % 2 == 1 && b % 2 == 0) {
                System.out.println("Нечетное и четное");
            } else {
                System.out.println("Четное и нечетное");
            }
        } catch (Exception e) {
            System.out.println("Сказано же - ЧИСЛО введи!!!");
        }
    }
}