import java.util.Arrays;

public class Compress {

    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            chars[write++] = current;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        Compress solution = new Compress();

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int len1 = solution.compress(chars1);
        System.out.println(len1 + " " + Arrays.toString(Arrays.copyOf(chars1, len1))); // 6 [a, 2, b, 2, c, 3]

        char[] chars2 = {'a'};
        int len2 = solution.compress(chars2);
        System.out.println(len2 + " " + Arrays.toString(Arrays.copyOf(chars2, len2))); // 1 [a]

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int len3 = solution.compress(chars3);
        System.out.println(len3 + " " + Arrays.toString(Arrays.copyOf(chars3, len3))); // 4 [a, b, 1, 2]
    }
}
