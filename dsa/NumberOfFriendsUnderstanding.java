package dsa;
/*friends lined up and the first
 one tells to the second one about a  number and second to the third and so on whoever got it wrong return it*/
public class NumberOfFriendsUnderstanding {
    public int friends(int noFriends,int[] array){
        int correctNum = array[0];
        int len = array.length;
        int count =len-1;
        for(int i=1;i< len;i++){
            if(array[i] == correctNum){
                count--;
            }
        }
        return count;
    }
}
