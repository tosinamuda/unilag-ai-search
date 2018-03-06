package ng.edu.unilag.ai.datastructure;

public class Node <T> {
    protected T data;

    public Node()
    {

    }

    public Node(T data)
    {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
