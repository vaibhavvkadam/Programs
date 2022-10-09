import java.lang.*;
import java.util.*;


class armstrong_1to100
{
    public static void Armstrong_Number(int No)
    {
        for(int j=No;j<=500;j++)
        {

int i=j;
        int temp=j;
        int Sum=0;
        while(i>0)
        {
            int Digit=i%10;
            Sum+=(Digit*Digit*Digit);
            i=i/10;
        }
        if(Sum==temp)
        {
            System.out.print(Sum+" ");
        }
      
    }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int No=sc.nextInt();

        Armstrong_Number(No);
      

    }
}