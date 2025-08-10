import java.util.*;
public class Fibonacci {
    public int fibonacci(int n,Integer[] memo){
        int result;
        if(memo[n]!=null){
            return memo[n];
        }
        if(n==0 ||n==1){
            result = 1;
        }
        else{
            result = fibonacci(n-1,memo)+fibonacci(n-2,memo);
        }
        memo[n] = result;
        return result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Fibonacci fibo = new Fibonacci();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Integer[] memo = new Integer[n+1];
        int result;
        for(int i=0;i<n;i++){
            result = fibo.fibonacci(i,memo);
            System.out.print(result+" ");
        }
        sc.close();
    }

}
