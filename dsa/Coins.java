package dsa;

public class Coins {
    public void possibleCoins(int number) {
        int one = 0, two = 0;
        int five = (number - 4) / 5;
        if ((number-five*5) % 2 == 0) {
            one = 2;
        } else {
            one = 1;
        }
        two = (number - five * 5 - one) / 2;
        System.out.println(one);
        System.out.println(two);
        System.out.println(five);
    }
}
