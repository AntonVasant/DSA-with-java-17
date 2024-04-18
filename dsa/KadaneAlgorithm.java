package dsa;

public class KadaneAlgorithm {
    public int maxSum(int array[]){
        int maxSoFar=array[0];
        int current = array[0];
        for(int i=1;i<array.length;i++){
            current = Math.max(array[i],array[i]+current);
            maxSoFar = Math.max(maxSoFar,current);
        }
        return maxSoFar;
    }
}
