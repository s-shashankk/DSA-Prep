1️⃣ Fixed Size Window

👉 When the window size is given (k)
Use simple for or while, maintain sum/min/max inside the window.
Update when the window slides.

📌 Example: Max Sum Subarray of size k
## Template

    int maxSum(int[] nums, int k) {
    int sum = 0;
    for (int i = 0; i < k; i++) sum += nums[i];
    int max = sum;

    for (int i = k; i < nums.length; i++) {
        sum += nums[i] - nums[i-k]; // slide
        max = Math.max(max, sum);
    }
    return max;

2️⃣ Variable Size Window

👉 When you want longest/shortest subarray satisfying some condition

Expand with right

Shrink with left until condition is valid

📌 Example: Longest Substring Without Repeating Characters (LC 3)

    int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        while (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++; // shrink
        }
        set.add(s.charAt(right));
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen; }

✅ Trick:

Expand until invalid
Shrink until valid
Track answer during each step

3️⃣ Max / Min Inside Window

👉 When you need max/min value in each window (like LC 239 – Sliding Window Maximum)

Use Deque (Monotonic Queue) to keep only useful elements.

Remove smaller elements from back (for max), or larger elements (for min).

📌 Example: Sliding Window Maximum

    int[] maxSlidingWindow(int[] nums, int k) {
    Deque<Integer> dq = new LinkedList<>();
    int n = nums.length;
    int[] res = new int[n - k + 1];
    int idx = 0;

    for (int i = 0; i < n; i++) {
        // Remove out of window
        while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
        // Maintain decreasing order
        while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) dq.pollLast();
        dq.offerLast(i);

        if (i >= k - 1) res[idx++] = nums[dq.peekFirst()];
    }
    return res;
✅ Trick: Maintain a monotonic deque (increasing or decreasing).

4️⃣ Prefix Sum + Window

👉 For problems like min length subarray sum ≥ target

Expand right pointer while sum < target

Shrink left pointer while sum ≥ target

Track min length


⚡ Sliding Window Mantra
- Fixed window size → simple add/remove trick
- Variable window size → expand right, shrink left
- Need max/min in window → use Monotonic Deque

🔥 Pro Hack:
When you see words like:

"subarray of size k" → Fixed size window

"longest/shortest substring/subarray" → Variable window

"max/min in each window" → Monotonic Deque








