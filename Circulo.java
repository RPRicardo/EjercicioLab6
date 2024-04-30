public class Circulo{
    private double radio;
    private String color;
    
    public Circulo (float radio, String color){
        this.radio=radio;
        this.radio=radio;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return 3.141592265 * radio*radio;
    }
    public double getPerimetro(){
        return 3.141592265 *2 *radio;
    }
     public String toString() {
        return "Circulo[radius=" + radio + ", color=" + color + "]";
    }
     public static void main(String[] args) {
        Circulo circulo1 = new Circulo(4, "rojo");

        
        System.out.println(circulo1.getColor());
        System.out.println(circulo1.getArea());
        System.out.println(circulo1.getPerimetro());
        System.out.println(circulo1.toString());
    }
}
