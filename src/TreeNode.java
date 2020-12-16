public class TreeNode {
    private final char value;
    private TreeNode parent;

    public char getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
        if(left != null) {
            this.left.setParent(this);
        }
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
        this.right.setParent(this);
    }

    private TreeNode left;
    private TreeNode right;

    public  TreeNode(char value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public TreeNode getParent() {
        return parent;
    }

    private void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
