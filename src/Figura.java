abstract class Figura {

    public static final int liczbaObiektów=1;

    abstract double Pole(double x, double y);

    public void nawzwaFigury(String nazwa){
        System.out.println("to jest figura: "+ nazwa);
    }

    abstract double Obwód(double x, double y);
}
