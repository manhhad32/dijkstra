import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{

  private String name;
  private List<Edge> edges;
  private Vertex previousVertex;
  private double minDistance = Double.MAX_VALUE;

  public Vertex(String name) {
    this.name = name;
    this.edges = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addEdge(Edge edge) {
    this.edges.add(edge);
  }

  public List<Edge> getEdges() {
    return edges;
  }

  public void setEdges(List<Edge> edges) {
    this.edges = edges;
  }

  public Vertex getPreviousVertex() {
    return previousVertex;
  }

  public void setPreviousVertex(Vertex previousVertex) {
    this.previousVertex = previousVertex;
  }

  public double getMinDistance() {
    return minDistance;
  }

  public void setMinDistance(double minDistance) {
    this.minDistance = minDistance;
  }

  @Override
  public String toString() {
    return this.name;
  }

  @Override
  public int compareTo(Vertex vertex) {
    return Double.compare(this.minDistance, vertex.minDistance);
  }
}
