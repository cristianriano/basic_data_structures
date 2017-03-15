import java.util.*;

public class StackMain{

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    String line;
    MyStack stack = new MyStack();

    while((line = sc.nextLine()) != null){
      char c = line.charAt(0);

      if(c == 'a'){
        int n = new Integer(line.split(" ")[1]);

        stack.push(n);
      }
      else if(c == 'p'){
        System.out.println(""+stack.pop());
      }
      else if(c == 's'){
        System.out.println("Size: "+stack.getSize());
      }
      else if(c == 'k'){
        System.out.println(""+stack.getPeak());
      }
      else if(c == 'c'){
        System.out.println("Cleaned!");
      }
      else{
        System.out.println("Options: ");
        System.out.println("Push: 'a number'");
        System.out.println("Pop: 'p'");
        System.out.println("Size: 's'");
        System.out.println("Peak: 'k'");
        System.out.println("Clean: 'c'");
      }
    }
  }

}
