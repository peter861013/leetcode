import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {

    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(count);
                stringStack.push(current);
                count = 0;
                current = new StringBuilder();
            } else if (c == ']') {
                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();
                for (int i = 0; i < repeat; i++) {
                    previous.append(current);
                }
                current = previous;
            } else {
                current.append(c);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        DecodeString solution = new DecodeString();

        System.out.println(solution.decodeString("3[a]2[bc]"));     // aaabcbc
        System.out.println(solution.decodeString("3[a2[c]]"));      // accaccacc
        System.out.println(solution.decodeString("2[abc]3[cd]ef")); // abcabccdcdcdef
    }
}
