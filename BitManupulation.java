import java.lang.*;
import java.util.*;


class BitManupulation
{


    public static int updateIthBit(int n,int i,int newBit)
    {
        if(newBit==0)
        {
            return clearbit(n,i);
        }
        else{
            return(setithbit(n,i));
        }
    }

    public static int clearbit(int n,int i)
    {
        int bitmask=1<<i;
        return n^bitmask;
         }
public static int setithbit(int n,int i)
{
    int bitmask=1<<i;

        return n|bitmask;
    
} 

public static int getithbit(int n,int i)
{
  int  itbit=1<<i;
    if((n  & itbit)==0)
    {
        return 0;
    }
    else{
        return 1;
    }
}

    public static void EvenorOdd(int N)
    {
        int BitMask=1;
        if((N&BitMask)==0)
        {
            System.out.println("Number is even:");
        }
        else
        {
            System.out.println("Number is odd:");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
      //  EvenorOdd(1);
       // EvenorOdd(2);
        //EvenorOdd(11);
//System.out.println(getithbit(10,4));

//System.out.println(setithbit(10,2));

//System.out.println(clearbit(10,3));
System.out.println(updateIthBit(10,3,10));

    }
}