public class MaximumConsecutiveOnes {
    public int contiguousSeq(int[] arr){
        int maxlen = 1, curlen = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                curlen++;
            }
            else{
                curlen = 1;
            }
            maxlen = Math.max(maxlen,curlen);
        }
        return maxlen;
    }
    public static void main(String[]args){
        MaximumConsecutiveOnes mco = new MaximumConsecutiveOnes();
        int[] arr = {1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        int result = mco.contiguousSeq(arr);
        System.out.println("Maximum consecutive ones: " + result);
    }
}
