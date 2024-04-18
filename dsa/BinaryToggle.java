package dsa;

public class BinaryToggle {
    public int binary(int num){
       return parse(num);
    }
    private int parse(int num){
        String str = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            sb.append(ch == '0' ? 1 : 0);
        }
        int number = Integer.parseInt(sb.toString(),2);
        return  number;
    }
}
