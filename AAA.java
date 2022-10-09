import java.util.*;


class AAA
{
    public static void main(String arg[])
    {
        ArrayList<ArrayList<Integer>> MainList=new ArrayList<>();

ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);


ArrayList<Integer> List2=new ArrayList<>();
List2.add(2);
List2.add(4);
List2.add(6);
List2.add(8);
List2.add(10);

ArrayList<Integer> List3=new ArrayList<>();
List3.add(3);
List3.add(6);
List3.add(9);
List3.add(12);
List3.add(15);

MainList.add(list);
MainList.add(List2);
MainList.add(List3);

System.out.println(MainList);

for(int i=0;i<MainList.size();i++)

{
    ArrayList<Integer> cuurList=MainList.get(i);
    for(int j=0;j<cuurList.size();j++)
    {
        System.out.print(cuurList.get(j)+" ");
    }
    System.out.println();
}



    }
}