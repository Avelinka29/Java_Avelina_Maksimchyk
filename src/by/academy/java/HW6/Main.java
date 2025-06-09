package by.academy.java.HW6;

import java.util.Random;

public class Main {

    static public Random random = new Random();
    static public String symbols = "qwertyuioplkjhgfdsazxcvbnm";


    public static String generateWord() {
        StringBuilder wordReturn = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int IntRandom = random.nextInt(symbols.length());
            char symb = symbols.charAt(IntRandom);
            wordReturn.append(symb);
        }
        return wordReturn.toString();
    }

    public static void main(String[] args) {
        Object[][] matrix = new Object[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i * 10 + j) % 3 == 0) {
                    matrix[i][j] = Math.round(random.nextDouble() * 100000.0) / 100000.0;
                } else {
                    matrix[i][j] = generateWord();
                }
            }
        }

        System.out.println("Матрица 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-10s ", matrix[i][j]); // Форматированный вывод
            }
            System.out.println(); // Переход на новую строку после каждой строки матрицы
        }
    }
}
