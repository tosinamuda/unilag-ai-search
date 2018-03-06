package ng.edu.unilag.ai;

import ng.edu.unilag.ai.datastructure.BinaryTree;
import ng.edu.unilag.ai.datastructure.BinaryTreeNode;

public class Main {

    public static void main(String[] args) {


        BinaryTreeNode<String> startNode = new BinaryTreeNode<>("A");
        BinaryTreeNode<String> bNode = new BinaryTreeNode<>("B");
        BinaryTreeNode<String> cNode = new BinaryTreeNode<>("C");
        BinaryTreeNode<String> dNode = new BinaryTreeNode<>("D");
        BinaryTreeNode<String> eNode = new BinaryTreeNode<>("E");
        BinaryTreeNode<String> fNode = new BinaryTreeNode<>("F");
        BinaryTreeNode<String> gNode = new BinaryTreeNode<>("G");
        BinaryTreeNode<String> iNode = new BinaryTreeNode<>("I");
        BinaryTreeNode<String> jNode = new BinaryTreeNode<>("J");
        BinaryTreeNode<String> kNode = new BinaryTreeNode<>("K");
        BinaryTreeNode<String> lNode = new BinaryTreeNode<>("L");
        startNode.setLeftChild(bNode);
        startNode.setRightChild(cNode);
        bNode.setLeftChild(dNode);
        bNode.setRightChild(eNode);
        cNode.setLeftChild(fNode);
        cNode.setRightChild(gNode);
        dNode.setLeftChild(iNode);
        dNode.setRightChild(jNode);
        iNode.setLeftChild(kNode);
        iNode.setRightChild(lNode);

        BinaryTree<String> tree = new BinaryTree<>(startNode);

        tree.DFSSearch(fNode);

        //tree.BFSSearch(fNode);

    }

}