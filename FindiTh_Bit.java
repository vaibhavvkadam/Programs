import java.lang.*;
import java.util.*;



class FindiTH_Bit
{

    public static int FindBit(int n,int i)
    {
int mask=1<<i;
n=n&mask;
if(n==0)
{
    return 0;
}
else{
    return 1;
}






    }
public static int SetBit(int n,int i)
{
    int mask=1<<i;
    return n|mask;
}

public static int ClearBit(int n,int i)
{
    int mask=1<<i;
    return n^mask;
}



    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
        int Num=sc.nextInt();
System.out.println("Enter number of bit which you find");
int i=sc.nextInt();
      //  System.out.println(FindBit(Num,i));
      //System.out.println(SetBit(Num,i));
      System.out.println(ClearBit(Num,i));


    }
}