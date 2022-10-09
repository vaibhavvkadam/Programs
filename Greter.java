import java.util.*;


class Greter
{

    public static void main(String arg[])
    {

int arr[]={4,6,7,1,2,0};
Stack<Integer> s=new Stack<>();

int nxtGreter[]=new int[arr.length];


for(int i=arr.length-1;i>=0;i--)
{
    while(!s.isEmpty() && arr[s.peek()]<=arr[i])
    {
        s.pop();
    }
    if(s.isEmpty())
    {
        nxtGreter[i]=-1;
    }
    else
    {
        nxtGreter[i]=arr[s.peek()];
    }
    s.push(i);
}



for(int i=0;i<nxtGreter.length;i++)
{
    System.out.println(nxtGreter[i]+" ");
}
System.out.println();
    }
}