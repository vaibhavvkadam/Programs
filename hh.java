import java.lang.*;

class hh
{

    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
}
    }


static class  B{

   static int idx=-1;
    public static Node buildeTree(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }

        Node newNode=new Node(nodes[idx]);
        newNode.left=buildeTree(nodes);
        newNode.right=buildeTree(nodes);

        return newNode;
    } 
}


    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inline(Node root)
    {
        if(root==null)
        {
            return;
        }
        inline(root.left);
        System.out.print(root.data+" ");
        inline(root.right);
    }

    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static int BinarySerach(int arr[],int key)
    {

        int si=0;
        int ei=arr.length-1;
        while(si<=ei)
        {
            int mid=si+(ei-si)/2;

            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                ei=mid-1;
            }
            else
            {
                si=mid+1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[])
    {
        int si=0;
        int ei=arr.length-1;
        while(si<ei)
        {
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void main(String arg[])
    {
    //     int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    //     B tree1=new B();
    //     Node root=tree1.buildeTree(nodes);
    //   //  System.out.println(root.data);
    //  // preorder(root);
    //  //inline(root);

    //  postorder(root);
    int arr[]={17,90,78,65,9};
    // int key=4;
    // System.out.println(BinarySerach(arr,key));
 for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    reverse(arr);
    System.out.println();
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
}
