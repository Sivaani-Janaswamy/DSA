public class RemoveAllOccurances {
    public int removeAllOccurances(int[] arr,int ele){
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=ele){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[]args){
        RemoveAllOccurances rao = new RemoveAllOccurances();
        int arr[] = {0, 1, 3, 0, 2, 2, 4, 2};
        int result = rao.removeAllOccurances(arr,2);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\n result: "+result);

    }
}
