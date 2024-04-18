package dsa;

import java.util.HashMap;
import java.util.Map;

public class SundaysLeft {
    public int sundays(String str,int numDays){
        Map<String,Integer> map = new HashMap<>();
        map.put("sun",0);
        map.put("mon",6);
        map.put("tue",5);
        map.put("wed",4);
        map.put("thu",3);
        map.put("fri",2);
        map.put("sat",1);
        int daysLeftToSunday = map.get(str);
        int daysRemaining = numDays - daysLeftToSunday;
        int numberOfSundays = daysRemaining / 7;
        if (daysLeftToSunday + daysRemaining%7 >=7)
            numberOfSundays++;
        return  numberOfSundays;
    }
}
