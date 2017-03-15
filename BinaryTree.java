import java.util.*;

public class BinaryTree{

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    Node root = null;

    String linea;

    while((linea = sc.nextLine()) != null){
      char c = linea.charAt(0);

      if(c == 'a'){     // Add node
        int n = new Integer(linea.split(" ")[1]);

        if(root == null)
          root = new Node(n);
        else
          root.insert(n);
      }
      else if(c == 'p'){    // Print tree
        inorden(root);
        System.out.println();
      }
      else if(c == 'f'){     // Find node
        int n = new Integer(linea.split(" ")[1]);

        if(search(root, n))
          System.out.println("Found!");
        else
          System.out.println("Not found :(");
      }
      // else
    }
  }

  static void inorden(Node root){
    if(root == null)
      return;
    else
      inorden(root.left);
      System.out.print(root.value+" ");
      inorden(root.right);
  }

  static boolean search(Node root, int n){
    if(root == null)
      return false;
    else{
      if(root.value == n)
        return true;
      else if(n < root.value)
        return search(root.left, n);
      else
        return search(root.right, n);
    }
  }
}

class Node{
  int value;
  Node left;
  Node right;

  public Node(int n){
    value = n;
  }

  void insert(int n){
    if(n < value){  // If the value is less then goes to left side
      if(left == null)
        left = new Node(n); // If there is no left node then insert it
      else
        left.insert(n); // If there is left node then recursively insert to the left node
    }
    else if(n > value){
      if(right == null)
        right = new Node(n);
      else
        right.insert(n);
    }
  }

}
