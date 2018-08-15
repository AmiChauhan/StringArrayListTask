public class strdemo1 {
    public static void main(String[] args) {

        String a[] = {"ami", "darshit", "riya"};

        for (String name : a)
        {

//            System.out.println(name.charAt(0));


            for(int j = 0; j < name.length(); j++) {

                if (j == 0 || j == name.length() - 1)
                {
                    System.out.print((Character.toUpperCase(name.charAt(j))));
                } else
                    {
                    System.out.print((name.charAt(j)));
                }

            }
            System.out.println();
        }
    }
}
