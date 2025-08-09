public class SmallerCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for(int i:nums){
            count[i]++;
        }
        for(int i = 1;i<101;i++){
            count[i]+=count[i-1];
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
        if(nums[i] == 0)
        {
            result[i] = 0; 
        } 
        else 
        {
            result[i] = count[nums[i] - 1];
        }
        }
        return result;
    }
    public static void main(String[]args){
        SmallerCurrentNumber scn = new SmallerCurrentNumber();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = scn.smallerNumbersThanCurrent(nums);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
