
package tdalist;
public interface TDAList<T> {
    //Determina si la lista esta vacia
    boolean isEmptyList();
    //Determina la cantida de los elementos que hay en la lista
    int length();
    // Elimina los elementos de la lista dejandola vacia
    void destroyList();
    //Verifica si el elemento esta o no en la lista
    int search(T x);
    // Inserta un nuevo elemento al INICIO de la lista
    void insertFirst(T x);
    // Inserta un nuevo elemento al FINAL de la lista
    void insertLast(T x);
    //Elimina un elemento de la lista
    void removeNode(T x);
}






