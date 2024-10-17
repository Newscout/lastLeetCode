package src.main.java.easy;

// https://leetcode.com/problems/valid-anagram/description/?envType=problem-list-v2&envId=string&difficulty=EASY


public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t)); // true


    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 97;
            counts[ch]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int ch = t.charAt(i) - 97;
            counts[ch]--;
            if (counts[ch] < 0) {
                return false;
            }
        }
        return true;
    }
}
