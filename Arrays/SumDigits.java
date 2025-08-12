public class SumDigits {
    public int sumOfDigits(int n){
        int sum = 11;
        int num = n;
        while(sum>=10)
        {
           sum = 0;
           while(num>0){
              sum+=num%10;
              num=num/10;
           }
           num = sum;
        }
        return sum;
    }
    public static void main(String[]args){
        int num = 5674;
        SumDigits sd = new SumDigits();
        int result = sd.sumOfDigits(num);
        System.out.println(result);
    }
}
