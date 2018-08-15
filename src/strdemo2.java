public class strdemo2
{
    public static void main(String[] args) {
        String a[]={"ami,riya,priya"};
        for(int i=0;i<=a.length;i++)
        {

            for (String name : a) {

//            System.out.println(name.charAt(0));


                for(int j = 0; j < name.length()/2; j++) {

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

        }



