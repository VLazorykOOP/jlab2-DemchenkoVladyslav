public class Triangle {
    Double a;
    Double b;
    Double c;
    public Triangle(Double a, Double b, Double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("торона не можу бути від'ємною");
        }
        if (a >= (b + c) || b >= (a + c) || c >= (b + a)) {
            throw new IllegalArgumentException("Сторона трикутника має бути меншою за суму інших двох сторін");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Double perimeter()
    {
        return a+b+c;
    }
    public Double square()
    {
        Double p = perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
