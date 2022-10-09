//Backtracking

import java.lang.*;
import java.util.*;


class Backtracking
{

    public static void Back(int arr[],int i,int value)
    {
        if(i==5)
        {  
            printArr(arr);
          System.out.println();
            return;
        }
        arr[i]=value;
        Back(arr,i+1,value+1);
        arr[i]=arr[i]-2;
    }

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arg[])
    {
        int arr[]=new int[5];
        Back(arr,0,1);
        printArr(arr);
    }
}