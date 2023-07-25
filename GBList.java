public interface GBList<E> extends Iterable<E>{
    boolean add(String string);
    void remove(int index);

    E get (int index);

    int size();

    void update(int index, E e);
    void add(int i);

}
