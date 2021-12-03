public class Prostokąt extends Figura{


    @Override
    double Pole(double x, double y) {
        return x*y;
    }

    @Override
    double Obwód(double x, double y) {
        return (x*2)+(y*2);
    }
    @Override
    public void nawzwaFigury(String nazwa) {
        super.nawzwaFigury(nazwa);
    }
}
