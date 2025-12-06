package _19_Heap;

import java.util.*;

public class Slidingwindowmax {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int idx = 0;

        Deque<Integer> dq = new LinkedList<>();  // stores indices

        for (int i = 0; i < n; i++) {

            // 1️⃣ Remove indices out of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2️⃣ Remove smaller numbers (they are useless)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3️⃣ Add current index
            dq.offerLast(i);

            // 4️⃣ Add max to result when window size >= k
            if (i >= k - 1) {
                result[idx++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);

        for (int x : res) {
            System.out.print(x + " ");
        }
        // Expected: 3 3 5 5 6 7
    }
}
