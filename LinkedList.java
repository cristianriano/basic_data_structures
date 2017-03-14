import java.util.*;

public class LinkedList{

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    Node first = null;
    Node last = null;

    String linea;

    while((linea = sc.nextLine()) != null){
      char c = linea.charAt(0);

      if(c == 'a'){ // Add element
        int n = new Integer(linea.split(" ")[1]);
        Node newNode = new Node(n);
        newNode.next = null;

        if((first == null) && (last == null)){
          first = last = newNode;
        }
        else{
          last.next = newNode;
          last = newNode;
        }
      }
      else if(c == 'p'){ // Print List
        Node tmp = first;

        while(tmp != null){
          System.out.print(tmp.value+" ");
          tmp = tmp.next;
        }
        System.out.println();
      }
      else if(c == 'd'){
        int n = new Integer(linea.split(" ")[1]);

        if(first.value == n){
          first = first.next;
        }
        else{
          Node tmp = first.next;
          Node previous = first;

          while(tmp != null){
            if(tmp.value == n){
              previous.next = tmp.next;
              tmp = null;
              break;
            }
            previous = tmp;
            tmp = tmp.next;
          }
        }
      }
      // else
    }
  }

}

class Node{
  int value;
  Node next;

  public Node(int n){
    value = n;
  }
}
