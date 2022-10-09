import java.util.*;


class BottomPush
{

    public static void pushAtbottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }

public static String reverse(String str)
{
Stack<Character> s=new Stack<>();
int idx=0;

while(idx<str.length())
{
   s.push(str.charAt(idx));
   idx++;
}

StringBuilder result=new StringBuilder("");

while(!s.isEmpty())
{
    char ch=s.pop();
    result.append(ch);
}

return result.toString();





}
    public static void main(String arg[])
    {
// Stack<Integer> s=new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);
// pushAtbottom(s, 4);

// while(!s.isEmpty())
// {
//     System.out.println(s.pop());

// }

String str="Hello Word";

System.out.println(reverse(str));
    }


}