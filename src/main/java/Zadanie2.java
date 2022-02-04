import java.util.Scanner;

public class Zadanie2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Введите три числа");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


             if (a>b && a<c && b<c) {
                System.out.println(a);
            } else if (a<b && a<c && b<c) {
                System.out.println(b);
            } else if (a<b && a<c && b>c) {
                System.out.println(c);
            } else if (a>b && a>c && b<c) {
                System.out.println(c);
            } else if (a>b && a>c && b>c) {
                System.out.println(b);
            } else if (a<b && a>c && b>c) {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println("Неверный ввод");
        }

    }
}
