public class queueimplementation {
    private static Object[] queuearray;
    private static int size;
    private static int front;
    private static int rear;
    public queueimplementation(int size){
        this.size=size;
        this.front=-1;
        this.rear=-1;
        queuearray=new Object[size];
    }
    public void enqueue(Object value){
        if(rear==size-1){
            System.out.println("Queue is full");
        }
        else if(front==-1 && rear==-1){
            front=rear=0;
            queuearray[rear]=value;
        }
        else{
            rear++;
            queuearray[rear]=value;
        }
    }
    public Object dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        else if(front==rear){
            front=rear=-1;
            return 0;
        }
        else {
            int oldfront=front;
            front++;
            queuearray[oldfront]=null;
            return queuearray[oldfront];
        }
    }
    public void peek(){
        System.out.println(queuearray[front]);
    }
    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.println(queuearray[i]);
            }
        }
    }

    public static void main(String args[]){
        queueimplementation queue=new queueimplementation(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.display();



    }
}
