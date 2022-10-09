import java.lang.*;
import java.util.*;

class absolut
{
    public static void main(String arg[])
    {
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute differance is:"+sum);
    }
}