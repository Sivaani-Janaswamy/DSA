import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()==nums.length){
            return false;
        }
        return true;
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = 0;j<nums.length;j++){
        //         if(nums[i]==nums[j] && i!=j){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
    public static void main(String[]args){
        ContainsDuplicate cd = new ContainsDuplicate();
        boolean result = cd.containsDuplicate(new int[]{1,2,3,4});
        System.out.println(result);

    }
}
