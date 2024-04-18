package dsa;

import java.util.Map;

public class HashMap {
    Map<Character,Integer> map = new java.util.HashMap<>();

    public char firstNonRepeatingChar(String str)
    {
        for (char ch : str.toCharArray())
        {
             var count = (map.containsKey(ch)) ? map.get(ch) : 0;
             map.put(ch,count+1);
        }
        for(var ch :str.toCharArray()){
            if(map.get(ch) == 1)
                return ch;
        }

          return Character.MIN_VALUE;
    }
}
