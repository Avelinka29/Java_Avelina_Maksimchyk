package by.academy.java.lesson8;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        //Task 1
//        int [] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 10+1);
//            System.out.println(arr[i]+ " ");
//        }
//
//        int result =0;
//        for (int j : arr){
//            result += j
//        }
//        System.out.println(result);


        //Task 2
//        int [] arr = new int[15];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 100);
//            System.out.println(arr[i]+ " ");
//        }
//
//
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//
//        }
//        System.out.println("Максимальное значение: " + max);
//
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//
//        }
//        System.out.println(": " + min);

//Task 3
//        int [] arr = new int[20];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 100);
//            System.out.println(arr[i]+ " ");
//        }
//
//        int chet=0;
//        int nechet=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                 chet++;
//            }else {
//
//                nechet++;
//            }
//        }
//        System.out.println("Четные : "+chet + "Нечетные:" +nechet);


        //Task 4

//        int [] arr = new int[20];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 20);
//            System.out.println(arr[i]+ " ");
//        }
//
//        System.out.println();
//
//        for (int i = arr.length-1; i>=0; i--) {
//            System.out.println(arr[i]+ " ");
//
//
//
//        }


        //Task5
//        int [] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 20);
//            System.out.println(arr[i]+ " ");
//        }
//            double summa = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//
//            summa += arr [i];
//            }
//
//
//            System.out.println();
//            System.out.println("summa " + summa);
//
//
//
//            double srarifm=summa/arr.length;
//            System.out.printf("srar= %.2f", srarifm);


//        //Task 6 исправить!!!!
//        int [] arr = new int[7];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 10);
//            System.out.println(arr[i]+ " ");
//        }
//
//
//        int last = arr[arr.length - 1];
//        for (int i = 0; i < arr.length; i++) {
//
//            arr [i] =[i+1];
//        }


        //System.out.println();
//        arr[0] = arr[6];
//        System.out.println(arr[6] + " ");
//        arr[1] = arr[1 + 1];
//        System.out.println(arr[2] + " ");
//        arr[2] = arr[2 + 1];
//        System.out.println(arr[3] + " ");
//        arr[3] = arr[3 + 1];
//        System.out.println(arr[4] + " ");
//        arr[4] = arr[4 + 1];
//        System.out.println(arr[5] + " ");
//        arr[5] = arr[5 + 1];
//        System.out.println(arr[6] + " ");
//        arr[6] = arr[0];
//        System.out.println(arr[0] + " ");


        //Task7 не решено

//String s = "Hello World!";
//
//if (s.isEmpty()) {
//    System.out.println( s + " is empty");
//}
//else if (s.trim().equals("")) {
//    System.out.println( s + " не пустая");
//}


//        //Task 9
//
//        String stroka ="шалаш";
//
//        String reversed = new StringBuilder(stroka).reverse().toString();
//
//
//        if (stroka.equals(reversed)) {
//            System.out.println(stroka + " является палиндромом.");
//        } else {
//            System.out.println(stroka + " не является палиндромом.");
//        }

        //Task 10

//        String stroka = "hello world from java";
//
//        String[] arr = stroka.split(" ");
//
//
//        String[] capitalizedArr = new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i].length() > 0) {
//                capitalizedArr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
//            } else {
//                capitalizedArr[i] = arr[i];
//            }
//        }
//
//
//        String result = String.join("", capitalizedArr);
//
//        System.out.println(result);

        //Task 11 kalkulator

        String znach = "5 + 6";
        System.out.println(znach);

        String[] arr = znach.split(" ");
        char[] charArray = znach.toCharArray();
        System.out.println(charArray);
































    }




        }
















