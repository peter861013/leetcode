import java.util.Arrays;

public class CloseStrings {

    public boolean closeStrings(String word1, String word2) {
         if (word1.length() != word2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0) != (count2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1, count2);
    }

    public static void main(String[] args) {
        CloseStrings solution = new CloseStrings();

        System.out.println(solution.closeStrings("abc", "bca"));   // true
        System.out.println(solution.closeStrings("a", "aa"));      // false
        System.out.println(solution.closeStrings("cabbba", "abbccc")); // true
    }
}
