public class LargestAltitude {

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        LargestAltitude solution = new LargestAltitude();

        System.out.println(solution.largestAltitude(new int[]{-5, 1, 5, 0, -7})); // 1
        System.out.println(solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})); // 0
    }
}
