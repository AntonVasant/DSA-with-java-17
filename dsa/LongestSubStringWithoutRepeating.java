package dsa;

import java.util.HashMap;

public class LongestSubStringWithoutRepeating {
    public int longest(String str){
        if(str == null || str.isEmpty())
            return -1;
        HashMap<Character,Integer> charMap = new HashMap<>();
        int maxLength=0;
        int startIndex=0;
        for(int current=0;current<str.length();current++){
            char currentChar = str.charAt(current);
            if(charMap.containsKey(currentChar)){
                startIndex = Math.max(startIndex,charMap.get(currentChar)+1);
            }
            charMap.put(currentChar,current);
           maxLength =Math.max(maxLength,current-startIndex+1);
        }
        return maxLength;
    }
}
