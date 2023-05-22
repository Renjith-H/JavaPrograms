public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp;
        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

    }
}
