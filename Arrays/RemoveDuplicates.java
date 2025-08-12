public class RemoveDuplicates {
    public int removeDuplicates(int[] arr){
        int k = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[]args){
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int result = rd.removeDuplicates(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nresult: "+result);
    }
}
