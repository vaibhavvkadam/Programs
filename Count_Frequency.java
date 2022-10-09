import java.util.*;
import java.lang.*;

class Count_Frequency
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
str=str.replaceAll(" ","");
str=str.toLowerCase();
        char arr[]=str.toCharArray();

        int Frequency[]=new int[26];

        for(int i=0;i<arr.length;i++)
        {
            Frequency[arr[i]-97]++;
        }
        int iMax=Integer.MIN_VALUE;

        int ipos=0;
        for(int i=0;i<Frequency.length;i++)
        {
            if(Frequency[i]>iMax)
            {
                iMax=Frequency[i];
                ipos=i;
            }
        }
        System.out.println((char)(ipos+'a')+": occurs: "+iMax+"  times");

    }
}