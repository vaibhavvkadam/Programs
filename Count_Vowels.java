import java.util.*;
import java.lang.*;


class Count_Vowels
{

public static String Count_Vowels_string(String str)
    {
StringBuilder sb=new StringBuilder("");

    String str2=str.toLowerCase();
        Integer count=0;
        for(int i=0;i<str2.length();i++)
        {

            char ch=str2.charAt(i);//imp 
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            {
                count++;
            }
        }
        return count.toString();
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
System.out.println(Count_Vowels_string(str));

    }
}