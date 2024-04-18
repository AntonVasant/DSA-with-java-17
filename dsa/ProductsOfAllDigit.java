package dsa;

public class ProductsOfAllDigit {
    public int product(int num){
        String str = Integer.toString(num);
        int prod = 1;
        for(int i =0;i<str.length();i++){
            prod *= Character.getNumericValue(str.charAt(i));
        }
        return  prod;
    }
}
