import java.lang.*;
import java.util.*;


class comparingDouble{
    public static void main(String arg[])
    {

        Integer Coins[]={1,2,5,10,20,50,100,500,2000};
int temp;
        int amount=1090;
        temp=amount;
        int count=0;
        Arrays.sort(Coins,Collections.reverseOrder());

        for(int i=0;i<Coins.length;i++)
        {
            if(Coins[i]<amount)
            {
                while(Coins[i]<=amount)
                {
                    count++;
                    System.out.print("+"+Coins[i]);
                    amount=amount-Coins[i];
                }
            }
        }
        System.out.println("="+temp);
        System.out.println("MIn no. of coins or notes are:"+count);
    }
}