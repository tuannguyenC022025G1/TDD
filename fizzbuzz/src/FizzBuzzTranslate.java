public class FizzBuzzTranslate {
    public static String translate(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        StringBuilder result = new StringBuilder();

        if (divisibleBy3 || contains3) {
            result.append("Fizz");
        }
        if (divisibleBy5 || contains5) {
            result.append("Buzz");
        }

        if (result.length() == 0) {
            return String.valueOf(number);
        }

        return result.toString();
    }
}
