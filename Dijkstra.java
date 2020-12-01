import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

  private void prepareGetShortestPathFromVertex(Vertex sourceVertex) {
    sourceVertex.setMinDistance(0);
    PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(sourceVertex);

    while (!priorityQueue.isEmpty()) {
      Vertex vertex = priorityQueue.poll();

      for (Edge edge : vertex.getEdges()) {
        Vertex v = edge.getTargetVertex();
        double weight = edge.getWeight();
        double minDistance = vertex.getMinDistance() + weight;

        if (minDistance < v.getMinDistance()) {
          priorityQueue.remove(vertex);
          v.setPreviousVertex(vertex);
          v.setMinDistance(minDistance);
          priorityQueue.add(v);
        }
      }
    }
  }

  private Pair<List<Vertex>, Double> getShortestPathTo(Vertex targetVertex) {
    List<Vertex> path = new ArrayList<>();
    double minDistance = 0;
    for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPreviousVertex()) {
      path.add(vertex);
      minDistance = minDistance + vertex.getMinDistance();
    }

    Collections.reverse(path);
    return Pair.of(path, minDistance);
  }

  public Pair<List<Vertex>, Double> getShortestPathFromTo(Vertex startVertex, Vertex targetVertex) {
    prepareGetShortestPathFromVertex(startVertex);
    return getShortestPathTo(targetVertex);
  }

}
