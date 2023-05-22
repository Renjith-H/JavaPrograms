public class MinAndMaxValueInArray {
    public static void main(String[] args) {
        findMin();
        findMax();
    }
    static void findMin(){
        int [] arr = {10,5,8,3,56,9};
        int small = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
    static void findMax(){
        int [] arr = {10,5,8,3,56,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
