package dsa;
/*Bob is going to bet today on horse riding. There are N horses listed in a sequence of 1 to N.

The probability of winning each horse is different so the prices for making a bet on the horses are not the same.
 There is no limit on the number of horses on which he can bet, but he thinks that if he bets on a continuous
 sequence of horses then he has a better chance to win. Bob will get K units of money if any horse on which he
  bets will win. But as the award is only K units so he wants to put money less than K. Bob wants to bet on as
  many horses as he can. As you are his best friend, he reached out to you for help, can you please find the
  length of the maximum continuous sequence of horses on which Bob can make a bet, and remember he will invest
   money less than K units. If there is more than one possible combination, Bob will bet randomly on any one of
   them.

Given the number of horses(N), reward money(K), and price of betting on N horses in order.

Hint: For each starting index of a horse, its end index in sequences will be equal to or greater than
the end index of the previous starting index.

Example 1:

Input:
90 100 -> N = 10, K=100
30 40 50 20 20 10 90 10 10 10 -> Price to make bet on each horse in order
Output:
3*/
public class Betting {
    public int sequence(int[] array,int money){
        int count=0;
        int currentCount=0;
        int first=0;
        int second=0;
        while(first< array.length){
            if(currentCount >= money){
                currentCount-=array[second++];
                continue;
            }
            currentCount+= array[first++];
            count = Math.max(count,first-second);
        }
        return count;
    }
}
