package by.academy.java.lesson7.HW;

//
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String input ="https://jira.academy.com/secure/Dashboard.jspa?selectPageId=22702";
        String input2 ="http://jira.academy.com/secure/Dashboard.jspa";
        Pattern pattern = Pattern.compile ("(https|http)+(:)+(//)+(jira.academy.com/secure/Dashboard.jspa.?selectPageId=22702|jira.academy.com/secure/Dashboard.jspa)");
;       Matcher matcher = pattern.matcher(input);
        Matcher matcher2 = pattern.matcher(input2);
        boolean found = matcher.find();
        boolean found2 = matcher2.find();
        String res = matcher.group();
        String res2 = matcher2.group();
        if (found) {
            System.out.println("Found first " + res);
        } else {
            System.out.println("Not found1 ");
        }

        if (found2) {
            System.out.println("Found second " + res2);
        } else {
            System.out.println("Not found2 ");
        }
    }
}
