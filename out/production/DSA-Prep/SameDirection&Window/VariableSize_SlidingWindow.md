## variable-size sliding window

You maintain a window [start, end] (or [left, right]) over the array/string.

You expand the window by moving end forward.

You shrink the window by moving start forward when a certain condition is met.

Goal: Maintain a window that satisfies a condition while optimizing something (like max length, min length, sum, count, etc.)

Template -- >

```
int left = 0;
int windowSum = 0;
int minLength = Integer.MAX_VALUE;

for (int right = 0; right < arr.length; right++) {
    windowSum += arr[right]; // expand

    while (windowSum >= target) { // The while loop automatically stops when window < target.
        minLength = Math.min(minLength, right - left + 1);
        windowSum -= arr[left];
        left++;
    }
    minlen == Integer.MAX_VALUE ? 0 : minlen
}

```

## Minimum Size Subarray Sum (LC 209)
```declarative
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}


```

## 1. Common Use-Cases
- Longest substring with at most K distinct characters

- Smallest subarray with sum ≥ S

- Longest substring without repeating characters

- Max sum of subarray with sum ≤ K

## Example 1: Smallest subarray with sum ≥ target
```public int minSubArrayLen(int target, int[] nums) {
    int start = 0, sum = 0, minLen = Integer.MAX_VALUE;

    for (int end = 0; end < nums.length; end++) {
        sum += nums[end]; // expand window

        while (sum >= target) { // shrink window
            minLen = Math.min(minLen, end - start + 1);
            sum -= nums[start];
            start++;
        }
    }

    return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
}
```
- Window expands with end++.

- indow shrinks from start++ whenever sum ≥ target.

- Complexity: O(n)

## Example 2: Longest substring with no repeating characters
```public int lengthOfLongestSubstring(String s) {
    int start = 0, maxLen = 0;
    Map<Character, Integer> map = new HashMap<>();

    for (int end = 0; end < s.length(); end++) {
        char c = s.charAt(end);
        if (map.containsKey(c)) {
            start = Math.max(map.get(c) + 1, start); // shrink to remove repeat
        }
        map.put(c, end);
        maxLen = Math.max(maxLen, end - start + 1);
    }
    return maxLen;
}
```
- map stores last seen index.

- Shrink window when a duplicate is found.

- Window size is dynamic, changes based on condition.

## Key Takeaways
1. Fixed-size window = length is constant (k).

2. Variable-size window = length changes dynamically to satisfy condition.

3. Always check if window violates the condition → shrink.

4. Complexity is usually O(n) because each element is added/removed at most once.

## Universal Sliding Window Approach / Mantra

 - Step 1: Initialize left=0
 - Step 2: Expand right pointer
 - Step 3: Add current element to window (sum/map/etc.)
 - Step 4: While window is invalid / condition met → shrink left pointer
 - Step 5: Update answer if needed
 - Step 6: Continue until right reaches
  
## Memory Trick

1. Fixed size → add new, remove old

2. Variable size → expand until invalid, shrink to valid

