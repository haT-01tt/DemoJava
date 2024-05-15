package Exercise;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static final Map<Character, Integer> ROMAN_VALUES = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
            );
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = ROMAN_VALUES.get(s.charAt(i));
            total += currentValue >= prevValue ? currentValue : -currentValue;
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
}

