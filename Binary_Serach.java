import java.lang.*;
import java.util.*;

class Binary_Serach
{

public static int Binary(int arr[],int key)
{
int Start=0;
int End=arr.length-1;
int Mid=0;

while(Start<=End)
{
    Mid=(Start+End)/2;
    if(arr[Mid]==key)
    {

        return Mid;
    }
    else if(key>arr[Mid])
    {
        Start=Mid+1;
    }
    else
    {
        End=Mid-1;
    }
}
return -1;


}


    public static void main(String arg[])
    {
       
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a key value:");
            int key=sc.nextInt();
            int arr[]={10,20,30,40,50};
          System.out.println(Binary(arr,key));
        

    }
}