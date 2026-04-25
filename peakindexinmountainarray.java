import java.util.*;
public class peakindexinmountainarray {
    public static void main(String[] args) {
          int arr[]={2,5,8,4,1};
          int n=arr.length;
          int indx=-1;
          int i=1;
          int j=n-2;
          while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
              indx=mid;
              break;
            }
            else if(arr[mid]<arr[mid+1]&&arr[mid]>arr[mid-1]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
          }
          System.out.println(indx);
    }
}
