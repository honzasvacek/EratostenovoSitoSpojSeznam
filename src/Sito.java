import java.util.Iterator;

public class Sito implements Iterable<Integer>{
    int n;
    Prvek hlava = new Prvek(2, null);

    public Sito(int n) {
        this.n = n;
    }

    public void vytvorSeznam() {
        Prvek posldeni = hlava;
        for (int i = 3; i <= n; i++) {
            Prvek p = new Prvek(i, null);
            posldeni.dalsi = p;
            posldeni = p;
        }
    }

    public void najdiPrvocisla() {
        for (int i = 2; i <= n; i++) {
            Prvek posledni = hlava;
            for (;;) {
                if (posledni.hodnota == i && posledni.jePrvocislo == true) {
                    
                }
            }
        }
    }

    @Override
    public String toString() {
        while(hlava != null) {
            System.out.println(hlava);
            hlava = hlava.dalsi;
        }
        return "";
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
