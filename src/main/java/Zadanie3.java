import java.util.Scanner;

public class Zadanie3 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите два числа");

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a % b == 0) {
                System.out.println("Ваше первое число делиться нацело на второе");
            } else {
                System.out.println("Ваше первое число  HE делиться нацело на второе");
            }
        } catch (Exception e) {
            System.out.println("Неправильный ввод!!!");
        }


    }
}
