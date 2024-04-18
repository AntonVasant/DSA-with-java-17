package dsa;

public class LongestPrefixStringArray {
    public String prefix(String[] array){
        String prefi = array[0];
        for(int i=1;i< array.length;i++){
            while(array[i].indexOf(prefi) !=0){
                prefi = prefi.substring(0,prefi.length()-1);
                if(prefi.isEmpty())
                    return " ";
            }
        }

        return prefi;
    }
}
