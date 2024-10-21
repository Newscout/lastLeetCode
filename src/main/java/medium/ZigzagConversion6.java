package src.main.java.medium;
//https://leetcode.com/problems/zigzag-conversion/

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int i = 3;
        System.out.println(convert(s, i).equals("PINALSIGYAHRPI"));
    }





    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int i = 0;
        int row = 0;
        int flag = 1;
        List<StringBuilder> list = new ArrayList<>(numRows);
        for (i = 0; i < s.length(); i++) {
            if (i < numRows) {
                list.add(new StringBuilder());
            }
            list.get(row).append(s.charAt(i));
            row += flag;
            if(row == numRows - 1) {
                flag = -1;
            }
            if (row == 0) {
                flag = 1;
            }
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder rowNum : list) {
            result.append(rowNum.toString());
        }
        return result.toString();
    }

}
