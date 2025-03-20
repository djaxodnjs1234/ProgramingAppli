package src2.week2_2피보나치코드;

public class Main {
    public static void main(String[] args) {
        int sum  = recursionFibonacci(10);
        int sum2 = loopFibonacci((10));
        System.out.println(sum);
        System.out.println(sum2);
    }
    public static int recursionFibonacci(int n){
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        else{
            return recursionFibonacci(n-1) + recursionFibonacci(n-2);
        }
    }
    public static int loopFibonacci(int n){
        int one = 1;
        int two = 1;
        int result = -1;
        if(n == 1){
            return one;
        }
        else if(n==2){
            return two;
        }
        else{
            for(int i=2; i<n; i++){
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }
}
