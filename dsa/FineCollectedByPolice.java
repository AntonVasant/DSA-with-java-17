package dsa;
/*Particulate matters are the biggest contributors to Delhi pollution.
 The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even
 concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be
  allowed on roads on odd dates and those with even last digit will on even dates.

Given an integer array a[], contains the last digit of the registration number of N vehicles traveling
on date D(a positive integer). The task is to calculate the total fine collected by the traffic police
department from the vehicles violating the rules.*/
public class FineCollectedByPolice {
    public int fine(int[] array,int date,int fineAmount){
        int dates = date%2;
        int totalAmount=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2 != dates)
                totalAmount +=fineAmount;
        }
        return totalAmount;
    }
}
