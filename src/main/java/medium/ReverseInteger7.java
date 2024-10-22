package src.main.java.medium;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReverseInteger7 {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));


    }


    public static int reverse(int x) {
        if (x > -10 && x < 10) return x;
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (x != 0) {
            if (x % 10 == 0 && i == 0) {
                x /= 10;
                continue;
            }
            list.add(x % 10);
            x /= 10;
            i++;
        }
        long result = 0;
        for (int j = 0; j <= list.size(); j++) {
            if (j == list.size() - 1) {
                result += list.get(j);
                break;
            }
            result += list.get(j) * (long)Math.pow(10 ,(list.size() - j - 1));
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)result;
    }
}
