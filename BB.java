import java.lang.*;


class Buildbinary{

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

static class BinarySS
{

    static int idx=-1;
    public static Node BuildTree(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)5
        {
            return null;
        }

        Node newNode=new Node(nodes[idx]);
        newNode.left=BuildTree(nodes);
        newNode.right=BuildTree(nodes);

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

public static void inorder(Node root)
{
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
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

 static boolean isBST(Node root, Node l, Node r)
    {
        // Base condition
        if (root == null)
            return true;
 
        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (l != null && root.data <= l.data)
            return false;
 
        // if right node exist then check it has
        // correct data or not i.e. right node's data
        // should be greater than root's data
        if (r != null && root.data >= r.data)
            return false;
 
        // check recursively for every node.
        return isBST(root.left, l, root)
            && isBST(root.right, root, r);
    }
    public static void main(String arg[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};

        BinarySS tree=new BinarySS();
        Node root=tree.BuildTree(nodes);
      //  System.out.println(root.data);

     // preorder(root);

    // inorder(root);
   // postorder(root);
 if (isBST(root, null, null))
            System.out.print("Is BST");
        else
            System.out.print("Not a BST");
    }
}