import java.util.*;
public class squarerootbinarysearch {
    public static void main(String[] args) {
        long n=26;
        long indx=0;
        long lo=0;
        long hi=n;
        while(lo<=hi){
            long  mid=(lo+hi)/2;
            if(mid*mid==n){
                indx=mid;
                break;
            }
            else if(mid*mid>n){
                hi=mid-1;
            }
            else{
                lo=mid+1;
                indx=mid;
            }
        }
        System.out.println(indx);
    }
}
