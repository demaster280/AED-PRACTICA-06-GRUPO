
public class Node<T>{
   private T data;
   private Node<T>  next; 
   public Node(T data){
       this (data, null);            
   }
   public Node(T data, Node<T> next){
       this.data = data;
       this.next = next;
   }
   public T getData(){
       return this.data;
   }
   public Node<T> getnext(){
       return this.next;
   }
   public void setData(T data){
       this.data = data;
   }
   public void setnext (Node<T> next){
       this.next = next; 
   } 
}



