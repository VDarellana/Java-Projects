/**
 * @author Victor Daniel Arellana Assia
 * Date: 07/23/2026
 * Course: CS 1027
 * Assignment 4 - BinarySearchTree
 */

import java.util.ArrayList;

public class BinarySearchTree {
    TreeNode root;

    // Inserts a new value into binary search tree
    public void addNode(int value){
        root = addRecursive(root,value);
    }

    //Recursively finds the correct empty spot for value and inserts it there
    private TreeNode addRecursive(TreeNode current, int value){
        if(current == null){
            //If empty spot found new node belongs here
            return new TreeNode(value);
        }
        if(value < current.value){
            current.leftChild = addRecursive(current.leftChild, value);
        }else if(value > current.value){
            current.rightChild = addRecursive(current.rightChild, value);
        }
        // if value == current.value then its a duplicate
        return current;
    }

    // Counts total amount of nodes in the tree
    public int getNodeCount(){
        return countRecursive(root);
    }

    private int countRecursive(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + countRecursive(node.leftChild) + countRecursive(node.rightChild);
    }

        // Performs a breadth first traversal of the tree
    public ArrayList<Integer> bfsTraversal(){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
         // Using an arraylist as a simple First in first out queue 
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.remove(0);
            result.add(current.value);
            if(current.leftChild!= null){
                queue.add(current.leftChild);
            }
            if(current.rightChild != null){
                queue.add(current.rightChild);
            }
        }
        return result;
    }
    // Checks whether a given node exists in the tree
    public boolean containsNode(int value){
        return containsRecursive(root,value);
    }
    // Uses BST ordering to search of the value
    private boolean containsRecursive(TreeNode current,int value){
        if(current == null){
            return false;
        }

        if(value == current.value){
            return true;
        }
        return value < current.value ? containsRecursive(current.leftChild, value): containsRecursive(current.rightChild, value);
    }
     // returns the height of the tree
    public int getHeight(){
        return heightRecursive(root);
    }
    private int heightRecursive(TreeNode node){
        if(node == null){
            return -1;
        }
        return 1 + Math.max((heightRecursive(node.leftChild)), heightRecursive(node.rightChild));
    }
}
