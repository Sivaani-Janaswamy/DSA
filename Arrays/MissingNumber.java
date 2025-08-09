public class MissingNumber {
    public int missingNumber(int[] nums){
        int len = nums.length;
        int trueSum = (len*(len+1))/2;
        int realSum = 0;
        for(int i:nums){
            realSum+=i;
        }
        return trueSum-realSum;
    }
    public static void main(String[]args){
        MissingNumber mn = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int missing = mn.missingNumber(nums);
        System.out.println("Missing number: " + missing);
    }
}
