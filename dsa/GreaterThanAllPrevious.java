package dsa;

public class GreaterThanAllPrevious {
    public int greaterNumbers(int[] arr){
        if(arr.length ==0){
            return 0;
        }
        int count =1;
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max= arr[i];
                count++;
            }
        }
        return  count;
    }
}
