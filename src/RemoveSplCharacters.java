public class RemoveSplCharacters {
    public static void main(String[] args) {
        usingRegEx();
    }
    static void removeJunk(){
        String s = "Hi@My#$%Name@is%S&hi*v@ani";
        String sample="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64 && s.charAt(i)<123){
                sample=sample+s.charAt(i);
            }
        }
        System.out.println(sample);
    }
    static void usingRegEx()
    {
        String str= "Hi@My#$%Name@is%S&hi*v@ani";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str);
    }
}
