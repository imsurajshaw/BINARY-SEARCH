import java.util.*;
public class floorinasortesdarray {
    public static void main(String[] args) {
        int arr[]={1,2,4,10,10,12,15};
        int n=arr.length;
        int x=11;
         int indx=-1;
         int i=0;
         int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>x){
                j=mid-1;
            }
            else if(arr[mid]<=x){
               indx=mid;
               i=mid+1;
            }
        }
        System.out.println(indx);
    }
}
