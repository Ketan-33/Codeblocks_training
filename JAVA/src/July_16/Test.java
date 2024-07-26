package July_16;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
    
    public static boolean isArmstrong(int num) {
        int og = num;
        int result = 0;
            int n = 0;
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                n++;
            }
        
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }
        
        if(result == og)return true;
        else return false;
    }
}
