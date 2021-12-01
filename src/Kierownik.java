public class Kierownik implements PracownikI{

    int wzrost;
    int wiek;
    String dzial;
    int wypłata;
    int etat;

    public Kierownik(int wzrost, int wiek, String dzial, int wypłata, int etat) {
        this.wzrost = wzrost;
        this.wiek = wiek;
        this.dzial = dzial;
        this.wypłata = wypłata;
        this.etat = etat;
    }

    @Override
    public String toString() {
        System.out.println( "Kierownik{" +
                "wzrost=" + wzrost +
                ", wiek=" + wiek +
                ", dzial='" + dzial + '\'' +
                ", wypłata=" + wypłata +
                ", etat=" + etat +
                '}');
        return "";
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getDzial() {
        return dzial;
    }

    public void setDzial(String dzial) {
        this.dzial = dzial;
    }

    public int getWypłata() {
        return wypłata;
    }

    public void setWypłata(int wypłata) {
        this.wypłata = wypłata;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }




    @Override
    public int wzrost() {
        return 0;
    }

    @Override
    public int wiek() {
        return 0;
    }

    @Override
    public String dzial() {
        return null;
    }

    @Override
    public int wyplata() {
        return 0;
    }

    @Override
    public String etat() {
        return null;
    }
}
