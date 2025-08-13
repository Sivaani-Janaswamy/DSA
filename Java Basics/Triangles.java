public class Triangles {
    public static void main(String[]args)
    {
      for(int i = 1;i<=10;i++){
        for(int j = 1;j<=i;j++){
          System.out.print(j);
        }
        System.out.println();
      }
      System.out.println();

      for(int i=1;i<=10;i++){
        for(int k = 10;k>i;k--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
      System.out.println();
      int i,j,k;
      for(i=1;i<=10;i++)
       {
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         for(j = 1;j<=i;j++){
             System.out.print(j);
         }
         for(j = i-1;j>=1;j--){
             System.out.print(j);
         }
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         System.out.println();
        }
        System.out.println();

        for(i=1;i<=10;i++)
       {
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         for(j = 1;j<=i;j++){
             System.out.print(j);
         }
         for(j = i-1;j>=1;j--){
             System.out.print(j);
         }
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         System.out.println();
        }
        for(i=9;i>=1;i--)
       {
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         for(j = 1;j<=i;j++){
             System.out.print(j);
         }
         for(j = i-1;j>=1;j--){
             System.out.print(j);
         }
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         System.out.println();
        }
        System.out.println();

        for(i=1;i<=10;i++)
       {
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         for(j = 1;j<=i;j++){
             System.out.print(j);
         }
         for(j = i-1;j>=1;j--){
             System.out.print((char)(j+64));
         }
         for(k=10;k>i;k--){
             System.out.print(" ");
         }
         System.out.println();
        }
        System.out.println();

    }
}

