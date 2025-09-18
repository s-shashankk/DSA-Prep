public class MaxVowelSubstring {
    public static void main(String[] args) {
        // Test cases
        System.out.println(maxVowels("abciiidef", 3)); // Expected 3
        System.out.println(maxVowels("aeiou", 2));     // Expected 2
        System.out.println(maxVowels("leetcode", 3));  // Expected 2
    }

    public static int maxVowels(String s, int k) {
        int sum = 0;

        // count vowels in first window
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (isVowel(c)) sum++;
        }

        int max = sum;

        // slide the window
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) sum++;       // add new char
            if (isVowel(s.charAt(i - k))) sum--;   // remove old char
            max = Math.max(max, sum);
        }

        return max;
    }

    private static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
