package AnimalPuppy;

/**
 * Created by y.bibik on 10.07.2016.
 */
public class Animal {

    private String kind; // вид
    private int pawscnt; // кол-во лап

    public Animal(String kind, int pawscnt) {
        this.kind = kind;
        this.pawscnt = pawscnt;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPawscnt() {
        return pawscnt;
    }

    public void setPawscnt(int pawscnt) {
        this.pawscnt = pawscnt;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", pawscnt=" + pawscnt +
                '}';
    }
}
