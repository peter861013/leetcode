public class MergeAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeAlternately solution = new MergeAlternately();

        System.out.println(solution.mergeAlternately("abc", "pqr"));      // apbqcr
        System.out.println(solution.mergeAlternately("ab", "pqrs"));      // apbqrs
        System.out.println(solution.mergeAlternately("abcd", "pq"));      // apbqcd
    }
}
