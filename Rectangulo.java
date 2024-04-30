public class Rectangulo{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        return altura * base;
    }

    public double getPerimetro() {
        return 2 * (altura + base);
    }

    public static void main(String[] args) {
        Rectangulo rectan = new Rectangulo(4, 5);

        System.out.println(rectan.getAltura());
        System.out.println(rectan.getBase());
        System.out.println(rectan.getArea());
        System.out.println(rectan.getPerimetro());
        System.out.println(rectan);
    }
}
