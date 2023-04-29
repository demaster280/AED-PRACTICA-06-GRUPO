import tdalist.TDAList;
public class ListLinked<T> implements TDAList<T> {
    Node<T> first;
    int length;
    public ListLinked() {
        first = null;
        length = 0;
    }
    // Metodo isEmptyList: Muestra si la lista esta vacia 
    public boolean isEmptyList() {
        //retorna True: si la lista esta vacia
        //retorna False si la lista NO esta vacia
        return first == null;
    }
    // Metodo length: Muestra la cantidad de los elementos
    public int length() {
        return length;
    }
    // Metodo destroyList: Elimina los elementos - La lista se vuelve vacia
    public void destroyList() {
        first = null;
        length = 0;
    }
    // Metodo search: Busca un elemento de la lista
    public int search(T x) {
        int pos = 0;
        Node<T> current = first;
        while (current != null) {
            //compara el elemento ingresado con la lista
            if (current.getData().equals(x)) {
                return pos;
            }
            pos++;
            current = current.getnext();
        }
        return -1;
    }
    // Metodo insertFirst: Inserta un elemento al inicio de la lista    
    public void insertFirst(T x) {
        Node<T> newNode = new Node<T>(x);
        newNode.setnext(first);
        first = newNode;
        length++;
    }
    // Metodo insertLast: Inserta un elemento al final de la lista    
    public void insertLast(T x) {
        Node<T> newNode = new Node<T>(x);
        if (first == null) {
            first = newNode;
        } else {
            Node<T> current = first;

            while (current.getnext() != null) {
                current = current.getnext();
            }
            current.setnext(newNode);
        }
        length++;
    }
    // Metodo removeNode: Elimina un elemento de la lista
    public void removeNode(T x) {
        //verifica si la lista esta vacia
        if (first == null) {
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
        while (current != null) {
            if (current.getData().equals(x)) {
                previous.setnext(current.getnext());
                length--;
                return;
            }
            previous = current;
            current = current.getnext();
        }
        System.out.println("El elemento no esta en la lista.");
    }
    public String toString() {
        if (first == null) {
            return "La lista está vacía.";
        }
        String res = "[";
        Node<T> current = first;
        while (current.getnext() != null) {
            res += current.getData().toString() + ", ";
            current = current.getnext();
        }
        res += current.getData().toString() + "]";
        return res;
    }
}
