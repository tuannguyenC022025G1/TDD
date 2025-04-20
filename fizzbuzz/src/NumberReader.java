public class NumberReader {
    private static final String[] units = {
            "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"
    };

    public static String convertToWords(int number) {
        if (number < 0 || number >= 100) {
            throw new IllegalArgumentException("Chỉ hỗ trợ số từ 0 đến 99");
        }

        if (number < 10) {
            return units[number];
        }

        int tens = number / 10;
        int ones = number % 10;

        StringBuilder result = new StringBuilder();
        result.append(units[tens]).append(" mươi");

        if (ones != 0) {
            result.append(" ").append(units[ones]);
        }

        return result.toString().trim();
    }
}
