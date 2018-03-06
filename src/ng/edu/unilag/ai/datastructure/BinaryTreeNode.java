package ng.edu.unilag.ai.datastructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeNode<T> extends Node<T> implements Comparable<T>{

    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data)
    {
        super(data);
    }

    public BinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public List<BinaryTreeNode<T>> getChildren()
    {
        List<BinaryTreeNode<T>> children = new ArrayList<>();

        if(leftChild != null)
            children.add(leftChild);
        if(rightChild != null)
            children.add(rightChild);
        return children;
    }

    @Override
    public int compareTo(T that) {

        return this.data.equals(that) ? 0 : 1 ;
    }

    @Override
    public String toString()
    {
        return this.data.toString();
    }


    public static final class BinaryTreeNodeBuilder<T> {
        protected T data;
        private BinaryTreeNode<T> leftChild;
        private BinaryTreeNode<T> rightChild;

        private BinaryTreeNodeBuilder() {
        }

        public static BinaryTreeNodeBuilder with() {
            return new BinaryTreeNodeBuilder();
        }

        public BinaryTreeNodeBuilder with(T data) {
            this.data = data;
            return this;
        }

        public BinaryTreeNodeBuilder setLeftChild(BinaryTreeNode<T> leftChild) {
            this.leftChild = leftChild;
            return this;
        }

        public BinaryTreeNodeBuilder setRightChild(BinaryTreeNode<T> rightChild) {
            this.rightChild = rightChild;
            return this;
        }

        public BinaryTreeNode build() {
            BinaryTreeNode binaryTreeNode = new BinaryTreeNode(null);
            binaryTreeNode.setData(data);
            binaryTreeNode.setLeftChild(leftChild);
            binaryTreeNode.setRightChild(rightChild);
            return binaryTreeNode;
        }
    }
}