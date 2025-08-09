import java.util.*;
public class KthLargest {
    public int kthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[]args){
        KthLargest kl = new KthLargest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        int result = kl.kthLargest(new int[]{20,10,15,40,45,60},k);
        System.out.printf("No.%d Largest element: %d",k,result);
        sc.close();
    }
}
