package dsa;

public class SeatingArrangementCombinations {
    public int combinations(int number){
        return 2* fact(number-1);
    }
    private int fact(int number){
        if(number==0)
            return 1;
        return number*(fact(number-1));
    }
}
