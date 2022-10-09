import java.lang.*;
import java.util.*;


class Altenate
{

    public static boolean Check_Alternate(int No)
    {
        int prev=No%10;
        int i=prev%2;
         No=No/10;
while(No>0)
{
    int curr=No%10;
    int j=curr%2;
    
if(i==j)
    {
        break;
    }
    i=j;
     No=No/10;
    
}


if(No==0)
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
if(Check_Alternate(No))
{
    System.out.println("It is alternate number");
}
else{
    System.out.println("It is not alternate number");
}
    }
}