import java.util.*;

// Pila
public class MyStack{

  private StackNode peak;
  private int size;

  public MyStack(){
    peak = null;
    size = 0;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public void push(int n){
    StackNode node = new StackNode(n);
    node.next = peak;
    peak = node;
    size++;
  }

  public int pop(){
    int tmp = peak.value;
    peak = peak.next;
    size--;
    return tmp;
  }

  public int getPeak(){
    return peak.value;
  }

  public int getSize(){
    return size;
  }

  public void clean(){
    while(!isEmpty()){
      pop();
    }
  }
}

class StackNode{
  int value;
  StackNode next;

  public StackNode(int n){
    value = n;
    next = null;
  }
}
