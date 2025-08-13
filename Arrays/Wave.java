public class Wave {
    public void createWave(int[] arr){
        int temp;
        for(int i = 0; i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]<arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            else{
                if(arr[i]>=arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Wave wv = new Wave();
        int[] arr = {2, 4, 7, 8, 9, 10};
        wv.createWave(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
