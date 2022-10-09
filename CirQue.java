import java.lang.*;



class CirQue{

    static class Queue{
        static int arr[];
static int size;
static int rear;
static int front;
        Queue(int n)
        {
            arr=new int[n];
size=n;
rear=-1;
front=-1;
        }

public static boolean isFull()
{
    return (rear+1)%size==front;
}
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }


        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }

            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }


        public static int remove()
        {

            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
int result=arr[front];

if(rear==front)
{
    rear=front=-1;
}else
{
    front=(front+1)%size;
}
return result;

        }



//          public static void printQueue()
//     {
// for(int i=0;i<=rear;i++)
// {
//     System.out.print(arr[i]+" ");
// }
// System.out.println();
//     }





    public static int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    }


   
    public static void main(String arg[])
    {
        int n=5;
// int arr[]=new int[n];



Queue ll=new Queue(5);
ll.add(1);
ll.add(2);
ll.add(3);
ll.add(8);
ll.add(11);
//ll.add(88);

while(!ll.isEmpty())
{
    System.out.print(ll.peek()+" ");
    ll.remove();
}


    }
}