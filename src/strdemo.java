public class strdemo {
    public static void main(String args[]) {
        String a[] = {"ami,priyanka,mimoh,darshit"};
        for (int i = 0; i < a.length; i++)
        {

            String name = a[i];
            for (int j = 0; j < name.length(); j++)
            {

                System.out.println(name.charAt(j));
                if(j%2==0)
                {
                    System.out.print(Character.toUpperCase(name.charAt(j)));
                }
                else
                {
                    System.out.print(Character.toLowerCase(name.charAt(j)));
                }



            }
        }
        System.out.println("");
    }







}
