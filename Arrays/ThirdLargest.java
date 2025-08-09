public class ThirdLargest {
    public int thirdLargest(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i: nums){
            if(i>first){
                third = second;
                second = first;
                first = i;
            }
            else if(i>second && i!=first){
                third = second;
                second = i;
            }
            else if(i>third && i!=second && i != first){
                third = i;
            }
        }
        return third;
    }
    public static void main(String[]args){
        ThirdLargest tl = new ThirdLargest();
        int result = tl.thirdLargest(new int[]{10,20,13,14,55,60});
        System.out.println("Third largest number is: "+result);
    }
}
