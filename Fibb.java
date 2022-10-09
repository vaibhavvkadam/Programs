import java.lang.*;
import java.util.*;


class Fibb
{
    public static void fii(int a,int b)
    {
       
   if(b<60)
   {
        int temp=0;
        temp=a+b;
        System.out.println(temp);
        a=b;
        b=temp;
       fii(a,b);
      
    
   }

    }
    public static void main(String arg[])
    {
int a=0;
int b=1;
//int n=0;
fii(a,b);
    }
}