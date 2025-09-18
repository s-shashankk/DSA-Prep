**What is Two Pointers  method?**
Instead of scanning an array multiple times or using nested loops (O(n²)),
we use two indices (pointers) that move towards each other (or in the same direction) to solve the problem in O(n).

Remember !!
👉 If the problem asks about PAIRS, BALANCING, or CHECKING from both sides → Opposite Direction.
👉 If the problem asks about SUBARRAYS, WINDOWS, or DYNAMIC RANGES → Same Direction (Sliding Window).

1. Opposite Direction (start ↔ end)
Setup:
  left = 0, right = n-1, move inward

When to use:
✅ Array is sorted (or you can sort it)
✅ You’re dealing with pairs or comparisons across ends
✅ Problems like: sum of two numbers, checking palindrome, max/min area, etc.

Common Patterns:
  Two Sum (in sorted array)
  Valid Palindrome
  Container With Most Water (maximize area)
  Trapping Rain Water (two pointers inward)
  Squares of a Sorted Array

2. Same Direction (sliding window style)
Setup:
  left = 0, right = 0, both move forward, adjusting window

When to use:
  ✅ Need to find a subarray/substring that meets a condition
  ✅ Optimizing for longest/shortest subarray
  ✅ Tracking counts/frequencies in a window

Common Patterns:
  Longest Substring Without Repeating Chars
  Minimum Size Subarray Sum
  Find All Anagrams in a String
  Maximum Average Subarray
  Remove Duplicates from Sorted Array
