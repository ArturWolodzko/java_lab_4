import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów



        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        Student artur = new Student(190, 21, 2, "ciemny", "informatyczny");
        Student marek = new Student(179, 23, 3, "blond", "mechaniczny");

        Pracownik radek = new Pracownik(185, 26, "autmoatyk", 5600, "pełny");
        Pracownik arek = new Pracownik(195, 43, "mechanik", 5400, "3/4");

        Kierownik marekS = new Kierownik(186, 47, "IT", 12000, 1);
        Kierownik arturW = new Kierownik(186, 21, "mechaniczny", 16000, 1);

        List<PracownikI> pracownikIList = new ArrayList<>();

        pracownikIList.add(arturW);
        pracownikIList.add(marekS);
        pracownikIList.add(arek);
        pracownikIList.add(radek);

        for (PracownikI s : pracownikIList) {
            s.toString();


        }


        System.out.println("\n"+artur);
        System.out.println(marek);
        System.out.println(radek);
        System.out.println(arek);


    }
}
