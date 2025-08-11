public class PlusOne {
    public int[] plusOne(int[] arr){
        int carry = 1;
        int sum;
        for(int i = arr.length-1;i>=0;i--){
            sum = arr[i]+carry;
            arr[i] = sum%10;
            carry = sum/10;
        }
        if(carry>0){
            int[] newArr = new int[arr.length+1];
            newArr[0] = carry;
            System.arraycopy(arr,0,newArr,1,arr.length);
            return newArr;
        }
        return arr;
    }
    public static void main(String[]args){
        int[] arr = {9,9,9};
        PlusOne po = new PlusOne();
        int[] result = po.plusOne(arr);
        for(int i:result){
            System.out.print(i+" ");
        }

    }
}
