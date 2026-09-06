import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        KidsWithCandies solution = new KidsWithCandies();

        System.out.println(solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)); // [true, true, true, false, true]
        System.out.println(solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)); // [true, false, false, false, false]
        System.out.println(solution.kidsWithCandies(new int[]{12, 1, 12}, 10));    // [true, false, true]
    }
}
