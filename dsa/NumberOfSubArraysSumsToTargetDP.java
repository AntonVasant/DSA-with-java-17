package dsa;

public class NumberOfSubArraysSumsToTargetDP {
    public int subSet(int[] array ,int target){
        int[] dp = new int[target+1];
        dp[0]=1;
        for(int i=0;i<array.length;i++){
            for(int j=array[i];j<=target;j++){
                dp[j]+=dp[j-array[i]];
            }
        }
        return dp[target];
    }
}
