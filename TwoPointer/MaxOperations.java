import java.util.Arrays;

public class MaxOperations {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int operations = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        MaxOperations solution = new MaxOperations();

        System.out.println(solution.maxOperations(new int[]{1, 2, 3, 4}, 5));       // 2
        System.out.println(solution.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));    // 1
    }
}
