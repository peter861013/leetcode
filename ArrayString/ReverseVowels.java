public class ReverseVowels {

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!isVowel(chars[left])) {
                left++;
            } else if (!isVowel(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        ReverseVowels solution = new ReverseVowels();

        System.out.println(solution.reverseVowels("IceCreAm")); // AceCrEIm
        System.out.println(solution.reverseVowels("leetcode")); // leotcede
    }
}
