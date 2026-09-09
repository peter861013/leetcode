public class ReverseWords {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();

        System.out.println(solution.reverseWords("the sky is blue"));          // blue is sky the
        System.out.println(solution.reverseWords("  hello world  "));          // world hello
        System.out.println(solution.reverseWords("a good   example"));         // example good a
    }
}
