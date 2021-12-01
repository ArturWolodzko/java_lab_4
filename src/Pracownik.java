public class Pracownik implements PracownikI {

    int wzrost;
    int wiek;
    String dzial;
    int wyplata;
    String etat;

    public Pracownik(int wzrost, int wiek, String dzial, int wyplata, String etat) {
        this.wzrost = wzrost;
        this.wiek = wiek;
        this.dzial = dzial;
        this.wyplata = wyplata;
        this.etat = etat;
    }

    @Override
    public String toString() {
        System.out.println( "Pracownik{" +
                "wzrost=" + wzrost +
                ", wiek=" + wiek +
                ", dzial='" + dzial + '\'' +
                ", wyplata=" + wyplata +
                ", etat='" + etat + '\'' +
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

    public int getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
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
