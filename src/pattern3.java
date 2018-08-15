public class pattern3 {

    public static void main(String args[]) {
        int z = 1;
        int n=5;

        for (int i = 1; i <= n; i++)
        {
            for (int j = n- 1; j >= i; j--) {
                System.out.print("#");
            }
            for (int k = 1; k <= z; k++) {

                System.out.print("$");
            }
            z++;
            System.out.println("");
        }
    }
}

