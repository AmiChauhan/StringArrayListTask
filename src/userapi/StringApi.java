package userapi;


import java.util.*;
import java.lang.String;

public class StringApi {

    private Scanner getinput;
    private String[] nameStringArray;
    private int i;
    private String[] a;
    private int c, b;

    public StringApi() {
        getinput = new Scanner(System.in);
        initArray();
        choiceOperation();
        strupper();
        strlower();
        strsubstring();
    }

    private void initArray() {

        System.out.println("enter the no you want to string");
        int st = Integer.parseInt(getinput.nextLine());

        nameStringArray = new String[st];

        for (int i = 0; i < st; i++) {
            System.out.println("enter the string" + (i + 1) + ",");
            nameStringArray[i] = getinput.nextLine();
        }

        choiceOperation();
    }

    private void choiceOperation() {

        int number;

        System.out.println("choose one choice");
        System.out.println("1. Stringlength");
        System.out.println("2. Uppercase");
        System.out.println("3. Lowercase");
        System.out.println("4. substring");
        number = getinput.nextInt();

        switch (number) {

            case 1:
                strlen("hello");
                break;

            case 2:
                strupper();
                break;

            case 3:
                strlower();
                break;
            case 4:
                strsubstring();
                break;

            default:
                System.out.println("error");

        }
    }

    public int strlen(String s) {

//        for (int i = 0; i <= nameStringArray.length; i++) {
//            System.out.println("length of string:" + nameStringArray[i].length());
//        }
        return s.length();
    }

    public void strupper() {
        for (int i = 0; i <= nameStringArray.length; i++) {
            System.out.println("sting is:" + nameStringArray[i].toUpperCase());
        }
    }


    private void strlower() {
        for (int i = 0; i <= nameStringArray.length; i++) {
            System.out.println("sting is:" + nameStringArray[i].toLowerCase());

        }
    }

    private void strsubstring() {
        int c, b;
        c = getinput.nextInt();
        b = getinput.nextInt();
        for (int i = 0; i <= nameStringArray.length; i++) {
            System.out.println("string is:" + nameStringArray[i].substring(c, b));
        }
    }

}






