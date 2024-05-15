package Ver1;

import java.text.DecimalFormat;

public class CurrencyConverter {
    private static final String[] UNITS = {
            "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"
    };

    private static final String[] STEPS = {
            "", "nghìn", "triệu", "tỷ"
    };

    private static String convertGroupOfThree(int number) {
        String result = "";
        int hundredDigit = number / 100;
        int tenDigit = (number % 100) / 10;
        int unitDigit = number % 10;

        if (hundredDigit > 0) {
            result += UNITS[hundredDigit] + " trăm ";
        }

        if (tenDigit > 1) {
            result += UNITS[tenDigit] + " mươi ";
            if (unitDigit > 0) {
                result += UNITS[unitDigit];
            }
        } else if (tenDigit == 1) {
            if (unitDigit > 0) {
                if (unitDigit == 5) {
                    result += "mười lăm";
                } else {
                    result += "mười " + UNITS[unitDigit];
                }
            } else {
                result += "mười";
            }
        } else {
            if (unitDigit > 0) {
                result += UNITS[unitDigit];
            }
        }

        return result;
    }

    private static String convertToWords(int number) {
        if (number == 0) {
            return UNITS[0];
        }

        String result = "";
        int groupCount = 0;

        while (number > 0) {
            int groupOfThree = number % 1000;
            number /= 1000;

            if (groupOfThree > 0) {
                result = convertGroupOfThree(groupOfThree) + " " + STEPS[groupCount] + " " + result;
            }

            groupCount++;
        }

        return result.trim();
    }

    public static String convertToCurrency(double amount) {
        DecimalFormat format = new DecimalFormat("#");
        String amountString = format.format(amount);
        int intValue = Integer.parseInt(amountString);

        return convertToWords(intValue) + " đồng";
    }

    public static void main(String[] args) {
        double amount = 1000004444;
        String currencyInWords = convertToCurrency(amount);
        System.out.println(currencyInWords);
    }
}

