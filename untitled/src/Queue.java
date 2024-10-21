import java.util.*;
import java.util.LinkedList;

public class Queue {


    public static void main(String[] args){
//        java.util.Queue<Integer> q= new LinkedList<>();
        java.util.Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        System.out.println(q.remove());
//        q.add(6);
//        System.out.println(q.remove());
//        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}


///*using arrayList*/
//static class QueueY{
//    static int arr[];
//    static int size;
//    static int rear = -1;
//
//    QueueY(int n ){
//        arr = new int[n];
//        this.size= n;
//    }
//    public static boolean isEmpty(){
//        return rear==-1;
//    }
//
//    //enqueue
//    public static void add(int data){
//        if( rear == size -1){
//            System.out.println("full q");
//            return;
//        }
//        rear++;
//        arr[rear]=data;
//    }
//
//    //dequeue-O(n)
//    public static int remove(){
//        if(isEmpty()){
//            System.out.println("empty q");
//            return -1;
//        }
//        int front = arr[0];
//        for(int i=0;i<rear;i++){
//            arr[i]=arr[i+1];
//        }
//        rear--;
//        return front;
//    }
//    //peek
//    public static int peek(){
//        if(isEmpty()){
//            System.out.println("empty q");
//            return -1;
//        }
//        return arr[0];
//
//    }
//}
//public static void main(String args[]){
//    QueueY q= new QueueY(5);
//    q.add(1);
//    q.add(2);
//    q.add(3);
//
//    while(!q.isEmpty()){
//        System.out.println(q.peek());
//        q.remove();
//    }
//}
//}
//

//
//
///*cirqular using arrayList*/
//static class QueueY{
//    static int arr[];
//    static int size;
//    static int rear = -1;
//    static int front = -1;
//
//
//    QueueY(int n ){
//        arr = new int[n];
//        this.size= n;
//    }
//    public static boolean isEmpty(){
//        return rear==-1 && front==-1;
//    }
//    public static boolean isFull(){
//        return(rear+1)%size ==front;
//    }
//
//    //enqueue
//    public static void add(int data){
//        if(isFull()){
//            System.out.println("full q");
//            return;
//        }
//        //1st ele add
//        if(front==-1){
//            front = 0;
//        }
//        rear=(rear+1)%size;
//        arr[rear]=data;
//    }
//
//    //dequeue-O(1)
//    public static int remove(){
//        if(isEmpty()){
//            System.out.println("empty q");
//            return -1;
//        }
//        int result = arr[front];
//        //single ele condition
//        if(rear==front){
//            rear= front =-1;
//        }else{
//            front = (front+1)%size;
//        }
//
//        return result;
//    }
//    //peek
//    public static int peek(){
//        if(isEmpty()){
//            System.out.println("empty q");
//            return -1;
//        }
//        return arr[front];
//
//    }
//}




///*q using linkedList*/
//static class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        next = null;
//    }
//}
//static class QueueY{
//    static Node head=null;
//    static Node tail=null;
//
//
//
//    public static boolean isEmpty(){
//        return head==null & tail== null;
//    }
//
//
//    //enqueue
//    public static void add(int data){
//        Node newNode = new Node(data);
//        if(tail==null){
//            tail=head=newNode;
//            return;
//        }
//        tail.next=newNode;
//        tail=newNode;
//    }
//
//    //dequeue-O(1)
//    public static int remove(){
//        if(isEmpty()){
//            System.out.println("empty q");
//            return -1;
//        }
//        int front = head.data;
//        if(head==tail){
//            tail=null;
//        }
//        head=head.next;
//        return front;
//    }
//    //peek
//    public static int peek(){
//        if(isEmpty()){
//            System.out.println("empty q");
//            return -1;
//        }
//        return head.data;
//
//    }
//}
//public static void main(String args[]){
//    QueueY q= new QueueY();
//    q.add(1);
//    q.add(2);
//    q.add(3);
//    q.add(4);
//    q.add(5);
////        System.out.println(q.remove());
////        q.add(6);
////        System.out.println(q.remove());
////        q.add(7);
//
//    while(!q.isEmpty()){
//        System.out.println(q.peek());
//        q.remove();
//    }
//}
//}


