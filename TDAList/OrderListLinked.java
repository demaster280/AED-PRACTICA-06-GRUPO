
import tdalist.TDAList;
public class OrderListLinked<T extends Comparable<T>> extends ListLinked<T> implements TDAList<T> {
    // Inserta un elemento en la lista manteniendo el orden
    public void insert(T x) {
        Node<T> newNode = new Node<T>(x);    
        if (isEmptyList()) {
            insertFirst(x);
            return;
        }
        if (x.compareTo(first.getData()) < 0) {
            insertFirst(x);
            return;
        }        
        Node<T> current = first;
        Node<T> previous = null;        
        while (current != null && x.compareTo(current.getData()) > 0) {
            previous = current;
            current = current.getnext();
        }        
        newNode.setnext(current);
        previous.setnext(newNode);
        length++;
    }    
    // Elimina un elemento de la lista manteniendo el orden
    public void remove(T x) {
        if (isEmptyList()) {
            System.out.println("La lista está vacía.");
            return;
        }        
        if (first.getData().equals(x)) {
            first = first.getnext();
            length--;
            return;
        }        
        Node<T> current = first;
        Node<T> previous = null;        
        while (current != null && !current.getData().equals(x)) {
            previous = current;
            current = current.getnext();
        }        
        if (current == null) {
            System.out.println("El elemento no está en la lista.");
            return;
        }        
        previous.setnext(current.getnext());
        length--;
    }    
    // Busca un elemento en la lista manteniendo el orden
    public int search(T x) {
        int pos = 0;
        Node<T> current = first;
        while (current != null) {
            if (current.getData().equals(x)) {
                return pos;
            }
            if (current.getData().compareTo(x) > 0) {
                return -1;
            }
            pos++;
            current = current.getnext();
        }
        return -1;
    }
}
