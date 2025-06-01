package by.academy.java.HW;


import java.util.Random;

public class Main {

    static public String catName;
    static public Integer catAge;
    static public String symbols="qwertyuioplkjhgfdsazxcvbnm";
    static public Random random = new Random();


    public static String generateCatName() {

        String nameReturn= " ";
        int IntRandom;
        char symb;

        for (int i = 0; i < 5; i++) {

            IntRandom= (int) (Math.random()*symbols.length());
            symb= symbols.charAt(IntRandom);
            nameReturn= nameReturn += symb;
        }
        return nameReturn;
    }

    public static Integer getCatAge() {
        Integer AgeReturn= random.nextInt(28);
        return AgeReturn;
    }

    // задание 1
    public static void main(String[] args) {
//
//
//        String catName = generateCatName();
//        int catAge = getCatAge();
//
//        int a=0;
//        while(a<10){
//
//            Cat cat= new Cat();
//            System.out.println("Моего котика зовут " + cat.getName ()+ " и ей " + cat.getAge ()+ " годик");
//        }
//

        //задача 2


//        for (int i = 0; i < 10; i++) {
//
//            catName = generateCatName();
//            catAge = getCatAge();
//
//            Cat cat = new Cat();
//            cat.setName(catName);
//            cat.setAge(catAge);
//            System.out.println(cat.getName () + " " + cat.getAge());
//
//
//        }

        //задача 3
//        int k =0;
//        do {
//            catName = generateCatName();
//            catAge = getCatAge();
//
//            Cat cat = new Cat(catName, catAge);
//            System.out.println(cat.getName () + " " + cat.getAge());
//            k++;
//
//        } while (k < 10);


        //задача 4

        Cat[] Cats = new Cat[10];

        catName = generateCatName();
        catAge = getCatAge();

        Cats[0] = new Cat(generateCatName(), getCatAge());
        Cats[1] = new Cat(generateCatName(), getCatAge());
        Cats[2] = new Cat(generateCatName(), getCatAge());
        Cats[3] = new Cat(generateCatName(), getCatAge());
        Cats[4] = new Cat(generateCatName(), getCatAge());
        Cats[5] = new Cat(generateCatName(), getCatAge());
        Cats[6] = new Cat(generateCatName(), getCatAge());
        Cats[7] = new Cat(generateCatName(), getCatAge());
        Cats[8] = new Cat(generateCatName(), getCatAge());
        Cats[9] = new Cat(generateCatName(), getCatAge());

        for (Cat cat : Cats) {


            System.out.println(cat.getName () + " " + cat.getAge());

        }


    }}



