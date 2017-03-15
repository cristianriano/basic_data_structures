import java.util.*;

public class QueueMain{

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    String line;
    MyQueue queue = new MyQueue();

    while((line = sc.nextLine()) != null){
      char c = line.charAt(0);

      if(c == 'a'){
        int n = new Integer(line.split(" ")[1]);

        queue.offer(n);
      }
      else if(c == 'r'){
        System.out.println(""+queue.remove());
      }
      else if(c == 's'){
        System.out.println("Size: "+queue.getSize());
      }
      else if(c == 'f'){
        System.out.println(""+queue.getFirst());
      }
      else if(c == 'c'){
        queue.clean();
        System.out.println("Cleaned!");
      }
      else{
        System.out.println("Options: ");
        System.out.println("Offer: 'a number'");
        System.out.println("Remove: 'r'");
        System.out.println("Size: 's'");
        System.out.println("First: 'f'");
        System.out.println("Clean: 'c'");
      }
    }
  }

}
