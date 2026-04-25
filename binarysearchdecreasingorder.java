import java.util.*;
public class binarysearchdecreasingorder {
    public static void main(String[] args) {
        int arr []={8,6,4,2,1};
        int n=arr.length;
        int target=2;
        int i=0;
        int j=n-1;
        int result=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>target)
                i=mid+1;
            else if(arr[mid]<target)
                j=mid-1;
            else{
                result=mid;
                break;
            }
                
        }
        System.out.print(result);
    }
}
