import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {

    private final Deque<Integer> requests = new ArrayDeque<>();

    public int ping(int t) {
        requests.addLast(t);

        while (requests.peekFirst() < t - 3000) {
            requests.removeFirst();
        }

        return requests.size();
    }

    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        System.out.println(counter.ping(1));    // 1
        System.out.println(counter.ping(100));  // 2
        System.out.println(counter.ping(3001)); // 3
        System.out.println(counter.ping(3002)); // 3
    }
}
