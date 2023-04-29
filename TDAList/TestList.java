
import java.util.Comparator;

public class TestList {
    public static void main(String[] args) {
        
        /*
        // Crear una lista de enteros
        ListArray<Integer> intList = new ListArray<>(5);
        // Agregar elementos
        intList.insertFirst(10);
        intList.insertLast(20);
        intList.insertFirst(5);
        intList.insertLast(25);
        intList.insertFirst(5);
        // Imprimir la lista
        System.out.println("Lista de enteros: " + intList.toString());
        // Buscar elementos
        int pos1 = intList.search(20);
        int pos2 = intList.search(15);
        System.out.println("Posición del elemento 20: " + pos1);
        System.out.println("Posición del elemento 15: " + pos2);
        // Eliminar elementos
        intList.removeNode(20);
        System.out.println("Lista de enteros despues de eliminar 20: " + intList.toString());
        // Crear una lista de cadenas
        ListArray<String> stringList = new ListArray<>(4);
        // Agregar elementos
        stringList.insertFirst("Hola");
        stringList.insertFirst("prueba");
        stringList.insertLast("Mundo");
        stringList.insertFirst("comida");
        // Imprimir la lista
        System.out.println("Lista de cadenas: " + stringList.toString());
        // Buscar elementos
        int pos3 = stringList.search("Hola");
        int pos4 = stringList.search("Adios");
        System.out.println("Posición del elemento Hola: " + pos3);
        System.out.println("Posición del elemento Adios: " + pos4);
        // Eliminar elementos
        stringList.removeNode("Mundo");
        System.out.println("Lista de cadenas despues de eliminar Mundo: " + stringList.toString());
    }

        
    */
        /*
    ListLinked<Integer> lista1 = new ListLinked<Integer>();  
    // Verificar si la lista está vacía
    System.out.println("La lista1 esta vacia: " + lista1.isEmptyList());
    // Insertar elementos al inicio de la lista
    lista1.insertFirst(3);
    lista1.insertFirst(7);
    lista1.insertFirst(9);
    lista1.insertFirst(1);
    // Verificar la longitud de la lista
    System.out.println("La longitud de la lista1 es: " + lista1.length());  
    // Verificar si la lista está vacía
    System.out.println("La lista1 esta vacia: " + lista1.isEmptyList());
    // Buscar elementos en la list
    System.out.println("El elemento 9 se encuentra en la posicion: " + lista1.search(9));
    System.out.println("El elemento 2 se encuentra en la posicion: " + lista1.search(2));
    // Eliminar elementos de la lista
    lista1.removeNode(9);
    lista1.removeNode(2);  
    // Verificar la longitud de la lista
    System.out.println("La longitud de la lista1 es: " + lista1.length());
    // Insertar elementos al final de la lista
    lista1.insertLast(5);
    lista1.insertLast(2);  
    // Verificar la longitud de la lista
    System.out.println("La longitud de la lista1 es: " + lista1.length());
    // Imprimir la lista
    System.out.println("Lista1: " + lista1.toString());
    // Crear la segunda lista enlazada
    ListLinked<Integer> lista2 = new ListLinked<Integer>();
    // Insertar elementos al final de la lista
    lista2.insertLast(2);
    lista2.insertLast(4);
    lista2.insertLast(6);
    lista2.insertLast(8);
    // Verificar la longitud de la lista
    System.out.println("La longitud de la lista2 es: " + lista2.length());
    // Imprimir la lista
    System.out.println("Lista2: " + lista2.toString());
    }       
    
    */
        
    
        // Crear objetos Person
        Person person1 = new Person("Jose", "Challa", 25);
        Person person2 = new Person("Eduardo", "Rivera", 30);
        Person person3 = new Person("Luis", "Martines", 40);
        // Crear objeto ListArray de Person
        ListArray<Person> listArray = new ListArray<Person>(3);
        System.out.println("ListArray isEmptyList: " + listArray.isEmptyList());
        // Insertar elementos en el ListArray
        listArray.insertFirst(person1);
        listArray.insertLast(person2);
        listArray.insertLast(person3);
        // Mostrar los elementos del ListArray
        System.out.println("ListArray elements: " + listArray.toString());
        // Eliminar un elemento del ListArray
        listArray.removeNode(person2);
        System.out.println("ListArray elements: " + listArray.toString());
        // Crear objeto ListLinked de Person
        ListLinked<Person> listLinked = new ListLinked<Person>();
        System.out.println("ListLinked isEmptyList: " + listLinked.isEmptyList());
        // Insertar elementos en el ListLinked
        listLinked.insertFirst(person1);
        listLinked.insertLast(person2);
        listLinked.insertLast(person3);
        // Mostrar los elementos del ListLinked
        System.out.println("ListLinked elements: " + listLinked.toString());
        // Eliminar un elemento del ListLinked
        listLinked.removeNode(person1);
        System.out.println("ListLinked elements: " + listLinked.toString());
    }
    */
    /*
    // Crear una lista ordenada de enteros
        OrderListLinked<Integer> list1 = new OrderListLinked<>();
        list1.insert(5);
        list1.insert(2);
        list1.insert(10);
        list1.insert(8);
        System.out.println("Lista de enteros: " + list1.toString());

        // Crear una lista ordenada de cadenas
        OrderListLinked<String> list2 = new OrderListLinked<>();
        list2.insert("perro");
        list2.insert("gato");
        list2.insert("conejo");
        list2.insert("raton");
        System.out.println("Lista de cadenas: " + list2.toString());


    }
    
    /*
    OrderListLinked<Person> personList = new OrderListLinked<>(Comparator.comparing(Person::getAge));
    // Agregar personas en orden
    personList.insert(new Person("Juan", "Perez", 25));
    personList.insert(new Person("Maria", "Garcia", 30));
    personList.insert(new Person("Luis", "Martinez", 20));
    personList.insert(new Person("Ana", "Rodriguez", 35));
    // Imprimir la lista ordenada
    System.out.println(personList.toString());
    // Buscar una persona por edad
    Person p = personList.search(new Person("", "", 20));
    System.out.println("Persona encontrada: " + p.toString());    
    // Eliminar una persona por edad
    personList.removeNode(new Person("", "", 30));
    System.out.println(personList.toString());
    }
    */
}
