import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        inBubbleSort();
    }
    static void inBuiltMethod(){
        Integer arr[] = {12,10,9,56,3,44};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

    static void inBubbleSort(){
        int arr[] = {12,10,9,56,3,44};
        System.out.println("Before : "+Arrays.toString(arr));

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After : "+Arrays.toString(arr));
    }

}
