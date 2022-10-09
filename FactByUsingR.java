import java.lang.*;
import java.util.*;


class FactByUsingR
{

public static int Fact(int iNo)
{
    int iFact=1;
    if(iNo>0)
    {
    iFact=iNo*Fact(iNo-1);
    }
    return iFact;
}

public static int WithoutR(int No)
{
    int iFact=1;
    while(No>0)
    {
        iFact=iFact*No;
        No--;
    }
    return iFact;
}


    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int iNo=sc.nextInt();
System.out.println(WithoutR(iNo));

    }
}