import java.lang.*;

import java.util.*;


class Inbuilt
{
    public static void main(String arg[])
    {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);

System.out.println(deque.getFirst());
System.out.println(deque.getLast());
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
          deque.removeLast();
           System.out.println(deque);
    }
}