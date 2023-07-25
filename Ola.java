public class Ola<O> {
    O prew;
    Ola<O> next;

    public Ola(O prew, Ola<O> next) {
        this.prew = prew;
        this.next = next;
    }

    public (O, prew) {
        this(prew, null);
    }

    public Ola() {
        this(null, null);
    }



}
