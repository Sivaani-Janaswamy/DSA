import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] arr = {0,0};
        for(int i = 0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
              arr[0] = hash.get(target-nums[i]);
              arr[1] = i;
              break;
            }
            hash.put(nums[i],i);
        }
        return arr;
    }
    public static void main(String[]args){
        TwoSum ts = new TwoSum();
        int[] nums = {3,3};
        int target = 6;
        int[] result = ts.twoSum(nums, target);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
