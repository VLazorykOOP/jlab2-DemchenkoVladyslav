import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println(CustomMath.maxDiv(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
            System.out.println(CustomMath.minKrat(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        } else {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(CustomMath.maxDiv(a, b));
            System.out.println(CustomMath.minKrat(a, b));
        }
    }
}

