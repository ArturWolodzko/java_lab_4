public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Figura prostokat = new Prostokąt();
        Figura kwadrat = new kwadrat();

        kwadrat.Pole(5,5);
        kwadrat.Obwód(5,5);
        kwadrat.nawzwaFigury("kwadrat");
        prostokat.Obwód(5,7);
        prostokat.Pole(5,7);
        kwadrat.nawzwaFigury("prostokąt jego obwód to :"+ prostokat);




    }
}
