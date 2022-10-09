import java.lang.*;


class Tree{

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

static class BinaryTree
{
    static int idx=-1;
    static Node BuildTree(int nodes[])
    {
       idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=BuildTree(nodes);
        newNode.right=BuildTree(nodes);

        return newNode;

    }
}
    public static void Preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }



    public static void main(String arg[])
    {
         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

         BinaryTree tree=new BinaryTree();
         Node root=tree.BuildTree(nodes);
        // System.out.println(root.data);

        Preorder(root);

    }



}