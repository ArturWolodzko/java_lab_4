public class Dom implements Budynek {
    private double powierzchnia;
    private String adresBudynku;
    private int liczbaOkien;
    private int liczbaMieszkancow;
    private KolorDomu kolorDomu;

    public void setOknoLudzie(int oknoLudzie) {
        this.oknoLudzie = oknoLudzie;
    }

    private int oknoLudzie;

    public int getOknoLudzie() {
        return oknoLudzie;
    }

    public Dom(double powierzchnia, String adresBudynku, int liczbaOkien, int liczbaMieszkancow, KolorDomu kolorDomu, int oknoLudzie) {
        this.powierzchnia = powierzchnia;
        this.adresBudynku = adresBudynku;
        this.liczbaOkien = liczbaOkien;
        this.liczbaMieszkancow = liczbaMieszkancow;
        this.kolorDomu = kolorDomu;
        this.oknoLudzie=oknoLudzie;

    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public void setAdresBudynku(String adresBudynku) {
        this.adresBudynku = adresBudynku;
    }

    public void setLiczbaOkien(int liczbaOkien) {
        this.liczbaOkien = liczbaOkien;
    }

    public void setLiczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public void setKolorDomu(KolorDomu kolorDomu) {
        this.kolorDomu = kolorDomu;
    }


    public double getPowierzchnia() {
        return powierzchnia;
    }

    public String getAdresBudynku() {
        return adresBudynku;
    }

    public int getLiczbaOkien() {
        return liczbaOkien;
    }

    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }

    public KolorDomu getKolorDomu() {
        return kolorDomu;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "powierzchnia=" + powierzchnia +
                ", adresBudynku='" + adresBudynku + '\'' +
                ", liczbaOkien=" + liczbaOkien +
                ", liczbaMieszkancow=" + liczbaMieszkancow +
                ", kolorDomu=" + kolorDomu +
                oknoLudzie+
                '}';
    }

    @Override
    public double powierzchnia(double pow) {
        return 0;
    }

    @Override
    public String adresbudynku(String adres) {
        return null;
    }

    @Override
    public int liczbaOkien(int okna) {
        return 0;
    }

    @Override
    public void liczbaMieszkancow(int mieszkancy) {

    }

    @Override
    public void KolorDomu(KolorDomu kolor) {

    }

    @Override
    public void oknoLudzie(int okna, int mieszkancy) {
        System.out.printf("na jednego mieszkańca przypada %d okien"+(getLiczbaOkien()/getLiczbaMieszkancow()));
        return;

    }
}
