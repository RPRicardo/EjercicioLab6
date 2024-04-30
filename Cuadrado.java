public class Cuadrado{

    private int lado;
    private String color;

    public Cuadrado(int lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    public int getLado() {
        return lado;
    }

    public int getArea() {
        return lado * lado;
    }

    public int getPerimetro() {
        return 4 * lado;
    }

    public String toString() {
        return "Cuadrado[lados=" + lado + "]";
    }

}

public class Main {

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(5);


        System.out.println(cuadrado1.getArea());
        System.out.println(cuadrado1.getPerimetro());
        System.out.println(cuadrado1.toString());
    }

} 
