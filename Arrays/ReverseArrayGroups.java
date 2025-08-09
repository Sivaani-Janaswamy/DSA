public class ReverseArrayGroups {
    public void reverseGroups(int[] arr,int k){
        int start = 0,end, temp;
        int left, right;
        int len = arr.length;
        while(start<len){
            end = Math.min(start + k - 1, len - 1);
            left = start;                  
            right = end;
            while(left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            start+=k;
        }
    }
    public static void main(String[]args){
        ReverseArrayGroups rag = new ReverseArrayGroups();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        rag.reverseGroups(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
