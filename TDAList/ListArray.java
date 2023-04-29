import tdalist.TDAList;
//Clase ListArray
public class ListArray<T> implements TDAList<T> {
    private int maxSize;
    private int length;
    private T[] listArray;
    public ListArray(int size) {
        maxSize = size;
        length = 0;
        listArray = (T[]) new Object[maxSize];
    }
    //Metodo isEmptyList: Muestra si la lista esta vacia 
    public boolean isEmptyList() {
        //retorna True: si la lista esta vacia
        //retorna False; si la lista NO esta vacia
        return length == 0;
    }
    //Metodod length: Muestra la cantidad de los elementos
    public int length() {
        return length;
    }
    //Metodo destroyList: Elimina los elementos - La lista se vuelve vacia
    public void destroyList() {
        length = 0;
        listArray = (T[]) new Object[maxSize];
    }
    //Metodo search: Busca un elemento de la lista
    public int search(T x) {
        for (int i = 0; i < length; i++) {
            //compara el elemento que se esta buscando en la lista
            if (listArray[i].equals(x)) {
                //elemento encontrado
                return i;
            }
        }
        //elemento no encontrado
        return -1;
    }
    //Metodo insertFirst: Inserta un elemento al inicio de la lista    
    public void insertFirst(T x) {
        //verifica si la lista esta llena
        //La capacidad máxima de la lista se define en la variable maxSize en la clase ListArray
        if (length == maxSize) {
            System.out.println("La lista está llena.");
            return;
        }
        //mueve los elementos una posicion adelante
        for (int i = length; i > 0; i--) {
            listArray[i] = listArray[i-1];
        }
        //inserta el nuevo elemento en la posicion 0
        listArray[0] = x;
        length++;
    }
    //Metodo insertLast:  
    public void insertLast(T x) {
        //verifica si la lista esta llena
        //La capacidad máxima de la lista se define en la variable maxSize en la clase ListArray
        if (length == maxSize) {
            System.out.println("La lista está llena.");
            return;
        }
        //inserta el nuevo elemento en la ultima posicion 
        listArray[length] = x;
        length++;
    }  
    //Metodo removeNode: Elimina un elemento de la lista
    public void removeNode(T x) {
        //Busca y guarda la posicion que se quiere eliminar
        int pos = search(x);
        //verifica si el elemento esta en la lista        
        if (pos == -1) {
            System.out.println("El elemento no está en la lista.");
            return;
        }
        // Elimina el elemento x y mueve los elementos hacia la izquierda
        for (int i = pos; i < length-1; i++) {
            listArray[i] = listArray[i+1];
        }
        // Decrementa la longitud de la listav
        length--;
        //elimina la última posición
        listArray[length] = null;
    }
    public String toString() {
        if (length == 0) {
            return "La lista está vacía.";
        }
        String res = "[";
        for (int i = 0; i < length-1; i++) {
            res += listArray[i].toString() + ", ";
        }
        res += listArray[length-1].toString() + "]";
        return res;
    }

}

