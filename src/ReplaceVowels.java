public class ReplaceVowels {
    public static void main(String[] args) {
        replaceUsingRegex();
    }

    static void replace(){
        String s = "Welcome to Java";
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i') || (s.charAt(i)=='o') || (s.charAt(i)=='u')){
                c[i] = '*';
            }
        }
        System.out.println(c);
    }
    static void replaceUsingRegex(){
        String s = "Welcome to Java";
        System.out.println(s.replaceAll("[AEIOUaeiou]", "*")); //for $ we need to use \\$
    }
}
