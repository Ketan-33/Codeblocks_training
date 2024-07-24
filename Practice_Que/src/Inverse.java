import java.util.Scanner;

public class Inverse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int inverse = getInverse(n);
        
        System.out.println( inverse);
    }
    

    public static int getInverse(int n) {
        int inverse = 0;
        int position = 1;
        
        while (n != 0) {
            int digit = n % 10;
            inverse += position * Math.pow(10, digit - 1);
            n /= 10;
            position++;
        }
        
        return inverse;
    }
}
