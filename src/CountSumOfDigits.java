public class CountSumOfDigits {
    public static void main(String[] args) {
        int num = 34558;
        int sum=0;
        int rem;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
