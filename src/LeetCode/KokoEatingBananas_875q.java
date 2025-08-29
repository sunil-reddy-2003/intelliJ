package LeetCode;

public class KokoEatingBananas_875q {
    public static int minEatingSpeed(int[] piles, int h) {
//        int low = 1;
        long total=0;
        for (int i = 0; i <piles.length; i++) {
            total+=piles[i];
        }
        int low = (int)((total - 1) / h) + 1; // ceil(total/h)
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile); // max pile = upper bound of speed
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                high = mid; // mid works, try smaller
            } else {
                low = mid + 1; // mid too small, increase speed
            }
        }
        return low;
    }

    // helper function to check if Koko can eat with speed 'speed'
    private static boolean canEat(int[] piles, int h, int speed) {
        int hours = 0;
        for (int pile : piles) {
//            hours += (pile + speed - 1) / speed; // ceil(pile/speed)
            hours += (int) Math.ceil((double) pile / speed); // ceil(pile/speed)

        }
        return hours <= h;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h)); // Expected: 4
    }
}
