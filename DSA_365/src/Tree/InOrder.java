package Tree;

import java.util.ArrayList;

public class InOrder {

    static void inOrder(Node node, ArrayList<Integer> res){
        if(node == null) return;

        //Traverse the left Subtree first
        inOrder(node.left,res);
        //Visit the current Node
        res.add(node.data);
        //Traverse the right Node
        inOrder(node.right,res);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        ArrayList<Integer> ans = new ArrayList<>();
        inOrder(root,ans);

        for(int node : ans){
            System.out.print(node+" ");
        }
    }
}


// Create binary tree
//       1
//      /  \
//    2     3
//   / \     \
//  4   5     6