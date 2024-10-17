package src.main.java.medium;

//// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int longest = 0;
        char lastChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (i == 0) {
                sb.append(currentChar);
                continue;
            }
            if (currentChar == lastChar) {
                if (longest < sb.length()) {
                    longest = sb.length();
                }
                sb.delete(0, i);
                sb.append(currentChar);
                continue;
            }
            int index = sb.indexOf(String.valueOf(currentChar));
            if (index >= 0) {
                if (longest < sb.length()) {
                    longest = sb.length();
                }
                sb.delete(0, index + 1);
                sb.append(currentChar);
                lastChar = currentChar;
                continue;
            }
            sb.append(currentChar);
            lastChar = currentChar;
        }
        if (longest < sb.length()) {
            longest = sb.length();
        }
        return longest;
    }
}
