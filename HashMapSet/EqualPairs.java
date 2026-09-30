import java.util.HashMap;
import java.util.Map;

public class EqualPairs {

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowCounts = new HashMap<>();

        for (int[] row : grid) {
            rowCounts.merge(encode(row), 1, Integer::sum);
        }

        int pairs = 0;

        for (int c = 0; c < n; c++) {
            int[] column = new int[n];
            for (int r = 0; r < n; r++) {
                column[r] = grid[r][c];
            }
            pairs += rowCounts.getOrDefault(encode(column), 0);
        }

        return pairs;
    }

    private String encode(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(',');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        EqualPairs solution = new EqualPairs();

        System.out.println(solution.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}})); // 1
        System.out.println(solution.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}})); // 3
    }
}
