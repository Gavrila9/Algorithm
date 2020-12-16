public class TreeTraversal {
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getValue());
        inOrder(root.getRight());
    }
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue());

    }

    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        TreeTraversal traversal = new TreeTraversal();
        TreeNode testTree = creator.createSampleTree();
        traversal.preOrder(testTree);
        System.out.println();
        traversal.inOrder(testTree);
        System.out.println();
        traversal.postOrder(testTree);
        System.out.println();
        System.out.println("========");
        TreeNode tree = creator.createTree("ABDEGCF","DBGEACF");
        traversal.postOrder(tree);
        System.out.println();
    }
}
