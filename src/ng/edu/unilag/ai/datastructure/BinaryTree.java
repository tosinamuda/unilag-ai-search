package ng.edu.unilag.ai.datastructure;

import java.util.*;

public class BinaryTree<T>
{
    private BinaryTreeNode<T> startNode;

    public BinaryTree(BinaryTreeNode<T> startNode)
    {

        this.startNode = startNode;

    }


    public void DFSSearch(BinaryTreeNode<T> goalNode)
    {
        Stack <BinaryTreeNode<T>> open = new Stack<BinaryTreeNode<T>>(); //Open
        List <BinaryTreeNode<T>> closed = new ArrayList<>();

        System.out.println("Initialize Open With Start Node");
        open.push(startNode);

        while(!open.isEmpty())
        {
            //Pop x
            BinaryTreeNode <T> x = open.pop();
            System.out.println("Pop Open = " + x);

            //Evaluating Popped ng.edu.unilag.ai.datastructure.Node
            System.out.println("Evaluating Popped Node: "+ x);
            if(x.equals(goalNode))
            {
                System.out.println("Search Status at Node "+ x +" is Success");
                closed.add(x);
                System.out.println("Closed Status: "+ closed);
                System.out.println("\n");
                break;
            }
            else
            {
                System.out.println("Search Status at Node "+ x +" is Failed");
                List<BinaryTreeNode<T>> children = x.getChildren();


                if(!children.isEmpty()){
                    System.out.println("Add " + x +" Children to Open:   "+ children);
                    for(int i = children.size() - 1; i >= 0; i--){
                        open.push(children.get(i));
                    }

                    System.out.print("Open Nodes: [");
                    for(int i = open.size() - 1; i >= 0; i--){
                        System.out.print(open.get(i) + ", ");

                    }
                    System.out.print("]\n");







                }
            }

            closed.add(x);
            System.out.println("Closed Status: "+ closed);
            System.out.println("\n");

        }

    }

    public void BFSSearch(BinaryTreeNode<T> goalNode)
    {
        Queue<BinaryTreeNode<T>> open = new ArrayDeque<>();
        List <BinaryTreeNode<T>> closed = new ArrayList<>();

        System.out.println("Initialize With Node");
        open.add(startNode);

        while(!open.isEmpty())
        {
            //Pop x
            BinaryTreeNode <T> x =  open.poll();
            System.out.println("Dequeue Open = " + x);

            //Evaluating Popped Node
            System.out.println("Evaluating Dequeued Node: "+ x);
            if(x.equals(goalNode))
            {
                System.out.println("Search Status at Node "+ x +" is Success");
                closed.add(x);
                System.out.println("Closed Status: "+ closed);
                System.out.println("\n");
                break;
            }
            else
            {
                System.out.println("Search Status at Node "+ x +" is Failed");
                List<BinaryTreeNode<T>> children = x.getChildren();


                if(!children.isEmpty()){
                    System.out.println("Add " + x +" Children to Open:   "+ children);
                    open.addAll(children);

                    System.out.print("Open Nodes: "+ open);
                    System.out.print("]\n");


                }
            }

            closed.add(x);
            System.out.println("Closed Nodes: "+ closed);
            System.out.println("\n");

        }

    }
}
