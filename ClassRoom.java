import java.util.ArrayList;
import java.util.Collections;
public class ClassRoom
{

    public static void Swap(ArrayList<Integer> List,int idx1,int idx2)
    {
int temp=List.get(idx1);
List.set(idx1,List.get(idx2));
List.set(idx2,temp);
    }
    public static void main(String arg[])
    {
        ArrayList<Integer> List=new ArrayList<>();

      
        List.add(28);
          List.add(5);
            List.add(9);
              List.add(8);
                List.add(89);
int iDx=1;
int iDx1=3;
// System.out.println(List);
// Swap(List,iDx,iDx1);
// System.out.println(List);
System.out.println(List);
Collections.sort(List);
System.out.println(List);
Collections.sort(List,Collections.reverseOrder());
System.out.println(List);
//             //    List.add(2,11);
//int remove=List.remove(2);
            //  List.set(3)
             // System.out.println(remove);
               // System.out.println(List);
//int element=List.get(2);
// List.set(2,10);
// System.out.println(List);
// System.out.println(List.contains(1));
// System.out.println(List.contains(55));

//System.out.println(List.size());

// for(int i=0;i<List.size();i++)
// {
//     System.out.print(List.get(i)+" ");
// }

//int Max=Integer.MIN_VALUE;
// for(int i=List.size()-1;i>=0;i--)
// {
//     System.out.print(List.get(i)+" ");
// }

// for(int i=0;i<List.size();i++)
// {
//     // if(List.get(i)>Max)
//     // {
//     //     Max=List.get(i);
//     // }
//     Max=Math.max(Max,List.get(i));
// }
// System.out.println(Max);
    }
}