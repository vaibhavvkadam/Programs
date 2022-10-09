import java.lang.*;
import java.util.*;

class Classroom6
{
    public static void main(String arg[])
    {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};

    int activities[][]=new int[start.length][3];

    for(int i=0;i<start.length;i++)
    {
        activities[i][0]=i;
        activities[i][1]=start[i];
        activities[i][2]=end[i];
    }
    Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
    

    int maxAct=0;
    ArrayList<Integer> ans=new ArrayList<>();

    maxAct=1;
    ans.add(activities[0][0]);
    int lastEnd=activities[0][2];

    for(int i=1;i<end.length;i++)
    {
        if(activities[i][1]>=lastEnd)
        {
            maxAct++;
            ans.add(activities[i][0]);
            lastEnd=activities[i][2];

        }
    }
    System.out.println("max activites="+maxAct);

    for(int i=0;i<ans.size();i++)
    {
        System.out.print("A"+ans.get(i)+" ");
    }
    System.out.println();


    }
}