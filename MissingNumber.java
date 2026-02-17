public class MissingNumber {
    
    public static int findMissingElement(int nums[]) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If index matches value, the left part is perfect.
            // The missing number must be on the RIGHT side.
            if (nums[mid] == mid) {
                start = mid + 1;
            } 
            // If index does NOT match value, there's a gap on the LEFT side.
            // Move left to find the first point of mismatch.
            else {
                end = mid - 1;
            }
        }

        // After the loop, 'start' will always point to the missing number.
        return start;
    }

    public static void main(String[] args) {
        // Example: 5 is missing
        int nums[] = {0, 1, 2, 3, 4, 6, 7, 8}; 
        
        int result = findMissingElement(nums);
        
        System.out.println("The Smallest Missing Number is: " + result);
    }
}