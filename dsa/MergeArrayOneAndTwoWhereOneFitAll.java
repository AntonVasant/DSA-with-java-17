package dsa;

public class MergeArrayOneAndTwoWhereOneFitAll {
    public void merge(int[] array1,int[] array2,int m,int n){
        int count=0;
        for(int i=m;i<array1.length;i++){
            if(count<n)
             array1[i]=array2[count++];
            else break;
        }
        for(int num : array1){
            System.out.print(num+" ");
        }
    }
}
