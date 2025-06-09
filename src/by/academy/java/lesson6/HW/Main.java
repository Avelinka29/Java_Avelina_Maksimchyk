package by.academy.java.lesson6.HW;

import java.util.Random;

public class Main {

    static public Random random = new Random();
    static public String symbols = "qwertyuioplkjhgfdsazxcvbnm";

    public static String generateWord() {
        StringBuilder wordReturn = new StringBuilder();
        int IntRandom;
        char symb;

        for (int i = 0; i < 7; i++) {
            IntRandom = random.nextInt(symbols.length());
            symb = symbols.charAt(IntRandom);
            wordReturn.append(symb);
        }
        return wordReturn.toString();
    }

    public static Double generateDouble() {
        return Math.round(random.nextDouble() * 10000000.0) / 10000000.0;
    }

    public static void main(String[] args) {
        int n = 10;
        Object[][] a = new Object[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i * n + j) % 3 == 0) {
                    a[i][j] = generateDouble();
                } else {
                    a[i][j] = generateWord();
                }
            }
        }

        System.out.println("Первоначальная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        Object[] mainDiagonal = new Object[n];
        Object[] secondaryDiagonal = new Object[n];

        for (int i = 0; i < n; i++) {
            mainDiagonal[i] = a[i][i];
            secondaryDiagonal[i] = a[i][n - 1 - i];
        }

        boolean areDiagonalsEqual = true;
        for (int i = 0; i < n; i++) {
            if (!mainDiagonal[i].equals(secondaryDiagonal[i])) {
                areDiagonalsEqual = false;
                break;
            }
        }

        System.out.println("Главная диагональ: ");
        for (Object elem : mainDiagonal) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("Побочная диагональ: ");
        for (Object elem : secondaryDiagonal) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("Диагонали равны: " + areDiagonalsEqual);

        Object[] newArray = new Object[n];

        for (int i = 0; i < n; i++) {
            if (mainDiagonal[i] instanceof String) {
                String strValue = (String) mainDiagonal[i];
                String substring = strValue.substring(1, 4);
                newArray[i] = substring;
            } else if (mainDiagonal[i] instanceof Double) {
                Double doubleValue = (Double) mainDiagonal[i];
                long roundedValue = Math.round(doubleValue);
                newArray[i] = roundedValue;
            }
        }

        System.out.println("Новый массив:");
        StringBuilder sb = new StringBuilder();
        for (Object elem : newArray) {
            if (elem instanceof String) {
                sb.append(elem).append(", ");
            } else if (elem instanceof Long) {
                sb.append(elem).append("_");
            }
        }
//
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
            System.out.println("Строки: " + sb.toString());

            sb.setLength(0);

            for (Object elem : newArray) {
                if (elem instanceof Long) {
                    sb.append(elem).append("_");
                }
            }

            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
                System.out.println("Числа: " + sb.toString());
            }
        }
    }
}