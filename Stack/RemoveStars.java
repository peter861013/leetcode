import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveStars {

    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveStars solution = new RemoveStars();

        System.out.println(solution.removeStars("leet**cod*e")); // lecoe
        System.out.println(solution.removeStars("erase*****"));  // (empty string)
    }
}
