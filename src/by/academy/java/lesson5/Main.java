package by.academy.java.lesson5;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {


        String s = "hello, world,!!!!,";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ',') {
                count++;

            }

        }
        System.out.println("Количесвтво запятых = " + count);




//        int [] array = { 1, 2,3, 4,5,6, 67,  8, 9};
//
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        Integer t =9;
//
//        Arrays.sort(array);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        GregorianCalendar gc = new GregorianCalendar();
//        System.out.println(myC.get(myC.YEAR))+":"+myC.get(myC.MONTH)+ ":" myC.get(myC.DAY_OF_WEEK));
    }
}


