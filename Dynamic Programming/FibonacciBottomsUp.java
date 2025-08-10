import java.util.*;

public class FibonacciBottomsUp {
    public int fibonacciBottomUp(int n) {
        if (n == 0) return 0;  
        if (n == 1) return 1;  
        
        int[] bottom_up = new int[n + 1]; 
        bottom_up[0] = 0;
        bottom_up[1] = 1;

        for (int i = 2; i <= n; i++) {
            bottom_up[i] = bottom_up[i - 1] + bottom_up[i - 2];
        }

        return bottom_up[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciBottomsUp fbu = new FibonacciBottomsUp();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fbu.fibonacciBottomUp(i) + " ");
        }
        sc.close();
    }
}
