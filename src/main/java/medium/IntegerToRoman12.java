package src.main.java.medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman12 {
    public static void main(String[] args) {
        int num = 3888;
        System.out.println(intToRoman(num));
    }

    static String intToRoman(int num) {
        Map<Integer, String[]> symbolsByRank = new HashMap<>();
        symbolsByRank.put(0, new String[]{"I", "V", "IX"});
        symbolsByRank.put(1, new String[]{"X", "L", "XC"});
        symbolsByRank.put(2, new String[]{"C", "D", "CM"});
        symbolsByRank.put(3, new String[]{"M", "", ""});
        StringBuilder sb = new StringBuilder(20);
        int i = 0;

        while (num != 0) {
            int remainder = num % 10;
            num /= 10;
            sb.insert(0, getRankAsRoman(remainder, symbolsByRank.get(i)));
            i++;
        }
        return sb.toString();
    }

    static String getRankAsRoman(int remainder, String[] romans) {
        StringBuilder result = new StringBuilder();
        if (remainder < 4) {
            for (int j = 0; j < remainder; j++) {
                result.append(romans[0]);
            }
        }
        if (remainder == 4) {
            result.append(romans[0]);
            result.append(romans[1]);
        }
        if (remainder == 5) {
            result.append(romans[1]);
        }
        if (remainder > 5 && remainder < 9) {
            result.append(romans[1]);
            for (int j = 0; j < remainder - 5; j++) {
                result.append(romans[0]);
            }
        }
        if (remainder == 9) {
            result.append(romans[2]);
        }
        return result.toString();
    }
}
