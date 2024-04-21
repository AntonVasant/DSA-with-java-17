package dsa;

public class BoyerMooreMajority {
    public int majority(int[] array){
        int count =0;
        int candidate=0;
        for(int num : array){
            if(count ==0) {
                candidate = num;
                count=1;
            } else if (num==candidate) {
                count++;
            }else count--;
        }
        count=0;
        for(int num : array){
            if(num==candidate)
                count++;
        }
        return (count>= array.length/2)?candidate:-1;
    }
}
