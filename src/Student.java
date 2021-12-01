public class Student implements StudentI{

    int wzrost;
    int wiek;
    int rokStudiow;
    String kolorWlosow;
    String wydział;

    public Student(int wzrost, int wiek, int rokStudiow, String kolorWlosow, String wydział) {
        this.wzrost = wzrost;
        this.wiek = wiek;
        this.rokStudiow = rokStudiow;
        this.kolorWlosow = kolorWlosow;
        this.wydział = wydział;
    }

    @Override
    public String toString() {
        return "Student{" +
                "wzrost=" + wzrost +
                ", wiek=" + wiek +
                ", rokStudiow=" + rokStudiow +
                ", kolorWlosow='" + kolorWlosow + '\'' +
                ", wydział='" + wydział + '\'' +
                '}';
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

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public String getKolorWlosow() {
        return kolorWlosow;
    }

    public void setKolorWlosow(String kolorWlosow) {
        this.kolorWlosow = kolorWlosow;
    }

    public String getWydział() {
        return wydział;
    }

    public void setWydział(String wydział) {
        this.wydział = wydział;
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
    public int rokStudiow() {
        return 0;
    }

    @Override
    public String kolorWlosow() {
        return null;
    }

    @Override
    public String wydział() {
        return null;
    }
}
