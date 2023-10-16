import static java.lang.Math.min;

public class CustomMath {
    public static int maxDiv(int a, int b) {
        int n = min(a, b);
        for (int i = n; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }

    public static int minKrat(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int lcm = max; // Починаємо з максимального числа

        // Шукаємо НСК
        while (true) {
            if (lcm % min == 0 && lcm % max == 0) {
                break;
            }
            lcm += max;
        }
        return lcm;
    }
}
