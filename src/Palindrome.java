public class Palindrome {
    public static void main(String[] args) {
        palindromeNumber();
    }
    static void palindromeString(){
        String s = "Malayalam";
        String rev = "";
        int len = s.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        if(rev.equalsIgnoreCase(s)){
            System.out.println("Palindrome");
        }
    }
    static void palindromeNumber(){
        int num = 12321;
        int orgNum = num;
        int rev=0;
        int rem;
        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        if(orgNum == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}