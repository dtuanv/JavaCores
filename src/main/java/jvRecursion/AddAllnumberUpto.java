package jvRecursion;

public class AddAllnumberUpto {
    public static void main(String[] args){
        int result = toSum(5);
        int resultBetween = toSumBetween(3,1);
        int factorial = findFactorial(3);
        System.out.println("result: "+result);
        System.out.println("resultBetween: "+resultBetween);
        System.out.println("findFactorial"+factorial);
    }
//    When the sum() function is called,
//    it adds parameter k to the sum of all numbers smaller than k and returns the result.
//    When k becomes 0, the function just returns 0.
    public static int toSum(int upTo){
        if(upTo > 0){
            return upTo + toSum(upTo-1);
        }else{
            return 0;
//      Since the function does not call itself when k is 0, the program stops there and returns the result.
        }
    }

    public static int toSumBetween(int start, int end){
            if(start > end){
                int var;
                var = start;
                start = end;
                end = var;
            }

        if(end > start){
            return end + toSumBetween(start, end-1);
        }else{
            return end;
        }
    }
    // find factorial of a number
    public static int findFactorial(int num){
        if(num > 1){
            return num * findFactorial(num - 1);
        }else{
            return 1;
        }
    }
}
