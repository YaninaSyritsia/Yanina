public class Lesson5 {

    public static void main (String[] args) {
        int num1 = 3;
        int num2 = 4;

        int result = num1 + num2;

        System.out.println(result);

        System.out.println("Resultat:" + result);

        System.out.println("Resultat:" + num1 + num2);

        int num3 = 7;
        int num4 = 3;

        int result1 = num3 - num4;

        int result2 = num3 * num4;

        int result3 = num3 / num4;  //  делит целыми числами, без дробей, так как тип поля int

        int result4 = num3 % num4; // Остаток от деления: 7:3= 6 и остаток 1

        System.out.println(result1);

        System.out.println(result2);

        System.out.println(result3);

        System.out.println(result4);

        // инкрименты (++) и дикрименты (--) применяетьсяя к переменным

        int num10 = 7;
        int num11 = ++num10;
        int num12 = num11;

        int result10 = num10 * num11;

        System.out.println(num11);

        // Операции сравнения (равно ==) (не равно !=)  >= <=   && - означает И, || - означает ИЛИ

        if (num10 == num1) {
            System.out.println("Result true:");
        } else {
            System.out.println("Result false:");
        }

        if (num10 == num11 || num4 > num2) {
            System.out.println("Result true:");
        } else {
            System.out.println("Result false:");
        }






    }

}
