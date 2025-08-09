public class ThreeGreatCandidates {
    public int maximumProduct(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }

            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
    public static void main(String[]args){
        ThreeGreatCandidates tgc = new ThreeGreatCandidates();
        int result = tgc.maximumProduct(new int[]{-10,-6,5,10,4});
        System.out.println("Maximum product of triplets: "+result);
    }
}
