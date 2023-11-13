import java.util.*;

class Node1 {
    int data;
    Node left, right;

    public Node1(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Function to perform post-order traversal
    public void postOrder(Node node) {
        if (node != null) {
            // Traverse the left subtree
            postOrder(node.left);

            // Traverse the right subtree
            postOrder(node.right);

            // Visit the root node
            System.out.print(node.data + " ");
        }
        
    }
    //own method inserting
}

class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            try {
            // Input the elements of the binary tree from the user
           System.out.println("Enter the root element of the binary tree:");
           int rootData = scanner.nextInt();
           tree.root = new Node(rootData);
              
           System.out.println("Post-order traversal of the binary tree:");
           tree.postOrder(tree.root);
   
           // Close the scanner to avoid resource leaks
           scanner.close();
           System.exit(0);   
        } catch (InputMismatchException A) {
             System.out.println("Please Try Again, Input only number");
             scanner.next();
        }

        }
    }
   
}
