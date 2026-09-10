public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        IncreasingTriplet solution = new IncreasingTriplet();

        System.out.println(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));       // true
        System.out.println(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));       // false
        System.out.println(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));    // true
    }
}
