import java.lang.*;
import java.util.*;


class algorithm
{
public static void kadanas(int arr[])
    {
        int CurrentSum=0;
        int Max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
CurrentSum+=arr[i];
if(CurrentSum<0)
{
    CurrentSum=0;
}
Max=Math.max(CurrentSum, Max);

}

System.out.println("Max length of subarrays:"+Max);

    
    }



    public static void Bubble_Sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                   int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void SelectionSort(int arr[])
    {
        
for(int i=0;i<arr.length-1;i++)
{
       int minpos=i;

    for(int j=i+1;j<arr.length-1;j++)
    {
     
        if(arr[minpos]>arr[j])
        {
            minpos=j;
        }

    }
    int temp=arr[minpos];
    arr[minpos]=arr[i];
    arr[i]=temp;
}

    }

    public static void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int prev=i-1;
            int curr=arr[i];

            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=curr;
        }
    }



    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);

        int arr[]={34,89,67,43,22,10};
      //  kadanas(arr);
        //Bubble_Sort(arr);
//SelectionSort(arr);
InsertionSort(arr);

for(int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}
    }
}