import java.util.*;
class SimpleLinkedList<T> {
    class Node<T>{
        T value;
        Node<T> next;
        Node(T value,Node next){
            this.value=value;
            this.next=next;
        }
        Node(T value){
            this.value=value;
            this.next=null;
        }
        
    };
    Node<T> playlist=null;
    SimpleLinkedList() {
        
    }

    SimpleLinkedList(T[] values) {
        Node<T> temp=null;
        for(int i=0; i<values.length; i++){
           if(i==0){
               this.playlist=new Node<T>(values[i]);
               temp=this.playlist;
           }
            else{
                temp.next=new Node<T>(values[i]);
                temp=temp.next;
            }
        }
    }

    void push(T value) {
        Node<T> temp= this.playlist;
        playlist=new Node<T>(value);
        playlist.next=temp;
    }

    T pop() {
        if(this.playlist != null){
            T t=this.playlist.value;
            this.playlist=this.playlist.next;
            return t;
        }
        throw new NoSuchElementException();
    }

    void reverse() {
        Node prev=null;
        Node curr=this.playlist;
        Node frwd=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=frwd;
            if(frwd!=null)
                frwd=frwd.next;
        }
        this.playlist=prev;
    }
    
    <R> R[] asArray(Class<R> clazz) {
       ArrayList<R> arr=new ArrayList<>();
       if(this.playlist!=null){
           Node<T> temp=this.playlist;
           while(temp!=null){
               arr.add((R)temp.value);
               temp=temp.next;
            }
        }
        return (R[]) arr.toArray();
    }

     int size() {
        if(this.playlist==null){
            return 0;
        }
        int s=0;
        Node temp=this.playlist;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
    }
}