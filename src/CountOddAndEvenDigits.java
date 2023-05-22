public class CountOddAndEvenDigits {
    public static void main(String[] args) {
        int num = 234355812;
        int evenCount=0;
        int oddCount=0;
        int rem;
        while(num>0){
            rem=num%10;
            if(rem%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("Even count is :" +evenCount);
        System.out.println("Odd count is :" +oddCount);

    }
}
