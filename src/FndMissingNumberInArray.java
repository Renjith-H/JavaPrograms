public class FndMissingNumberInArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,6,7,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int sum1=0;
        for(int i=0;i<9;i++){
            sum1=sum1+i;
        }
        System.out.println(sum1-sum);
    }
}
