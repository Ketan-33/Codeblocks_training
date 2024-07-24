import java.util.Scanner;

public class Chewbecca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(Chew(n));
    }

    public static long Chew(long n) {
        long result = 0;
        long multiplier = 1;
        boolean isFirstDigit = true;

        while (n > 0) {
            int digit = (int) (n % 10);
            n /= 10;
            int invertedDigit = 9 - digit;

            if (isFirstDigit) {
                // Avoid leading zero
                if (invertedDigit != 0) {
                    result += Math.min(digit, invertedDigit) * multiplier;
                } else {
                    result += digit * multiplier;
                }
                isFirstDigit = false;
            } else {
                result += Math.min(digit, invertedDigit) * multiplier;
            }

            multiplier *= 10;
        }

        return result;
    }
}
