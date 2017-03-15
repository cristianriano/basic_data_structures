import java.util.*;

public class Graph{

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    int verticeNumber = new Integer(sc.nextLine());
    int edgeNumber = new Integer(sc.nextLine());

    // Create an array for the length of the number of nodes
    ArrayList<Integer> graph[] = new ArrayList[verticeNumber + 1];

    // Initialize a List in every position (have the nodes linked)
    for(int i=0; i<=verticeNumber; i++)
      graph[i] = new ArrayList<Integer>();

    // Get all connections
    // Format entry: nodeA nodeB (means there is a connection)
    String line;
    for(int i=0; i<edgeNumber; i++){
      line = sc.nextLine();

      int x = new Integer(line.split(" ")[0]);
      int y = new Integer(line.split(" ")[1]);

      // Since is a not directed graph the relation or edge is bidirectional
      graph[x].add(y);
      graph[y].add(x);
    }

    Queue<Integer> queue = new LinkedList<Integer>();
    // An array of boolean meaning if we already visited the vertice
    boolean visited[] = new boolean[verticeNumber + 1];
    // We add the first node
    queue.offer(1);

    while(!queue.isEmpty()){

      int tmp = queue.remove();
      // Print the node
      System.out.print(tmp+" ");
      // Already visited
      visited[tmp] = true;

      // Enqueue all linked elements
      for(int i=0; i<graph[tmp].size(); i++){
        // Get the element
        int element = graph[tmp].get(i);

        // Is was not visited yet then enqueue
        if(!visited[element])
          queue.offer(element);
      }
    }
    System.out.println();

  }

}
