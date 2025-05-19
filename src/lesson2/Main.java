package lesson2;

public class Main {


    static String f;
    static int s = 89;

    public static final String ROOM_MATE = "Stan";

    public static void main(String[] args) {

        final int s = 55;
        System.out.println(s);


        Cat cat = new Cat();
        cat.setName("Bill");
        cat.setAge(28);

        System.out.println(cat.getName() + ":" + cat.getAge());
        System.out.println(cat);


        String name = cat.getName();
        int age = cat.getAge();


        //примитивные типы
        short rt = (short) age;
        int y = rt;
//        double rf = Double.parseDouble("23.76");
//        byte lt =Byte.parseByte("45");
//        int ji =Integer.parseInt ("123");


        byte a = (byte) y;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5;
        char f = 6;
        boolean g = true;
        double h = 7;


        //классы-обертки
        Byte j = 1;
        Short k = 2;
        Integer l = 3;
        Long m = 4L;
        Float n = 5.5f;
        Double o = 6.6;
        Character p = 'A';
        Boolean r = Boolean.TRUE;

        //строки
        String q = "Всем привет";
        String w = "55527";

        System.out.println(a);
        System.out.println(y);


    }
}
