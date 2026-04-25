import java.util.*;
public class firstoccurence {
    public static void main(String[] args) {
        int arr []={1,2,2,4,4,4,6,6,6};
        int target=4;
        int n =arr.length;
        int i=0;
        int j=n-1;
        int indx=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>target){
                j=mid-1;
            }
            else if(arr[mid]<target){
                i=mid+1;
            }
            else {
                indx=mid;
                  j=mid-1;
            }

        }
              System.out.println(indx);
        }
}
