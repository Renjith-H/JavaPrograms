public class LengthOfString {
    public static void main(String[] args) {
        usingLogic();
    }
    static void usingMethod(){
        String s = "Renjith";
        System.out.println(s.length());
    }
    static void usingLogic(){
        String s = "Renjith";
        int len=0;
        char[] charArray = s.toCharArray();
        for(char character:charArray){
            len++;
        }
        System.out.println(len);
    }
}
