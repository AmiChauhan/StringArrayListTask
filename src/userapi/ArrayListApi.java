package userapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListApi
{

    ArrayList aa;
    private Scanner getinput;
    private int arrvalue;
    private int x;
    private int val;

    ArrayListApi() {
        aa = new ArrayList();
        getinput = new Scanner(System.in);
        choice();
    }

    public void choice() {
        int i = 0;
        System.out.println("....!select any one option!.......");
        System.out.println("...1 ADD");
        System.out.println("...2 REMOVE");
        System.out.println("...3 UPDATE");
        System.out.println("...4 SEARCH");
        System.out.println("...5 EXIT");

        System.out.println("Enter your choice");
        i = getinput.nextInt();


        switch (i) {
            case 1:
                add();
                break;
            case 2:
                remove();
                break;
            case 3:
                update();
                break;
            case 4:
                sort();
                break;
            case 5:
                exit();

        }


    }

    public int add()
    {

        System.out.println("enter the value to add in array");
        x = getinput.nextInt();
        aa.add(x);
        System.out.println(aa);
        choice();
        return 0;

        }
       public void remove()
       {
           System.out.println("the avaliable array is:");
           System.out.println(aa);
           System.out.println("enter position u want to delete");
           x=getinput.nextInt();
           aa.remove(x);
           System.out.println("after delete the array is");
           System.out.println(aa);
           choice();

       }

       public  void  update()
       {
           System.out.println("the avaliable array is:");
           System.out.println(aa);
           System.out.println("enter position and new value");
           x=getinput.nextInt();
           System.out.println("enter new value");
           val=getinput.nextInt();
           aa.set(x,val);
           System.out.println("after update the array is");
           System.out.println(aa);
           choice();



       }
       public void sort()
       {

           System.out.println("the avaliable array is:");
           System.out.println(aa);
           Collections.sort(aa);
           System.out.println("after sort the array is:");
           System.out.println(aa);

       }



        public void exit()
        {
            System.exit(0);
        }


}
