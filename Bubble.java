import java.lang.*;
import java.util.*;


class Bubble
{

    public static void BubbleSort(int arr[])
    {
        for(int j=0;j<arr.length;j++)
        {
            for(int i=0;i<arr.length-j-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }



    public static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        PrintAll(arr);
    }

    public static void insertion(int arr[])
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

    public static void MergeSort(int arr[],int si,int ei)
    {
        
int mid=si+(ei-si)/2;
if(si>=ei)
{
    return;
}
MergeSort(arr,si,mid);//left
MergeSort(arr,mid+1,ei);
Merge(arr,si,mid,ei);
        
    }

    public static void Merge(int arr[],int si,int mid,int ei)
    {
int temp[]=new int[ei-si+1];
int i=si;
int j=mid+1;
int k=0;
while(i<=mid && j<=ei)
{
    if(arr[i]<arr[j])
    {
        temp[k++]=arr[i++];
    }
    else
    {
        temp[k++]=arr[j++];
    }


}
while(i<=mid)
{
    temp[k++]=arr[i++];
}
while(j<=ei)
{
    temp[k++]=arr[j++];
}

for( k=0,i=si;k<temp.length;k++,i++)
{
    arr[i]=temp[k];
}

    }

   

    public static void PrintAll(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");}
    }


    public static void QuickSort(int arr[],int si,int ei)
    {

        if(si>=ei)
        {
            return;
        }
int pidx=partition(arr,si,ei);
QuickSort(arr,si,pidx-1);
QuickSort(arr,pidx+1,ei);


    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;
      //  int temp;

        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
               int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                

            }
        }
        i++;
       int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    
    public static void main(String arg[])
    {
        int arr[]={6,3,9,5,2,8};
        // BubbleSort(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
      
        //SelectionSort(arr);
    //   insertion(arr);

    //MergeSort(arr,0,arr.length-1);
    QuickSort(arr,0,arr.length-1);
      PrintAll(arr);
    }
}