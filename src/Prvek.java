public class Prvek {
    int hodnota;
    boolean jePrvocislo;
    Prvek dalsi;

    public Prvek(int hodnota, Prvek dalsi) {
        this.hodnota = hodnota;
        this.jePrvocislo = true; //ze začátku chci vše true
        this.dalsi = dalsi;
    }

    @Override
    public String toString() {
        return "" + hodnota;
    }
}
