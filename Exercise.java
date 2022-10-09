import java.lang.*;


class Exercise
{

   public static class  Node
    {
int data;
Node next;

public Node(int data)
{
    this.data=data;
    this.next=null;
}
    }

public void addFirst(int data)
{
    Node newNode=new Node(data);

if(head==null)
{
    head=tail=newNode;
    return;
}
newNode.next=head;
head=newNode;

}

public void addLast(int data)
{
    Node newNode=new Node(data);
    if(head==null)
    {
        head=tail=newNode;
    }
    tail.next=newNode;
    tail=newNode;

}

public void printLL()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;

    }
}


public static Node head;
public static Node tail;

    



    public static void main(String arg[])
    {
Exercise ll=new Exercise();

ll.addFirst(1);
ll.addFirst(2);
ll.addFirst(4);
ll.addFirst(6);
ll.addFirst(8);
ll.addFirst(9);
ll.addFirst(11);


ll.addLast(33);
ll.addLast(99);
ll.printLL();



// while(head!=null)
// {
//     System.out.println(head.data);
//     head=head.next;
// }


    }
}