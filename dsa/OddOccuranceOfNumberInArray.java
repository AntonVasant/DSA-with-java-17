package dsa;

public class OddOccuranceOfNumberInArray {
    public int odd(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }
}
