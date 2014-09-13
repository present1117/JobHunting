package edu.columbia.xh2211.leetcode;

public class IntegertoRoman {
//	Given an integer, convert it to a roman numeral.
//
//	Input is guaranteed to be within the range from 1 to 3999.
	
	//Be careful and remember the process about the Roman number.
	public String intToRoman(int num) {
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder ret = new StringBuilder();
        for (int i=0; i<values.length; i++) {
            while (num >= values[i]) {
                ret.append(symbols[i]);
                num -= values[i];
            }
        }
        return new String(ret);
    }
}
