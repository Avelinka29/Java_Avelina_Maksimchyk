package by.academy.java.lesson7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String text ="2025/06/02";
        String [] words = text.split("-");
        for (String word : words) {
            System.out.println(word);
        }

//        String input ="+375(29)123-45-67";
//        boolean result = input.matches("(\\+375)(\\(\\d{2}\\))(\\d{3})-(\\d{2})-(\\d{2})");
//        if (result) {
//            System.out.println("phone number");
//        }else {
//            System.out.println("not phone number");
//        }

//        String input ="dfrgtyhujhgfv+375(29)123-45-67 iuhygfvgtyuiuyhgtf +375(29)123-45-67 ";
//        Pattern pattern = Pattern.compile("(\\+375)(\\(\\d{2}\\))(\\d{3})-(\\d{2})-(\\d{2})");
//        Matcher matcher = pattern.matcher(input);
//        boolean found = matcher.find();
//        String res = matcher.group();
//        int indexStart = matcher.start();
//        int indexEnd = matcher.end();
//        String replaced= matcher.replaceAll("*********");
//
//        if(found) {
//            System.out.println("found : " + res);
//            System.out.println("Start with index : " + indexStart);
//            System.out.println("End with index : " + indexEnd);
//            System.out.println(replaced);
//        }else
//            System.out.println("not found");


//        String ext =" abc xyz def ";
//        Pattern pattern = Pattern.compile("(abc|def)");
//        Matcher matcher = pattern.matcher(ext);
//
//        matcher.find();
//        System.out.println(matcher.group());



//        String input ="-123wwertg4567hgfds s89";
//        Pattern pattern = Pattern.compile("[A-Z-z0-9_]");
//        Matcher matcher = pattern.matcher(input);
//        boolean found = matcher.find();
//        String res = matcher.group();
//        //int ind =matcher.end();
//
//        if (found) {
//            System.out.println("Found "+res);
//            //System.out.println("Index: "+ind);
//        } else {
//            System.out.println("Not found ");
//        }


        String input ="alex.all@gmail.com";
      //Pattern pattern = Pattern.compile("[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@+[gmail|ya|mail]+ [.com|.ru|.eu]");
        Pattern pattern = Pattern.compile("(\\w+(\\.\\w+)*)@(gmail|ya|mail)\\.(com|ru|eu)");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.find();
        String res = matcher.group();

        if (found) {
            System.out.println("Found email: "+res);

        } else {
            System.out.println("Not found ");
        }
    }
}
