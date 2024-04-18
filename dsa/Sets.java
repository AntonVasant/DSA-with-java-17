package dsa;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    Set<Character> set = new HashSet<>();

    public char firstRepeatingChar(String str)
    {
        for(var ch : str.toCharArray())
        {
            if(set.contains(ch))
                return ch;
            else{
                set.add(ch);
            }
        }
        return Character.MIN_VALUE;
    }
}
