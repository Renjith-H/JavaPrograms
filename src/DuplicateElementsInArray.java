public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int [] arr = {12,13,14,12,13,22,23};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i] +" is duplicate");
                }
            }
        }
    }
}
