public class InOrder {
    public TreeNode next(TreeNode node){
        if(node == null){
            return null;
        }
        if(node.getRight()!=null){
            return first(node.getRight());
        }else{
            while (node.getParent()!=null && node.getParent().getRight() == node){
                if(node.getParent().getLeft() == node){
                    return node.getParent();
                }
                node = node.getParent();
            }
            //node.getParent() == null
            // || node is left child of its parent
            return node.getParent();
        }
    }
    public TreeNode first(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode curNode = node;
        while (curNode.getLeft()!= null){
            curNode = curNode.getLeft();
        }
        return curNode;
    }
    public  void  traverse(TreeNode root){
        for(TreeNode node = first(root); node !=null; node=next(node)){
            System.out.print(node.getValue());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        InOrder inOrder = new InOrder();

        TreeNode sampleTree = creator.createSampleTree();
        inOrder.traverse(sampleTree);
        for(TreeNode node = inOrder.first(sampleTree);node !=null; node = inOrder.next(node)){
            System.out.print(node.getValue());
        }

    }
}
