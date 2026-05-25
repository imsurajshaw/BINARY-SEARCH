import java.util.*;
public class searchandrotatedarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr={2,3,4,5,6,7,1,2,3};
        int lo=0;
        int hi=arr.length-1;
        int idx=0;
        while(lo<=hi){
            int tar=7;
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==tar){
                idx=mid;
                break;
            }
            else if(arr[lo]<=arr[mid]){
                if(arr[lo]<=tar&&tar<=arr[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                if(arr[mid]<=tar&&tar<=arr[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
            
        } 
        System.out.print(idx);

    }
}
