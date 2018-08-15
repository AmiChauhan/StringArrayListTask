public class Wrapperdemo
{

        static int a=10;
        int b= 20;

        public  void  increment()
        {

            a++;
            b++;
            System.out.println("the value of a is"+a);
            System.out.println("the value of b is "+b);


        }

    public static void main(String[] args)
    {
        Wrapperdemo aa=new Wrapperdemo();
        aa.increment();
        Wrapperdemo BB=new Wrapperdemo();
        BB.increment();
    }


    }
