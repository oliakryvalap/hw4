import java.util.Iterator;

public class MenuList<O> implements GBList<O> {
    private Ola<O> head;
    private int size;

    public MenuList() {
        size = 0;
    }

    @Override
    public boolean add(O) {
        try {
            Ola<O> last = getOlaT();
            if(last==null){
                head = new Ola<O>(prew, last);
            }else {
                last.next = new Ola<O>(prew, last);
            }
            this.size++;
        } catch (ClassCastException e){
            return false;
        }
        return true;
    }

    public boolean add(O prew, int index)
    {
        if(index >= this.size) return this.add(prew, index);

        return  true;
    }

    @Override
    public void remove(int index) {

    }

    
    

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void update(int index, Object o) {

    }

    @Override
    public Iterator iterator() {   
        return null;
    }

    @Override
    public String toString() {
        if (head == null) return "{}";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Ola<O> Ola = head;
        stringBuilder.append(Ola.prew);
        while (Ola.next != null){
            Ola = Ola.next;
            stringBuilder.append(", ");
            stringBuilder.append(Ola);
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    private Ola<O> getOlaT(){
        if (head == null) return  null;
        Ola<O> currentOla = head;
        while (currentOla.next != null){
            currentOla = currentOla.next;
        }
        return currentOla;
    }

    private  Ola<O> getOlaT(int index) throws Exception{
        if (index >= this.size || index < 0) {
            throw new Exception();
        }

        int i = 0;
        Ola<O> currentOla = head;
        while (i != index){
            currentOla = currentOla.next;
            i++;
        }
        return currentOla;
    }

    @Override
    public O get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public boolean add(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void add(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

   

}

