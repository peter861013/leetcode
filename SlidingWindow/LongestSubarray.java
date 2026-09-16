public class LongestSubarray {

    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubarray solution = new LongestSubarray();

        System.out.println(solution.longestSubarray(new int[]{1, 1, 0, 1})); // 3
        System.out.println(solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1})); // 5
        System.out.println(solution.longestSubarray(new int[]{1, 1, 1})); // 2
    }
}
