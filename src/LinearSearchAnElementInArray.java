public class LinearSearchAnElementInArray {
    public static void main(String[] args) {
        int a[] = {2,3,6,4,7};
        int searchEle = 4;
        boolean flag = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==searchEle){
                System.out.println("Ele found at " +i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Ele NOT found");
        }
    }
}
