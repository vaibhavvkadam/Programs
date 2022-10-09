import java.lang.*;
import java.util.*;


class FindEO
{

    public static boolean EN_Number(int n)
    {
        int mask=1<<0;//mask creation
        n=n&mask;
        if(n==0){
            return true;
        }
        
    return false;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
    
    boolean bret;
    bret=EN_Number(n);
    if(bret==true){
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }
    }
}