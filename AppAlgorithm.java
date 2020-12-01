import java.util.ArrayList;
import java.util.List;

public class AppAlgorithm {

  public static void main(String[] args) {
    List<Vertex> vertices = new ArrayList<>();
    Vertex vertexS = new Vertex("s");
    Vertex vertex2 = new Vertex("2");
    Vertex vertex3 = new Vertex("3");
    Vertex vertex4 = new Vertex("4");
    Vertex vertex5 = new Vertex("5");
    Vertex vertexT = new Vertex("t");
    /*vertices.add(vertexS);
    vertices.add(vertex2);
    vertices.add(vertex3);
    vertices.add(vertex4);
    vertices.add(vertex5);
    vertices.add(vertexT);
    List<Edge> edges = new ArrayList<>();*/
    Edge edges2 = new Edge(vertexS, vertex2, 6);
    Edge edges4 = new Edge(vertexS, vertex4, 4);
    Edge edge23 = new Edge(vertex2, vertex3, 5);
    Edge edge24 = new Edge(vertex2, vertex4, 3);
    //Edge edge34 = new Edge(vertex3, vertex4, 3);
    Edge edge35 = new Edge(vertex3, vertex5, 2);
    Edge edge3t = new Edge(vertex3, vertexT, 2);
    Edge edge43 = new Edge(vertex4, vertex3, 3);
    Edge edge45 = new Edge(vertex4, vertex5, 9);
    Edge edge5t = new Edge(vertex5, vertexT, 3);
    /*edges.add(edges2);
    edges.add(edges4);
    edges.add(edge23);
    edges.add(edge24);
    edges.add(edge43);
    edges.add(edge35);
    edges.add(edge3t);
    edges.add(edge45);
    edges.add(edge5t);*/
    //Graph graph = new Graph(vertices, edges);
    Dijkstra dijkstra = new Dijkstra();
    Pair<List<Vertex>, Double> result = dijkstra.getShortestPathFromTo(vertexS, vertexT);

    if(result != null){
      System.out.println(result.getFirst());
      System.out.println(result.getSecond());
    }

  }

}
