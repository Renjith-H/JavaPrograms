public class ReverseEachWordInAString {
    public static void main(String[] args) {
        reverseEachWords();
    }

    static void reverseTheSentence(){
        String s = "Reverse this sentence";
        String[] sep = s.split(" ");
        String demo = "";
        for(int i=sep.length-1; i>=0 ; i--){
            demo=demo+ " " + sep[i];
        }
        System.out.println(demo);
    }
    static void reverseEachWords(){
        String s = "Reverse this sentence";
        String[] sep = s.split(" ");
        String demo = "";
        for(String a : sep){
            String revWord ="";
            for(int i=a.length()-1; i>=0 ; i--){
                revWord=revWord+ a.charAt(i);
            }
            demo = demo+revWord + " ";
        }
        System.out.println(demo);
    }
}
