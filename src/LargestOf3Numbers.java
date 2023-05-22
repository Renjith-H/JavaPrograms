public class LargestOf3Numbers {
    public static void main(String[] args) {
        usingTernaryOperator();
    }
    static void usingLogic(){
        int a = 20, b=10,c=30;
        if(a>b && a>c){
            System.out.println(a +" is largest");
        }
        if(b>a && b>c){
            System.out.println(b +" is largest");
        }
        if(c>a && c>b){
            System.out.println(c +" is largest");
        }
    }
    static void usingTernaryOperator(){
        int a = 20, b=10,c=30;
        int largest = a>b?a:b;
        int largest1 = c>largest?c:largest;
        System.out.println(largest1 +" is largest");

    }
}
