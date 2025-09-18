## Opposite Ends
### Template for Opposite Ends
```
int left = 0, right = nums.length - 1;
while (left < right) {
    if (condition(nums[left], nums[right])) {
        // do something
        left++;
        right--;
    } else if (needMore) {
        left++;   // or right-- depending on condition
    } else {
        right--;
    }
}
 
```

## Example 1 - Example 1: Two Sum II – Input Sorted (LeetCode 167)
```
int[] twoSum(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) return new int[]{left+1, right+1};
        else if (sum < target) left++;
        else right--;
    }
    return new int[]{-1,-1};
}

```

## Example 2 - Example 2: Container With Most Water (LeetCode 11)

```
int maxArea(int[] height) {
    int left = 0, right = height.length - 1, max = 0;
    while (left < right) {
        int h = Math.min(height[left], height[right]);
        max = Math.max(max, h * (right - left));
        if (height[left] < height[right]) left++;
        else right--;
    }
    return max;
}

```

## Example 3 Valid Palindrome (LeetCode 125)
```
boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
 
```

### Same Direction	-- Slow/Fast scan in sorted array, linked list, duplicates, partitioning	-- for (fast) { if(condition) slow++ }
### Opposite Ends	-- Pairs, symmetry, minimizing/maximizing, sorted problems -- 	while (left < right) { ... }

# Opposite Ends Optimization Template
```
int maxArea(int[] height) {
    int left = 0, right = height.length - 1, max = 0;

    while (left < right) {
        int h = Math.min(height[left], height[right]);
        max = Math.max(max, h * (right - left));

        if (height[left] < height[right]) left++;
        else right--;
    }
    return max;
}
 
```

## Two Pointers – Opposite Ends (Pair/Triplet Style)

```
int[] twoSumSorted(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) return new int[]{left, right};
        else if (sum < target) left++;   // need bigger sum
        else right--;                    // need smaller sum
    }
    return new int[]{-1, -1};
}

```