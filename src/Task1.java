public class Task1 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(2, 5);
        r1.show();
        r2.show();
        r1.addition(r2);
        r1.show();
        r1.subtraction(r2);
        r1.show();
        r1.division(5);
        r1.show();
        r1.multiplication(10);
        r1.show();
    }
}
