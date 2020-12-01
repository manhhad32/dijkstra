public class Pair<L, R> {
  public static <L, R> Pair<L, R> of(L first, R second) {
    return new Pair<L, R>(first, second);
  }

  private L first;
  private R second;

  private Pair(L first, R second) {
    this.first = first;
    this.second = second;
  }

  public L getFirst() {
    return first;
  }

  public R getSecond() {
    return second;
  }
}

