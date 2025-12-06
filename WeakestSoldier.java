package _19_Heap;

import java.util.PriorityQueue;

public class WeakestSoldier {

    // Function to count soldiers using binary search (fast)
    private static int countSoldiers(int[] row) {
        int low = 0, high = row.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == 1)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low; // number of 1's
    }

    public static int[] kWeakestRows(int[][] mat, int k) {

        // Min Heap: (soldierCount, rowIndex)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        for (int i = 0; i < mat.length; i++) {
            int soldierCount = countSoldiers(mat[i]);
            pq.add(new int[]{soldierCount, i});
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[1];
        }

        return result;
    }

    // Testing
    public static void main(String[] args) {
        int[][] mat = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k = 3;

        int[] ans = kWeakestRows(mat, k);

        for (int x : ans) {
            System.out.print(x + " ");
        }
        // Expected Output: 2 0 3
    }
}
