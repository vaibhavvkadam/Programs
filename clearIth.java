import java.lang.*;
import java.util.*;


class clearlth
{
  public static void main(String arg[])
    {
//System.out.println(ClearIth(10,3));

//System.out.println(checkNumber(3));
//System.out.println(checkSetBit(15));

//System.out.println(FastExpontion(3,2));

//Bit(70);

//int a=10;
//int b=5;
//System.out.println("Before swap:"+a+" "+b);
//swap(a,b);
//add(35);
//Uppercase();
System.out.println(isPrime(21));
    }
    public static int ClearIth(int no,int i)
    {
        int Mask=~(1<<i);

        return no&Mask;
        




    }

   
    public static boolean checkNumber(int n)
    {
        return (n&(n-1))==0;
    }

    public static int checkSetBit(int n)
    {
        int count=0;
        while(n>0){
            if((n&1)!=0)
            count++;

            n=n>>1;
        }
        return count;
    }

    public static int FastExpontion(int a,int n)
    {



        int ans=1;
  
        while(n>0)
        {

            if((n&1)!=0)
            {
            ans=ans*a;
            }
            a=a*a;
        n=n>>1;
        }
        return ans;
        


    }
    public static void Bit(int n)
    {
        System.out.println(n^n);
    }
    public static void swap(int a,int b)
    {

a=a^b;
b=a^b;
a=a^b;
System.out.println("After swapping is:"+a+"  "+b);

    }

    public static void add(int n)
    {
        System.out.println(-~n);
    }
    public static void Uppercase()
    {
        for(char ch='A';ch<='Z';ch++)
        {
            System.out.print((char)(ch|' '));
        }
    }

public static boolean isPrime(int n)
{
    for(int i=2;i<n/2;i++)
    {
        if(n%i==0)
        {
return false;
        }
    }
    return true;
}
    
  
}