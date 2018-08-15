import java.lang.reflect.Array;

public class arrdemo3 {
    public static void main(String args[]) {
        int a[] = {10, 20,33,43,22,12,11,44,23,22,11};
       int count1=0;
       int count2=0;
        for (int i = 0; i <a.length; i++)
        {

            if (a[i]% 2 == 0)
            {
                System.out.println("even" +a[i]);
                count1++;
               // System.out.println(count1);

            }
            else
                {
                    System.out.println("odd" +a[i]);
                    count2++;
                    //System.out.println(count2);
                }

            //System.out.println(i);
        }
        System.out.println( "total no of count"+count1);
        System.out.println("total no of count"+count2);
       }

}
