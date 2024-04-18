package dsa;
import java.util.HashMap;
public class IsIsomorphic {
    public boolean isomorphic(String s,String t){
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> mapping = new HashMap<>();
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char b = t.charAt(i);
            if(mapping.containsKey(c)){
                if(mapping.get(c) != b){
                    return false;
                }}
            else{
                if(map.containsKey(b))
                    return false;
                mapping.put(c,b);
                map.put(b,true);
            }}
        return true;
    }
}
