package Practice_Que.src;

import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        int odd = 0;
        int even = 0;
        int place = 1;
        
        while (n > 0) {
            int rem = (int)n % 10; 
            n /= 10;

            if (place % 2 == 0) even += rem;

            else odd += rem;

            place++;
        }

        System.out.println(odd);
        System.out.println(even);

        scanner.close();
    }
}
