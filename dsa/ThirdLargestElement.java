package dsa;

public class ThirdLargestElement {
    public int thirdLargest(int[] array){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        if(array.length<3)
            return -1;
        for(int num : array){
            if(num > first){
                third=second;
                second=first;
                first=num;
            } else if (num > second && num != first) {
                third=second;
                second=num;
            } else if (num > third && num != first && num != second) {
                third=num;
            }
        }
        return third;
    }
}
