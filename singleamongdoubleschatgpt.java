import java.util.*;

public class singleamongdoubleschatgpt {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;

        int lo = 0;
        int hi = n - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            // Step 1: mid ko even banao
            if (mid % 2 == 1) {
                mid--;
            }

            // Step 2: pair check karo
            if (arr[mid] == arr[mid + 1]) {
                // Single right side me hai
                lo = mid + 2;
            } else {
                // Single left side me hai
                hi = mid;
            }
        }

        System.out.println("Single element is: " + arr[lo]);
    }
}