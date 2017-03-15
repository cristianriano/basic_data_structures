import java.util.*;

// Pila
public class MyQueue{

  QueueNode first, last;
  int size;

  public MyQueue(){
    first = last = null;
    size = 0;
  }

  public boolean isEmpty(){
    return first == null;
  }

  public void offer(int n){
    QueueNode node = new QueueNode(n);
    if(isEmpty())
      first = last = node;
    else{
      last.next = node;
      last = node;
    }
    size++;
  }

  public int remove(){
    int tmp = first.value;
    first = first.next;
    size --;
    return tmp;
  }

  public int getFirst(){
    return first.value;
  }

  public int getSize(){
    return size;
  }

  public void clean(){
    System.out.print("Cleaning");
    while(!isEmpty()){
      System.out.print(".");
      remove();
    }
    System.out.println();
  }
}

class QueueNode{
  int value;
  QueueNode next;

  public QueueNode(int n){
    value = n;
    next = null;
  }
}
