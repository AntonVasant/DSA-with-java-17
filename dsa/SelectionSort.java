package dsa;

public class SelectionSort {
    public void sort(int[] arr){
        for(int i =0;i<arr.length;i++){
            var minIndeex = i;
            for(int j =i;j<arr.length;j++){
                if(arr[j] < arr[minIndeex]){
                    var temp = arr[j];
                    arr[j] = arr[minIndeex];
                    arr[minIndeex] = temp;
                }
            }
        }
    }
}
