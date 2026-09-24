public class BinaryTreeDepth {
        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.right.right = new TreeNode(6);

            int depth = calculateDepth(root);
            System.out.println("The depth of the tree is: " + depth);

        }
        public static int calculateDepth(TreeNode node){
            if(node == null){
                return 0;
            }else{
                int leftdepth = calculateDepth(node.left);
                int rightdepth = calculateDepth(node.right);
                return Math.max(leftdepth,rightdepth) + 1;
            }
        }
}
