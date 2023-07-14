class Qnode{
    public int data;
    public Qnode next;
}
public class queueusinglinkedlist{
    private Qnode front;
    private Qnode rear;
    public queueusinglinkedlist(){
        this.front=null;
        this.rear=null;
    }
    public void enqueue(int i){
        Qnode node=new Qnode();
        if(front==null && rear==null){
            front=rear=node;
            node.data=i;
        }
        else{
            rear.next=node;
            rear=node;
            node.data=i;
        }
    }
    public void dequeue(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
        }
        else if(front==rear){
            System.out.println("Dequeued element is:"+front.data);
            front=rear=null;
        }
        else{
            System.out.println("Dequeued element is:"+front.data);
            front=front.next;
        }
    }
    public void display(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
        }
        else{
            Qnode current=this.front;
            System.out.println("Elements in queue are : ");
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    public static void main(String[] args) {
        queueusinglinkedlist qll=new queueusinglinkedlist();
        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);
        qll.enqueue(40);
        qll.enqueue(50);
        qll.display();
        qll.dequeue();
        qll.display();
        qll.dequeue();
        qll.display();
        qll.dequeue();
        qll.display();
        qll.dequeue();
        qll.display();
        qll.dequeue();
        qll.display();
        // qll.dequeue();
        // qll.display();
    }
}
