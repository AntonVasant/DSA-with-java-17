package dsa;

public class SecondLargestInArray {
    public int second(int[] array){
        int first=0;
        int secondLargest=0;
        for(int num : array){
            if(num>first){
                secondLargest=first;
                first=num;
            } else if (num>secondLargest && num !=first) {
                secondLargest=num;
            }
        }
        return  secondLargest;
    }
}
