import java.util.*;
public class kthElement{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] vis ={2,4,5,6,7};
        System.out.println("enter the element");
        int k=sc.nextInt();
        int lo=0;
        int hi=vis.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
           int correctno=mid+1;
           int missing=vis[mid]-correctno;
           if(missing>=k){
            hi=mid-1;
           }
           else{
            lo=mid+1;
        }
        }
        int ans=lo+k;
        System.out.println(ans);
        

    }
}