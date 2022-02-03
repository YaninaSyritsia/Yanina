import java.io.IOException;

public class cycle {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 5; i++){
            System.out.println("Iteraction " + i);
        }

        //for (int i=0; (char) System.in.read() != 'S'; i++){
           // System.out.println("Iteraction " + i);
       // }

        int count = 0;

        while (count < 10){
            System.out.println(count);
            count++;

            if(count==5) break;
        }

        //int count1 = 10;
       // do {
         //   System.out.println(count1);
        //    count1++;
      //  } while (count1 < 10);

    }
}
