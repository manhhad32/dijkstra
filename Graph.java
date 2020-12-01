import java.util.List;

public class Graph {
  private List<Vertex> vertex;
  private List<Edge> edges;

  public Graph(List<Vertex> vertex, List<Edge> edges) {
    this.vertex = vertex;
    this.edges = edges;
  }

  public List<Vertex> getVertex() {
    return this.vertex;
  }

  public void setVertex(List<Vertex> vertex) {
    this.vertex = vertex;
  }

  public List<Edge> getEdges() {
    return this.edges;
  }

  public void setEdges(List<Edge> edges) {
    this.edges = edges;
  }

}
