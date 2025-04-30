package com.interview.add;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddLargeNumbers {
    public static void main(String[] args) {
        String strSum = addLargeNumbers("9565656", "974");
        System.out.println(strSum);
    }

    private static String addLargeNumbers(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        List<Character> result = new ArrayList<>();
        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            int current = sum % 10;
            result.add((char) (current + '0'));
            i--;
            j--;
        }

        Collections.reverse(result);
        StringBuilder resultString = new StringBuilder(result.size());
        for (Character c : result) {
            resultString.append(c);
        }
        return resultString.toString();
    }
}
