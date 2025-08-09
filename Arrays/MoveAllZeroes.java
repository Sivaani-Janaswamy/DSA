public class MoveAllZeroes {
    public void moveZeroes(int[] arr){
        int count = 0;
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;

                count++;
            }
        }
       for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[]args){
        MoveAllZeroes maz = new MoveAllZeroes();
        maz.moveZeroes(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
    }
}
