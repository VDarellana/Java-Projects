public class BinarySearchTree {
    TreeNode root;

    // method to insert a new node with a given value
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // recursive function to insert a new value in the BST
    private TreeNode insertRec(TreeNode root, int value) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        // otherwise, recur down the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root; // return the (unchanged) node pointer
    }

    // method to check if a certain value exists in the BST
    public boolean contains(int value) {
        return containsRec(root, value);
    }

    private boolean containsRec(TreeNode root, int value) {

        if (root == null) {
            return false;
        }


        if (root.value == value) {
            return true;
        }

        if (value < root.value) {
            return containsRec(root.left, value);
        } else {
            return containsRec(root.right, value);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // insert elements into the BST
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);

        System.out.println("Does the BST contain 100? " + bst.contains(100)); // output: false
        System.out.println("Does the BST contain 3? " + bst.contains(3));     // output: true
    }
}
