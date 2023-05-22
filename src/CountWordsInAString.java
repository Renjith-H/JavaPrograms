public class CountWordsInAString {
    public static void main(String[] args) {
        method1();
    }
    static void method1(){
        String sentence = "Count the words in this";
        int count=1;
        for(int i=0; i<sentence.length();i++){
            if((sentence.charAt(i)==' ') && (sentence.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println(count);
    }
    static void regexMethod(){
        String sentence = "Count the words in this";
        int count = sentence.split(" ").length;
        System.out.println(count);
    }
}
