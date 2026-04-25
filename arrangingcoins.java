import java.util.*;

public class arrangingcoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coins: ");
        long n = sc.nextLong();

        long left = 0;
        long right = n;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long coinsNeeded = mid * (mid + 1) / 2;

            if (coinsNeeded == n) {
                ans = mid;
                break;
            } 
            else if (coinsNeeded < n) {
                ans = mid;      // possible answer
                left = mid + 1; // try for bigger k
            } 
            else {
                right = mid - 1; // reduce k
            }
        }

        System.out.println("Maximum complete rows: " + ans);
        
    }
}