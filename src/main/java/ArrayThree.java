public class ArrayThree {
    public int maxSpan(int[] nums) {
        int maxSpan = 0; // Initialize maxSpan to keep track of the largest span found

        // Iterate over the array to find the leftmost and rightmost occurrences of each value
        for (int i = 0; i < nums.length; i++) {
            // Iterate from the current position to the end of the array
            for (int j = nums.length - 1; j >= i; j--) {
                // Check if the values at positions i and j are the same
                if (nums[i] == nums[j]) {
                    // Calculate the span as the distance between j and i, inclusive
                    int span = j - i + 1;

                    // Update maxSpan if this span is larger than the current maxSpan
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    // Once a match is found, no need to check further for this i
                    break;
                }
            }
        }

        return maxSpan; // Return the largest span found
    }
    public int[] fix34(int[] nums) {
        int n = nums.length;

        // Iterate through the array to find each 3
        for (int i = 0; i < n; i++) {
            if (nums[i] == 3) {
                // Find the next 4 that needs to be moved after this 3
                for (int j = 0; j < n; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        // Swap the number after 3 with this 4
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break; // Move to the next 3 after swapping
                    }
                }
            }
        }

        return nums;
    }
    public int[] fix45(int[] nums) {
        int n = nums.length;
        int fiveIndex = 0; // Pointer to find the next 5 to place after a 4

        // Iterate through the array to find each 4
        for (int i = 0; i < n; i++) {
            if (nums[i] == 4) {
                // Ensure the number after 4 is not 5, so we need to swap
                if (nums[i + 1] != 5) {
                    // Find the next available 5 to pair with this 4
                    while (nums[fiveIndex] != 5 || (fiveIndex > 0 && nums[fiveIndex - 1] == 4)) {
                        fiveIndex++;
                    }
                    // Swap the number after 4 with this 5
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[fiveIndex];
                    nums[fiveIndex] = temp;
                }
            }
        }

        return nums;
    }
    public boolean canBalance(int[] nums) {
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Iterate through the array to find the split point
        for (int num : nums) {
            leftSum += num;

            // Check if the left sum equals half of the total sum
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }

        // Return false if no split point is found
        return false;
    }
    public boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;

        // Iterate through both arrays using two pointers
        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] < inner[innerIndex]) {
                // Move forward in the outer array to find a potential match
                outerIndex++;
            } else if (outer[outerIndex] == inner[innerIndex]) {
                // If elements match, move both pointers forward
                innerIndex++;
                outerIndex++;
            } else {
                // If outer[outerIndex] > inner[innerIndex], it means the inner element is missing
                return false;
            }
        }

        // If all elements in inner are found in outer, innerIndex should have traversed the entire inner array
        return innerIndex == inner.length;
    }
    public int[] squareUp(int n) {
        // Initialize an array of size n*n
        int[] result = new int[n * n];

        // Loop through each block
        for (int i = 0; i < n; i++) {
            // Fill the block starting from the end of the block towards the beginning
            for (int j = 0; j <= i; j++) {
                // Calculate the index in the result array
                result[(i + 1) * n - j - 1] = j + 1;
            }
        }

        return result;
    }
    public int[] seriesUp(int n) {
        // Calculate the length of the resulting array
        int length = n * (n + 1) / 2;
        int[] result = new int[length];

        // Initialize the index for inserting elements into the result array
        int index = 0;

        // Iterate through each group from 1 to n
        for (int i = 1; i <= n; i++) {
            // Fill each group with numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }

        return result;
    }
    public int maxMirror(int[] nums) {
        int maxMirrorLength = 0;
        int n = nums.length;

        // Iterate over all starting positions for the mirror
        for (int i = 0; i < n; i++) {
            // Iterate over all ending positions for the reverse mirror
            for (int j = n - 1; j >= 0; j--) {
                int length = 0;
                int k = i;
                int l = j;

                // Find the length of the mirror starting from i and j
                while (k < n && l >= 0 && nums[k] == nums[l]) {
                    length++;
                    k++;
                    l--;
                }

                // Update the maximum mirror length found
                if (length > maxMirrorLength) {
                    maxMirrorLength = length;
                }
            }
        }

        return maxMirrorLength;
    }
    public int countClumps(int[] nums) {
        int clumpCount = 0;
        int n = nums.length;

        // Use a flag to track if we are currently in a clump
        boolean inClump = false;

        // Iterate through the array
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                // If we find two equal adjacent elements
                if (!inClump) {
                    // Start a new clump if not already in one
                    inClump = true;
                    clumpCount++;
                }
            } else {
                // If elements are different, end the current clump
                inClump = false;
            }
        }

        return clumpCount;
    }

}
