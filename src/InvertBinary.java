
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val=val;
    }
}

public class InvertBinary {

    public static TreeNode binary(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        TreeNode temp= root.left;
        root.left=binary(root.right);
        root.right=binary(temp);
        return root;
    }
    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }


    public static void main(String[] args)
    {
        TreeNode root= new TreeNode(1);
        root.left= new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.right.left=new TreeNode(5);

        inorder(root);
        binary(root);
        System.out.println(" ");
        inorder(root);

    }
}
