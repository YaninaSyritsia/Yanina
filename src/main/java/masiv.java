public class masiv {
    public static void main (String[] args) {
        int[] nums = new int[4];
        /////////    [0][1][2][3]


        for (int i = 0; i < 4; i++) {
            nums[i] = i;
        }
        nums[3]=100;

        for (int e : nums){
            System.out.println(e);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Iteraction [" + i +"]" + nums[i]);
        }

        int table [][] = new int [3][];
        table [0] = new int [4];
        table [1] = new int [4];
        table [2] = new int [40];


    }
}
