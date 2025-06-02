package by.academy.java.lesson5.HW;

import java.util.Random;

public class Main {

    static public Random random = new Random();
    static public String symbols="qwertyuioplkjhgfdsazxcvbnm";


    public static String generateWord() {

        String wordReturn= " ";
        int IntRandom;
        char symb;

        for (int i = 0; i < 5; i++) {

            IntRandom= (int) (Math.random()*symbols.length());
            symb= symbols.charAt(IntRandom);
            wordReturn= wordReturn += symb;
        }
        return wordReturn;
    }

    public static Integer generateNumber() {
        Integer numbReturn= random.nextInt();
        return numbReturn;
    }

    public static void main(String[] args) {

        int [] array = {generateNumber()};


        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();



    }


}
