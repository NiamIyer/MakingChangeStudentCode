/**
 * The class Making Change solves a classic problem:
 * given a set of coins, how many ways can you make change for a target amount?
 *
 * @author Zach Blick
 * @author [YOUR NAME HERE]
 */

public class MakingChange {
    /**
     * TODO: Complete this function, countWays(), to return the number of ways to make change
     *  for any given total with any given set of coins.
     */
    public static long countWays(int target, int[] coins) {
        return calculate(coins.length - 1, target, coins, 0);
    }

    private static long calculate(int index, int target, int[] coins, int curr) {
        if (target == curr) {
            return 1;
        }
        if (target < curr) {
            return 0;
        }

        if (index > coins.length - 1 || index < 0) {
            return 0;
        }
       return calculate(index, target, coins, curr + coins[index]) + calculate(index - 1, target, coins, curr);

    }

    // For every coin amount call recursive method
    // In the recursive method, recursively add coins by looping through whole array until it either goes over or hits
}

