/**
 * @author Victor Daniel Arellana Assia
 * Date: 07/23/2026
 * Course: CS 1027
 * Assignment 4 - BinarySearchTreeCollection
 */


import java.util.ArrayList;
import java.util.Collections;
public class BinarySearchTreeCollection{     
    private ArrayList<BinarySearchTree> trees;

    // Constructs an empty BSTcollection
    public BinarySearchTreeCollection(){
        trees = new ArrayList<>();
    }
    
    // Adds a new BST to the collection
    public void addTree(BinarySearchTree tree){
        trees.add(tree);
    }

    // Searches for a tree through the index of the trees size
    public BinarySearchTree getTree(int index){
        //Base Check to  make sure index isnt over or less that the amount its supposed to be 
        if(index < 0 || index >= trees.size()){
            throw new IllegalArgumentException("Invalid argument!");
        }
        return trees.get(index);

    }
    // Removes Tree from Collection of BST
    public void deleteTree(int index){

        //Base Check to make sure index isnt over or less that the size its supposed to be 
         if(index < 0 || index >= trees.size()){
            throw new IllegalArgumentException("Invalid argument!");
        }
        trees.remove(index);
    }
    // Returns the length of the collec otherwise know as the number of trees
    public int getNumberOfTrees(){
        return trees.size();
    }

    // CHecks whether the trees at the given indices all have the  same shape and the same values at each corresponding position
    public boolean areStructurallyEquivalent(int[] indices){
        if(indices.length < 2){
            throw new IllegalArgumentException("Invalid argument!");
        }

        for(int index: indices){
            if(index < 0 || index >= trees.size()){
                throw new IllegalArgumentException("Invalid argument!");
            }
        }

        TreeNode firstRoot = trees.get(indices[0]).root;
         // Compare every other tree agaisnt the first one
        for (int i = 1; i < indices.length; i++) {
            TreeNode currentRoot = trees.get(indices[i]).root;
            if (!isStructurallyEquivalent(firstRoot, currentRoot)) {
                return false;
        }
    }
    return true;
}
    //Compares the two treees by same shape so null positions and values
    private boolean isStructurallyEquivalent(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.value == b.value && isStructurallyEquivalent(a.leftChild, b.leftChild)&& isStructurallyEquivalent(a.rightChild, b.rightChild);
    }

    //Merges the trees at the given indices into a single new tree helps removing the duplicates
    public void merge(int[] indices) {
        if (indices.length < 2) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        for (int index : indices) {
            if (index < 0 || index >= trees.size()) {
                throw new IllegalArgumentException("Invalid argument!");
            }
        }

        ArrayList<Integer> allValues = new ArrayList<>();

        //Track actual tree references to remove later
        ArrayList<BinarySearchTree> treesToRemove = new ArrayList<>();

        for (int index : indices) {
            BinarySearchTree tree = trees.get(index);
            treesToRemove.add(tree);
            collectValues(tree.root, allValues);
        }
        // remove the duplicate values
        ArrayList<Integer> uniqueValues = new ArrayList<>();
        for (Integer value : allValues) {
            if (!uniqueValues.contains(value)) {
                uniqueValues.add(value);
            }
        }

        Collections.sort(uniqueValues);

        //Inserting in ascending sorted order produces a right-leaning tree
        BinarySearchTree mergedTree = new BinarySearchTree();
        for (Integer value : uniqueValues) {
            mergedTree.addNode(value);
        }

        trees.removeAll(treesToRemove);
        trees.add(mergedTree);
    }

    //private helper methodthat collects every value in the tree into given list
    private void collectValues(TreeNode node, ArrayList<Integer> values) {
        if (node == null) {
            return;
        }
            values.add(node.value);
            collectValues(node.leftChild, values);
            collectValues(node.rightChild, values);
    }
    //Syns the number of TreeNodes across every tree in the collection 
    public int getTotalNodes(){
        int total = 0;
        // 
        for(BinarySearchTree tree:trees){
            total += tree.getNodeCount();
        }
        return total;
    }
}
