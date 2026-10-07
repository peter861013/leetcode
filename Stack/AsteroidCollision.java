import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -asteroid) {
                    stack.pop();
                } else if (top == -asteroid) {
                    stack.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if (alive) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision solution = new AsteroidCollision();

        System.out.println(java.util.Arrays.toString(solution.asteroidCollision(new int[]{5, 10, -5})));      // [5, 10]
        System.out.println(java.util.Arrays.toString(solution.asteroidCollision(new int[]{8, -8})));          // []
        System.out.println(java.util.Arrays.toString(solution.asteroidCollision(new int[]{10, 2, -5})));      // [10]
    }
}
