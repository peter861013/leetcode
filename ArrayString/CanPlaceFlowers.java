public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)); // true
        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)); // false
    }
}
