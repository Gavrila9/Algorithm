import java.util.LinkedList;

public class leetCode_297 {
    //二叉树的序列化和反序列化
    //Binary tree serialize and deserialize
/**
     * Definition for a binary tree node.
 *      */
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
      }

        String COOMA = ",";
        String NULL = "#";

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            traverse(root, sb);
            return sb.toString();
        }
        public void traverse(TreeNode root, StringBuilder sb){
            if(root == null){
                sb.append(NULL).append(COOMA);
                return;
            }
            sb.append(root.val).append(COOMA);
            traverse(root.left, sb);
            traverse(root.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            LinkedList nodes = new LinkedList();
            for(String s: data.split(COOMA)){
                nodes.addLast(s);
            }
            return deserialize(nodes);
        }
        public TreeNode deserialize(LinkedList nodes){
            if(nodes.isEmpty()){
                return null;
            }
            String first = (String)nodes.removeFirst();
            if(first.equals(NULL)){
                return null;
            }
            TreeNode root = new TreeNode(Integer.valueOf(first));
            root.left = deserialize(nodes);
            root.right = deserialize(nodes);
            return root;
        }

    public static void main(String[] args) {

            leetCode_297 ser = new leetCode_297();
            leetCode_297 deser = new leetCode_297();


//            System.out.println(ser.serialize(root));
//            TreeNode ans = deser.deserialize(ser.serialize(root));
//            System.out.println(ans);
    }

}
