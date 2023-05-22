import java.util.Scanner;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        regexMethod();
    }
    static void normalMethod(){
        String a = "Count the characters";
        int originalCount = a.length();
        int removalCount = a.replace("a","").length();

        int i = originalCount - removalCount;
        System.out.println(i);
    }
    static void regexMethod(){
        String s = "Count the characters";
        int count =s.replaceAll("[^a]","").length();
        System.out.println(count);
    }
}
