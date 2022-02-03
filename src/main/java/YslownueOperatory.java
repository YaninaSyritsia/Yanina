import java.io.IOException;

public class YslownueOperatory {

    public static void main (String [] args) throws IOException {
        //char ch, answer = 'B';

        //System.out.println("Какую букву я загадала? " );
        //System.out.print("Попытайтесь ее угадать... " );

        //ch = (char)System.in.read();

        //if (ch == answer) {
            //System.out.println("WoW");
        //} else if (ch > answer) {
           // System.out.println("Перестарался");
        //} else {
            //System.out.println("Недожал");
        //}


    char month = 5;

    String monthString;

        System.out.print("введи число месяца ");

    switch (month) {
        case 1: monthString = "Январь";
            break;
        case 2: monthString = "Февраль";
            break;
        case 3: monthString = "Март";
            break;
        case 4: monthString = "Апрель";
            break;
        case 5: monthString = "Май";
            break;
        case 6: monthString = "Июнь";
            break;
        case 7: monthString = "Июль";
            break;
        case 8: monthString = "Август";
            break;
        case 9: monthString = "Сентябрь";
            break;
        case 10: monthString = "Октябрь";
            break;
        case 11: monthString = "Ноябрь";
            break;
        case 12: monthString = "Декабрь";
            break;
        default: monthString = "НЕТ ТАКОГО!!!";
            }
            System.out.println(monthString);


    }

}
