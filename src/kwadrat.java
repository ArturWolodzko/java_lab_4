public  class kwadrat extends Figura {


    @Override
    double Pole(double x, double y) {
        return x*y;
    }

    @Override
    double Obwód(double x, double y) {
        return (x+y)*2;
    }

    @Override
    public void nawzwaFigury(String nazwa) {
        super.nawzwaFigury(nazwa);
    }


}
