import java.lang.*;
import java.util.*;


class armstorng
{
    public static boolean Armstrong_Number(int No)
    {
        int temp=No;
        int Sum=0;
        while(No>0)
        {
            int Digit=No%10;
            Sum+=(Digit*Digit*Digit);
            No=No/10;
        }
        if(Sum==temp)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int No=sc.nextInt();

        if(Armstrong_Number(No))
        {
            System.out.println("It is armstrong number:");
        }
        else{
            System.out.println("It is not armstrong number:");
        }

    }
}