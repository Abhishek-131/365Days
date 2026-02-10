package Tree;

import java.util.LinkedList;
import java.util.Queue;

import static Tree.InOrder.inOrder;

public class InsertionNodeOnLevelOrder {
    public static Node InsertNode(Node root, int data){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left != null){
                q.add(curr.left);
            }else{
                curr.left = new Node(data);
                return root;
            }
            if(curr.right != null){
                q.add(curr.right);
            }else{
                curr.right = new Node(data);
                return root;
            }
        }
        return root;
    }
    //Print Node in InOrder Way
    public static void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        int key = 12;
        //Insert Node
        InsertNode(root,key);
        //Print Node in InOrder
         inOrder(root);
    }
}
