public class SecondLargest {
    public int secondLargest(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i: nums){
           if(i>first){
             second = first;
             first = i;
           }
           else if(i>second && second!=first){
                second = i;
           }
        }
        return second;
    }
    public static void main(String[]args){
        SecondLargest sl = new SecondLargest();
        int secondLargestNumber = sl.secondLargest(new int[]{1,2,3,4,5});
        System.out.println("Second largest Number: "+secondLargestNumber);
    }
}
