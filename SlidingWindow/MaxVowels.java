public class MaxVowels {

    public int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxCount = count;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        MaxVowels solution = new MaxVowels();

        System.out.println(solution.maxVowels("abciiidef", 3)); // 3
        System.out.println(solution.maxVowels("aeiou", 2));      // 2
        System.out.println(solution.maxVowels("leetcode", 3));   // 2
    }
}
