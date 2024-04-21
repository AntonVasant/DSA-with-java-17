package dsa;
/*An intelligence agency has received reports about some threats.
The reports consist of numbers in a mysterious method. There is a number “N” and another number “R”.
Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are summed up and
this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered.
The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.

If the value of ‘R’ is 0, print the output as ‘0’.*/
public class Report {
    public int secret(int number1,int number2){
        int result=0;
        int result2 = 0;
        String str = String.valueOf(number1);
        for (int numberOfTimes=0;numberOfTimes<number2;numberOfTimes++) {
            for (int i = 0; i < str.length(); i++) {
                result += Character.getNumericValue(str.charAt(i));
            }
        }
        String str2 = String.valueOf(result);
        for(int i=0;i<str2.length();i++){
            result2+=Character.getNumericValue(str2.charAt(i));
        }
        String str3 = String.valueOf(result2);
        return Character.getNumericValue(str3.charAt(0));
    }
}
