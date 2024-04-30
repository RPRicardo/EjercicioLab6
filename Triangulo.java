public class Triangulo {
  private double base;
  private double altura;

  public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }

  public double getArea() {
    return (base * altura)/2;
  }

  public double getPerimetro() {
    return base + base + base;
  }

  public static void main(String[] args) {
    Triangulo tria = new Triangulo(5, 10);
    System.out.println(tria.getBase());
    System.out.println(tria.getAltura());
    System.out.println(tria.getArea());
    System.out.println(tria.getPerimetro());
    System.out.println(tria);
  }
}



